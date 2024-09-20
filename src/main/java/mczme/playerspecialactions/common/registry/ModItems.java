package mczme.playerspecialactions.common.registry;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.common.item.testItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PlayerSpecialActions.MODID);
    public static final List<Supplier<Item>> ITEMS_LIST = new ArrayList<>();

    public static final Supplier<Item> ITEM_TEST = registerWithCreateTab("item_test", () -> new testItem(new Item.Properties()));
    public static final Supplier<Item> TEST_BLOCK = registerWithCreateTab("test_block", () -> new BlockItem(ModBlocks.TEST_BLOCK.get(),new Item.Properties()));

    private static Supplier<Item> registerWithCreateTab(String item_name, Supplier<Item> itemSupplier) {
        Supplier<Item> item = ITEMS.register(item_name, itemSupplier);
        ITEMS_LIST.add(item);
        return item;
    }

    private static Supplier<Item> register(String item_name, Supplier<Item> itemSupplier) {
        return ITEMS.register(item_name, itemSupplier);
    }

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
