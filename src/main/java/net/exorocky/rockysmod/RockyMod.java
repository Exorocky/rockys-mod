package net.exorocky.rockysmod;

import net.exorocky.rockysmod.block.ModBlocks;
import net.exorocky.rockysmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RockyMod implements ModInitializer {
	public static final String MOD_ID = "rockysmod";
	public static final Logger LOGGER = LogManager.getLogger(RockyMod.MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
