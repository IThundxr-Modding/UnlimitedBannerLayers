package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.Config;
import dev.ithundxr.unlimitedbannerlayers.UnlimitedBannerLayers;
import net.minecraft.item.BannerItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BannerItem.class)
public class BannerItemMixin {
    @ModifyConstant(method = "appendBannerTooltip", constant = @Constant(intValue = 6))
    private static int getLimit(int limit) {
        return Config.maxLayerLimit;
    }
}