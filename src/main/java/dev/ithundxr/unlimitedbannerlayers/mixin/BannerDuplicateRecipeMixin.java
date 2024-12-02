package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.Config;
import net.minecraft.world.item.crafting.BannerDuplicateRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BannerDuplicateRecipe.class)
public class BannerDuplicateRecipeMixin {
    @ModifyConstant(method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", constant = @Constant(intValue = 6))
    public int getLimitMatches(int original) {
        return Config.maxLayerLimit;
    }

    @ModifyConstant(method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/item/ItemStack;", constant = @Constant(intValue = 6))
    public int getLimitCraft(int original) {
        return Config.maxLayerLimit;
    }
}