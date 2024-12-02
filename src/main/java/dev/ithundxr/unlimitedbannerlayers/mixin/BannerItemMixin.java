package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(net.minecraft.world.item.BannerItem.class)
public class BannerItemMixin {
    @ModifyConstant(method = "appendHoverTextFromBannerBlockEntityTag", constant = @Constant(intValue = 6))
    private static int getLimit(int original) {
        return Config.maxLayerLimit;
    }
}