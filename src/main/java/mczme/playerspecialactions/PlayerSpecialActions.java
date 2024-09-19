package mczme.playerspecialactions;

import com.mojang.logging.LogUtils;
import mczme.playerspecialactions.common.registry.ModCreateTabs;
import mczme.playerspecialactions.common.registry.ModItems;
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
    }
}
