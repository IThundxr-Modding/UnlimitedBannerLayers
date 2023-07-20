package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.Config;
import dev.ithundxr.unlimitedbannerlayers.UnlimitedBannerLayers;
import net.minecraft.client.gui.screen.ingame.LoomScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LoomScreen.class)
public class LoomScreenMixin {
    @ModifyConstant(method = "onInventoryChanged()V", constant = @Constant(intValue = 6))
    private int getLimit(int limit) {
        return Config.maxLayerLimit;
    }
}
