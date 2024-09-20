package mczme.playerspecialactions.data;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.data.lang.ChineseLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = PlayerSpecialActions.MODID)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        // Data generators may require some of these as constructor parameters.
        // See below for more details on each of these.
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Particle the provider.
        generator.addProvider(
                event.includeClient(),
                new ModParticleDescriptionProvider(output, existingFileHelper)
        );
        // Language the provider.
        generator.addProvider(
                event.includeClient(),
                new ChineseLanguageProvider(output)
        );
    }
}
