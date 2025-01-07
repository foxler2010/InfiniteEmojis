package top.drewssite.infiniteemojis.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.block.ModBlocks;
import top.drewssite.infiniteemojis.item.EmojiItems;
import top.drewssite.infiniteemojis.item.EyeItems;
import top.drewssite.infiniteemojis.item.ModItems;
import top.drewssite.infiniteemojis.item.MouthItems;

/**
 * Provider of recipes involving items added by the mod.
 */
public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

  /**
   * Constructor for ModRecipeProvider.
   *
   * @param output PackOutput
   * @param registries CompletableFuture
   */
  public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {

    super(output, registries);

  }

  @Override
  protected void buildRecipes(RecipeOutput recipeOutput) {

    /*
     * Grinning Face
     * The regular "smiley" emoji
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.GRINNING_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.EYES.get())
        .requires(MouthItems.SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Grinning Face with Big Eyes
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.GRINNING_FACE_WITH_BIG_EYES.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.BIG_EYES.get())
        .requires(MouthItems.SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Grinning Face with Smiling Eyes
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.GRINNING_FACE_WITH_SMILING_EYES.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.SMILING_EYES.get())
        .requires(MouthItems.SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Beaming Face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.BEAMING_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.SMILING_EYES.get())
        .requires(MouthItems.BEAMING_SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Grinning Squinting Face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.GRINNING_SQUINTING_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.SQUINTING_EYES.get())
        .requires(MouthItems.SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Slightly Smiling face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.SLIGHTLY_SMILING_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.EYES.get())
        .requires(MouthItems.SLIGHT_SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Winking Face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.WINKING_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.WINKING_EYES.get())
        .requires(MouthItems.SLIGHT_SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Smiling Face with Smiling Eyes
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.SMILING_FACE_WITH_SMILING_EYES.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.SMILING_EYES.get())
        .requires(MouthItems.SLIGHT_SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Heart-eyed Face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.HEART_EYED_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.HEART_EYES.get())
        .requires(MouthItems.SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Star-struck Face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.STAR_STRUCK_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.STAR_EYES.get())
        .requires(MouthItems.SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Face Blowing a Kiss
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.FACE_BLOWING_A_KISS.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.WINKING_EYES.get())
        .requires(MouthItems.KISSING_MOUTH.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Kissing Face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.KISSING_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.EYES.get())
        .requires(MouthItems.KISSING_MOUTH.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Smiling Face with Closed Eyes
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.SMILING_FACE_WITH_CLOSED_EYES.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.CLOSED_EYES.get())
        .requires(MouthItems.SLIGHT_SMILE.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Kissing Face with Closed Eyes
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.KISSING_FACE_WITH_CLOSED_EYES.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.CLOSED_EYES.get())
        .requires(MouthItems.KISSING_MOUTH.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Kissing Face with Smiling Eyes
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.KISSING_FACE_WITH_SMILING_EYES.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.SMILING_EYES.get())
        .requires(MouthItems.KISSING_MOUTH.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Smirking Face
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            EmojiItems.SMIRKING_FACE.get())
        .requires(ModItems.FACE.get())
        .requires(EyeItems.SMIRKING_EYES.get())
        .requires(MouthItems.SMIRKING_MOUTH.get())
        .unlockedBy(getHasName(ModItems.FACE.get()), has(ModItems.FACE.get()))
        .save(recipeOutput);

    /*
     * Emo Planks from Emo Log
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            ModBlocks.EMO_PLANKS.get(), 4)
        .requires(ModBlocks.EMO_LOG.get())
        .unlockedBy(getHasName(ModBlocks.EMO_LOG.get()), has(ModBlocks.EMO_LOG.get()))
        .save(recipeOutput);

    /*
     * Emo Planks from Emo Wood
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            ModBlocks.EMO_PLANKS.get(), 4)
        .requires(ModBlocks.EMO_WOOD.get())
        .unlockedBy(getHasName(ModBlocks.EMO_LOG.get()), has(ModBlocks.EMO_LOG.get()))
        .save(recipeOutput, new ResourceLocation(
            InfiniteEmojis.MOD_ID + ":emo_planks_from_wood"));

    /*
     * Emo Planks from Stripped Emo Log
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            ModBlocks.EMO_PLANKS.get(), 4)
        .requires(ModBlocks.STRIPPED_EMO_LOG.get())
        .unlockedBy(getHasName(ModBlocks.EMO_LOG.get()), has(ModBlocks.EMO_LOG.get()))
        .save(recipeOutput, new ResourceLocation(
            InfiniteEmojis.MOD_ID + ":emo_planks_from_stripped_log"));

    /*
     * Emo Planks from Stripped Emo Wood
     */
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
            ModBlocks.EMO_PLANKS.get(), 4)
        .requires(ModBlocks.STRIPPED_EMO_WOOD.get())
        .unlockedBy(getHasName(ModBlocks.EMO_LOG.get()), has(ModBlocks.EMO_LOG.get()))
        .save(recipeOutput, new ResourceLocation(
            InfiniteEmojis.MOD_ID + ":emo_planks_from_stripped_wood"));

    /*
     * Face from Emo Planks
     */
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
        ModItems.FACE.get(), 9)
        .pattern("###")
        .pattern("###")
        .pattern("###")
        .define('#', ModBlocks.EMO_PLANKS.get())
        .unlockedBy(getHasName(ModBlocks.EMO_PLANKS.get()), has(ModBlocks.EMO_PLANKS.get()))
        .save(recipeOutput);

  }

  /**
   * Creates Furnace recipes.
   *
   * @param recipeOutput RecipeOutput
   * @param ingredients List of ItemLike
   * @param category RecipeCategory
   * @param result ItemLike
   * @param experience float
   * @param cookingTime int
   * @param group String
   */
  protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> ingredients,
                                    RecipeCategory category, ItemLike result, float experience,
                                    int cookingTime, String group) {

    oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, ingredients,
        category, result, experience, cookingTime, group, "_from_smelting");

  }

  /**
   * Creates Blast Furnace recipes.
   *
   * @param recipeOutput RecipeOutput
   * @param ingredients List of ItemLike
   * @param category RecipeCategory
   * @param result ItemLike
   * @param experience float
   * @param cookingTime int
   * @param group String
   */
  protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> ingredients,
                                    RecipeCategory category, ItemLike result, float experience,
                                    int cookingTime, String group) {

    oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, ingredients,
        category, result, experience, cookingTime, group, "_from_blasting");

  }

  /**
   * Helper method for creating ore cooking recipes.
   *
   * @param recipeOutput RecipeOutput
   * @param serializer RecipeSerializer
   * @param recipeFactory AbstractCookingRecipe.Factory
   * @param ingredients List of ItemLike
   * @param category RecipeCategory
   * @param result ItemLike
   * @param experience float
   * @param cookingTime int
   * @param group String
   * @param suffix String
   */
  private static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput,
                                                                   RecipeSerializer<T> serializer,
                                                                   AbstractCookingRecipe.Factory<T>
                                                                       recipeFactory,
                                                                   List<ItemLike> ingredients,
                                                                   RecipeCategory category,
                                                                   ItemLike result,
                                                                   float experience,
                                                                   int cookingTime,
                                                                   String group,
                                                                   String suffix) {

    for (ItemLike itemlike : ingredients) {

      SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, result,
          experience, cookingTime, serializer, recipeFactory)
          .group(group).unlockedBy(getHasName(itemlike), has(itemlike))
          .save(recipeOutput,
              InfiniteEmojis.MOD_ID + ":"
                  + getItemName(result) + suffix + "_" + getItemName(itemlike));

    }

  }

}
