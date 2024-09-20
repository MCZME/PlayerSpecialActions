package mczme.playerspecialactions.data;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.common.registry.ModParticleTypes;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.ParticleDescriptionProvider;

public class ModParticleDescriptionProvider extends ParticleDescriptionProvider {
    /**
     * Creates an instance of the data provider.
     *
     * @param output     the expected root directory the data generator outputs to
     * @param fileHelper the helper used to validate a texture's existence
     */
    protected ModParticleDescriptionProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, fileHelper);
    }

    @Override
    protected void addDescriptions() {
        sprite(ModParticleTypes.HOOK_LOCK_NODE_PARTICLE.get(), ResourceLocation.fromNamespaceAndPath(PlayerSpecialActions.MODID, "hook_lock_node_particle"));
    }
}
