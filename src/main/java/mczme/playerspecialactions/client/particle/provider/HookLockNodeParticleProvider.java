package mczme.playerspecialactions.client.particle.provider;

import mczme.playerspecialactions.client.particle.HookLockNodeParticle;
import mczme.playerspecialactions.client.particle.options.HookLockNodeParticleOptions;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import org.jetbrains.annotations.Nullable;

public class HookLockNodeParticleProvider implements ParticleProvider<HookLockNodeParticleOptions> {

    private final SpriteSet spriteSet;

    public HookLockNodeParticleProvider(SpriteSet spriteSet) {
        this.spriteSet = spriteSet;
    }

    @Nullable
    @Override
    public Particle createParticle(HookLockNodeParticleOptions type, ClientLevel level, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        return new HookLockNodeParticle(level, x, y, z, spriteSet);
    }
}
