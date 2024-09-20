package mczme.playerspecialactions.client.particle.type;

import com.mojang.serialization.MapCodec;
import mczme.playerspecialactions.client.particle.options.HookLockNodeParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.network.codec.StreamCodec;

public class HookLockNodeParticleType extends ParticleType<HookLockNodeParticleOptions>  {
    public HookLockNodeParticleType(boolean overrideLimitter) {
        super(overrideLimitter);
    }

    @Override
    public MapCodec codec() {
        return HookLockNodeParticleOptions.CODEC;
    }

    @Override
    public StreamCodec streamCodec() {
        return HookLockNodeParticleOptions.STREAM_CODEC;
    }
}
