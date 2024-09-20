package mczme.playerspecialactions.common.block.entiity;

import mczme.playerspecialactions.common.registry.ModBlcokEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class testBE extends BlockEntity {

    private boolean flag = false;

    public testBE(BlockPos pos, BlockState blockState) {
        super(ModBlcokEntityTypes.TEST_BE.get(), pos, blockState);
    }

    public void setFlag() {
        flag = !flag;
    }

    public boolean getFlag() {
        return flag;
    }

    public static <T extends BlockEntity> void tick(Level level, BlockPos pos, BlockState blockState, T t) {
        if (true) {
            testBE blockEntity = (testBE) t;
            if (blockEntity.getFlag()) {
                Player armorStand = level.getNearestPlayer(pos.getX(),pos.getY(), pos.getZ(), 5,false);
                if (armorStand != null) {
                    Vec3 v0 = pos.getBottomCenter().vectorTo(armorStand.blockPosition().getBottomCenter());
                    double r = v0.x * v0.x + v0.z * v0.z;
                    double sin = v0.z / Mth.sqrt((float) r);
                    double cos = v0.x / Mth.sqrt((float) r);
                    Vec3 v1 = new Vec3(sin, 0, cos).yRot(90);
                    float v = 1F;
//                    armorStand.setDeltaMovement(v*v1.z, 2, v*v1.x);
                    level.players().get(0).setDeltaMovement(new Vec3(v*v1.z, 0, v*v1.x));
                }
            }
        }
    }
}
