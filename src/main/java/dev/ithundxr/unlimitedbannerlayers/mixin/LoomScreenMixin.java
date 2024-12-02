package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(net.minecraft.client.gui.screens.inventory.LoomScreen.class)
public class LoomScreenMixin {
    @ModifyConstant(method = "containerChanged", constant = @Constant(intValue = 6))
    private int getLimit(int original) {
        return Config.maxLayerLimit;
    }
}
