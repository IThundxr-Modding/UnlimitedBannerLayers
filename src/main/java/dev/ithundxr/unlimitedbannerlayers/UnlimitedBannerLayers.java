package dev.ithundxr.unlimitedbannerlayers;

import dev.ithundxr.unlimitedbannerlayers.UBLConfig;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UnlimitedBannerLayers implements ModInitializer {
    public static final String MOD_ID = "unlimitedbannerlayers";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    // Use owo-lib for config
    public static final UBLConfig CONFIG = UBLConfig.createAndLoad();

    @Override
    public void onInitialize() {
        UnlimitedBannerLayers.LOGGER.info("{} has been Initialized", MOD_ID);
    }
}
