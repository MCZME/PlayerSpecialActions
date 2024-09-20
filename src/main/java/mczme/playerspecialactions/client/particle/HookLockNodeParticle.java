package mczme.playerspecialactions.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;

public class HookLockNodeParticle extends TextureSheetParticle {

    private final SpriteSet spriteSet;

    public HookLockNodeParticle(ClientLevel level, double x, double y, double z, SpriteSet spriteSet) {
        super(level, x, y, z);
        this.gravity = 0.0F;
        this.spriteSet = spriteSet;
        this.lifetime = 20;
        this.quadSize = 0.5F;
        this.hasPhysics = true;

        this.setSpriteFromAge(spriteSet);

    }

    @Override
    public void tick() {this.setSpriteFromAge(spriteSet);
        super.tick();
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }
}
