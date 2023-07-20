package dev.ithundxr.unlimitedbannerlayers.mixin;

import dev.ithundxr.unlimitedbannerlayers.UnlimitedBannerLayers;
import net.minecraft.recipe.BannerDuplicateRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BannerDuplicateRecipe.class)
public class BannerDuplicateRecipeMixin {

    @ModifyConstant(method = "matches(Lnet/minecraft/inventory/RecipeInputInventory;Lnet/minecraft/world/World;)Z", constant = @Constant(intValue = 6))
    public int getLimitMatches(int limit) {
        return UnlimitedBannerLayers.CONFIG.maxLayerLimit();
    }

    @ModifyConstant(method = "craft(Lnet/minecraft/inventory/RecipeInputInventory;Lnet/minecraft/registry/DynamicRegistryManager;)Lnet/minecraft/item/ItemStack;", constant = @Constant(intValue = 6))
    public int getLimitCraft(int limit) {
        return UnlimitedBannerLayers.CONFIG.maxLayerLimit();
    }
}