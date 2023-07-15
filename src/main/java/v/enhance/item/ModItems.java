package v.enhance.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import v.enhance.VEnhance;
import v.enhance.item.custom.tooltippedItemsItem;

public class ModItems {
    public static final Item BRIMSTEEL_INGOT = registerItem("brimsteel_ingot", new Item(new FabricItemSettings()));
    public static final Item BRIMSTEEL_SWORD = registerItem("brimsteel_sword", new tooltippedItemsItem(new FabricItemSettings()));


    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VEnhance.MOD_ID, name), item);
    }
    public static void registerModItems() {
        VEnhance.LOGGER.info("Registering Mod Items for" + VEnhance.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }

}
