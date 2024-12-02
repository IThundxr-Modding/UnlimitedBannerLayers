package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.Config;
import net.minecraft.world.inventory.LoomMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LoomMenu.class)
public class LoomScreenHandlerMixin {
    @ModifyConstant(method = "slotsChanged", constant = @Constant(intValue = 6))
    private int getLimit(int original) {
        return Config.maxLayerLimit;
    }
}
