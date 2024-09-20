package mczme.playerspecialactions.common.action;

import mczme.playerspecialactions.client.particle.options.HookLockNodeParticleOptions;
import mczme.playerspecialactions.common.entity.HookLockNodeEntity;
import mczme.playerspecialactions.common.registry.ModEntityTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.Random;

public class Kinich {

    Random random = new Random();

    public void ElementalSkill(Player pPlayer, Level pLevel) {
        Vec3 eye = pPlayer.getEyePosition();
        Vec3 look = pPlayer.getLookAngle().normalize();
        float height = random.nextFloat(0.5F,2.0F);
        float width = random.nextFloat(1.0F,2.5F);
        Vec3 pos = eye.add(look.x * width, height, look.z * width);

        List<Entity> Entity =  pLevel.getEntities(pPlayer, new AABB(eye.x - 5, eye.y-2 , eye.z - 5, eye.x + 5, eye.y + 2, eye.z + 5));
        LivingEntity livingEntity = null;
        for (Entity entity : Entity) {
            if (entity instanceof LivingEntity) {
                livingEntity = (LivingEntity) entity;
                break;
            }
        }

        if (livingEntity != null) {
            HookLockNodeEntity hookLockNodeEntity =  new HookLockNodeEntity(ModEntityTypes.HOOK_LOCK_NODE_ENTITY.get(),pLevel);
            hookLockNodeEntity.setLivingEntity(livingEntity);
            hookLockNodeEntity.setPlayer(pPlayer);
            hookLockNodeEntity.setPos(livingEntity.position());
            pLevel.addFreshEntity(hookLockNodeEntity);
        }else {
            pLevel.addParticle(new HookLockNodeParticleOptions(),pos.x,pos.y,pos.z, 0, 0, 0);
            pPlayer.setDeltaMovement(look.x*2,height,look.z*2);
        }
    }
}
