package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.UnlimitedBannerLayers;
import net.minecraft.screen.LoomScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LoomScreenHandler.class)
public class LoomScreenHandlerMixin {
    @ModifyConstant(method = "onContentChanged", constant = @Constant(intValue = 6))
    private static int getLimit(int limit) {
        return UnlimitedBannerLayers.CONFIG.maxLayerLimit();
    }
}
