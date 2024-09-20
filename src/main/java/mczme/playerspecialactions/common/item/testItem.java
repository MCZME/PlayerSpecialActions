package mczme.playerspecialactions.common.item;

import mczme.playerspecialactions.common.action.Kinich;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class testItem extends Item {
    public testItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand){
//        player.setDeltaMovement(10, 3, 2);
            Kinich kinich = new Kinich();
            kinich.ElementalSkill(player, level);
        return super.use(level, player, usedHand);
    }
}
