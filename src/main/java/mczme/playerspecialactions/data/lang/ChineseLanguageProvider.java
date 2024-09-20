package mczme.playerspecialactions.data.lang;

import mczme.playerspecialactions.PlayerSpecialActions;
import mczme.playerspecialactions.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput output) {
        super(output, PlayerSpecialActions.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add("playerspecialactions.playerspecialactions_tab","玩家特殊动作");
        add(ModItems.ITEM_TEST.get(),"测试物品");
        add(ModItems.TEST_BLOCK.get(),"测试方块");
    }
}
