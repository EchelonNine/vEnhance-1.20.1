package v.enhance.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import v.enhance.VEnhance;
import v.enhance.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup VENHANCE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VEnhance.MOD_ID, "brimsteel_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.venhance_items"))
                    .icon(() -> new ItemStack(ModItems.BRIMSTEEL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BRIMSTEEL_INGOT);
                        entries.add(ModItems.BRIMSTEEL_SWORD);

                    }).build());
    public static final ItemGroup VENHANCE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VEnhance.MOD_ID, "brimsteel_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.venhance_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.BRIMSTEEL_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BRIMSTEEL_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        VEnhance.LOGGER.info("Registering Item Groups for" + VEnhance.MOD_ID);
    }

}
