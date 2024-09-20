package mczme.playerspecialactions;

import com.mojang.logging.LogUtils;
import mczme.playerspecialactions.common.registry.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(PlayerSpecialActions.MODID)
public class PlayerSpecialActions {
    public static final String MODID = "playerspecialactions";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PlayerSpecialActions(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.register(modEventBus);
        ModCreateTabs.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        ModParticleTypes.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlcokEntityTypes.register(modEventBus);
    }
}
