package mczme.playerspecialactions.client.particle.options;

import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import mczme.playerspecialactions.common.registry.ModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.network.codec.StreamCodec;

public class HookLockNodeParticleOptions implements ParticleOptions {

    public static final MapCodec<HookLockNodeParticleOptions> CODEC = MapCodec.unit(new HookLockNodeParticleOptions());

    public static final StreamCodec<ByteBuf, HookLockNodeParticleOptions> STREAM_CODEC = StreamCodec.unit(new HookLockNodeParticleOptions());


    @Override
    public ParticleType<?> getType() {
        return ModParticleTypes.HOOK_LOCK_NODE_PARTICLE.get();
    }
}
