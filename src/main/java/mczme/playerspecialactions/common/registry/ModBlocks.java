package mczme.playerspecialactions.common.registry;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.common.block.testBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK,PlayerSpecialActions.MODID);

    public static final DeferredHolder<Block, testBlock> TEST_BLOCK = BLOCKS.register("test_block", ()->new testBlock(Block.Properties.of().strength(1.0f, 1.0f)));

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
