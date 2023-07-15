package v.enhance;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import v.enhance.block.ModBlocks;
import v.enhance.item.ModItemGroups;
import v.enhance.item.ModItems;

public class VEnhance implements ModInitializer {
	public static final String MOD_ID = "venhance";
    public static final Logger LOGGER = LoggerFactory.getLogger("venhance");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}