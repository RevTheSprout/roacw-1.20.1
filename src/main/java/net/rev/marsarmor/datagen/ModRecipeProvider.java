package net.rev.marsarmor.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rev.marsarmor.MarsArmor;
import net.rev.marsarmor.registeries.MarsArmorBlocks;
import net.rev.marsarmor.registeries.MarsItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> AURIC_SMELTABLES = List.of(MarsItems.RAW_AURIC.get(),
            MarsArmorBlocks.AURIC_ORE.get(), MarsArmorBlocks.DEEPSLATE_AURIC_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, AURIC_SMELTABLES, RecipeCategory.MISC, MarsItems.AURIC_INGOT.get(), 0.25F, 100, "auric");
        oreSmelting(pWriter, AURIC_SMELTABLES, RecipeCategory.MISC, MarsItems.AURIC_INGOT.get(), 0.25F, 100, "auric");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MarsArmorBlocks.AURIC_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', MarsItems.AURIC_INGOT.get())
                .unlockedBy(getHasName(MarsItems.AURIC_INGOT.get()), has(MarsItems.AURIC_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MarsItems.AURIC_INGOT.get(), 9)
                .requires(MarsArmorBlocks.AURIC_BLOCK.get())
                .unlockedBy(getHasName(MarsArmorBlocks.AURIC_BLOCK.get()), has(MarsArmorBlocks.AURIC_BLOCK.get()))
                .save(pWriter);
    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  MarsArmor.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
