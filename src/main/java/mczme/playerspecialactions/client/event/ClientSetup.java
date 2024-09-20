package mczme.playerspecialactions.client.event;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.client.particle.provider.HookLockNodeParticleProvider;
import mczme.playerspecialactions.client.render.HookLockNodeER;
import mczme.playerspecialactions.common.registry.ModEntityTypes;
import mczme.playerspecialactions.common.registry.ModParticleTypes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

@EventBusSubscriber(modid = PlayerSpecialActions.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

//    实体渲染
    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.HOOK_LOCK_NODE_ENTITY.get(), HookLockNodeER::new);
    }

//    粒子
    @SubscribeEvent
    public static void registerParticleProviders(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticleTypes.HOOK_LOCK_NODE_PARTICLE.get(), HookLockNodeParticleProvider::new);

    }

}
