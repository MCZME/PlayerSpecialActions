package mczme.playerspecialactions.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import mczme.playerspecialactions.common.entity.HookLockNodeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class HookLockNodeER extends EntityRenderer<HookLockNodeEntity> {


    public HookLockNodeER(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(HookLockNodeEntity entity) {
        return null;
    }

    @Override
    public void render(HookLockNodeEntity pEntity, float entityYaw, float partialTick, PoseStack pPoseStack, MultiBufferSource bufferSource, int pPackedLight) {
        super.render(pEntity, entityYaw, partialTick, pPoseStack, bufferSource, pPackedLight);
    }
}
