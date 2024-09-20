package mczme.playerspecialactions.common.registry;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.common.entity.HookLockNodeEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, PlayerSpecialActions.MODID);

    public static final Supplier<EntityType<HookLockNodeEntity>> HOOK_LOCK_NODE_ENTITY = ENTITY_TYPES.register("hook_lock_node_entity",
            () -> EntityType.Builder.of(HookLockNodeEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).build("hook_lock_node_entity"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
