package mczme.playerspecialactions.common.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static mczme.playerspecialactions.PlayerSpecialActions.MODID;
import static mczme.playerspecialactions.common.registry.ModItems.ITEMS_LIST;

public class ModCreateTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("playerspecialactions_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("playerspecialactions.playerspecialactions_tab"))
            .displayItems((parameters, output) -> {
                ITEMS_LIST.forEach(item -> output.accept(item.get()));
            }).build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
