package dev.ithundxr.unlimitedbannerlayers;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UnlimitedBannerLayers implements ModInitializer {
    public static final String MOD_ID = "unlimitedbannerlayers";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MidnightConfig.init(MOD_ID, Config.class);

        UnlimitedBannerLayers.LOGGER.info("{} has been Initialized", MOD_ID);
    }
}
