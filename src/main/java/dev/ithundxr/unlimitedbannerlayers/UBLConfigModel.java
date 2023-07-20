package dev.ithundxr.unlimitedbannerlayers;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = UnlimitedBannerLayers.MOD_ID)
@Config(name = "ubl-config", wrapperName = "UBLConfig")
public class UBLConfigModel {
    public int maxLayerLimit = 16;
}