package dev.ithundxr.unlimitedbannerlayers;

import eu.midnightdust.lib.config.MidnightConfig;

public class Config extends MidnightConfig {
    @Entry(category = "numbers", min = 1)
    public static int maxLayerLimit = 16;
}