package net.exorocky.rockysmod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RockyMod implements ModInitializer {
	public static final String MOD_ID = "rockysmod";
	public static final Logger LOGGER = LogManager.getLogger(RockyMod.MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}