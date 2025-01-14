package top.drewssite.infiniteemojis.datagen;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.block.ModBlocks;
import top.drewssite.infiniteemojis.item.EmojiItems;
import top.drewssite.infiniteemojis.item.EyeItems;
import top.drewssite.infiniteemojis.item.ModItems;
import top.drewssite.infiniteemojis.item.MouthItems;

/**
 * Provider of item models for items added by the mod.
 */
public class ModItemModelProvider extends ItemModelProvider {

  /**
   * Constructor for ModItemModelProvider.
   *
   * @param output PackOutput
   * @param existingFileHelper ExistingFileHelper
   */
  public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {

    super(output, InfiniteEmojis.MOD_ID, existingFileHelper);

  }

  /**
   * Registers items for item model creation.
   */
  @Override
  protected void registerModels() {

    // ModItems
    simpleItem(ModItems.FACE);
    simpleItem(ModItems.METAL_DETECTOR);

    // MouthItems
    for (RegistryObject<Item> item : MouthItems.MOUTH_ITEMS.getEntries()) {

      simpleItem(item);

    }

    // EyeItems
    for (RegistryObject<Item> item : EyeItems.EYE_ITEMS.getEntries()) {

      simpleItem(item);

    }

    // EmojiItems
    for (RegistryObject<Item> item : EmojiItems.EMOJI_ITEMS.getEntries()) {

      simpleItem(item);

    }

    // 1.20.6 allows to use these methods to create item models.
    fenceInventory("emo_fence", modLoc("block/emo_planks"));
    buttonInventory("emo_button", modLoc("block/emo_planks"));
    trapdoorBottom("emo_trapdoor", modLoc("block/emo_trapdoor"));

    simpleBlockItem(ModBlocks.EMO_DOOR);

  }

  /**
   * Helper method for creating a simple "item/generated" model.
   *
   * @param item Item to generate the simple ItemModelBuilder for
   * @return an ItemModelBuilder
   */
  @CanIgnoreReturnValue
  private ItemModelBuilder simpleItem(RegistryObject<Item> item) {

    return withExistingParent(item.getId().getPath(),
        new ResourceLocation("item/generated")).texture("layer0",
          new ResourceLocation(InfiniteEmojis.MOD_ID, "item/" + item.getId().getPath()));

  }

  /**
   * Helper method for creating a simple "item/generated" model for a block.
   *
   * @param block Block to generate the simple ItemModelBuilder for
   * @return an ItemModelBuilder
   */
  @CanIgnoreReturnValue
  private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {

    return withExistingParent(block.getId().getPath(),
        new ResourceLocation("item/generated")).texture("layer0",
          new ResourceLocation(InfiniteEmojis.MOD_ID, "item/" + block.getId().getPath()));

  }

}
