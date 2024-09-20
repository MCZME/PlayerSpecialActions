package mczme.playerspecialactions.common.registry;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.common.block.entiity.testBE;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlcokEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, PlayerSpecialActions.MODID);

    public static final Supplier<BlockEntityType<testBE>> TEST_BE = BLOCK_ENTITY_TYPES.register("test_be", () ->
            BlockEntityType.Builder.of(testBE::new, ModBlocks.TEST_BLOCK.get()).build(null));

    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITY_TYPES.register(modEventBus);
    }
}
