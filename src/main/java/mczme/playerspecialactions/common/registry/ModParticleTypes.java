package mczme.playerspecialactions.common.registry;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.client.particle.type.HookLockNodeParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, PlayerSpecialActions.MODID);

    public static final DeferredHolder<ParticleType<?>, HookLockNodeParticleType> HOOK_LOCK_NODE_PARTICLE = PARTICLE_TYPES.register(
            "hook_lock_node_particle",
            () -> new HookLockNodeParticleType(false)
    );

    public static void register(IEventBus modEventBus) {
        PARTICLE_TYPES.register(modEventBus);
    }
}
