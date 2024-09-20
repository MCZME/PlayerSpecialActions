package mczme.playerspecialactions.common.entity;

import com.mojang.logging.LogUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.slf4j.Logger;

public class HookLockNodeEntity extends Entity {

    private static final Logger LOGGER = LogUtils.getLogger();
    private LivingEntity livingEntity;
    private Player player;
    private final int LifeTime = 20 * 20;
    private int time = 0;

    public HookLockNodeEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    public void setLivingEntity(LivingEntity livingEntity) {
        this.livingEntity = livingEntity;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compound) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compound) {

    }

    @Override
    public void tick() {
        if (this.livingEntity != null && !level().isClientSide) {
            time++;
            this.setPos(livingEntity.position());
            if (!this.livingEntity.isAlive() || (time > LifeTime)) {
                this.remove(RemovalReason.DISCARDED);
            }

        } else if (level().isClientSide) {
            Player player1 = level().getNearestPlayer(this,5);
            time++;
            if(player1 != null && time % 10 == 0) {
                Vec3 v0 = this.position().vectorTo(player1.position());
                double r = v0.x * v0.x + v0.z * v0.z;
                double sin = v0.z / Mth.sqrt((float) r);
                double cos = v0.x / Mth.sqrt((float) r);
                Vec3 v1 = new Vec3(sin, 0, cos).yRot(90);
                float v = 1F;
                player1.setDeltaMovement(new Vec3(v1.z * v, 0, v1.x * v));
            }
        }
        super.tick();
    }

}
