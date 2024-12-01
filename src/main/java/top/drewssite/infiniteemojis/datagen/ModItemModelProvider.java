package top.drewssite.infiniteemojis.datagen;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.item.EmojiItems;
import top.drewssite.infiniteemojis.item.EyeItems;
import top.drewssite.infiniteemojis.item.ModItems;

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

    simpleItem(ModItems.SMILE);
    simpleItem(ModItems.BEAMING_SMILE);
    simpleItem(ModItems.SLIGHT_SMILE);
    simpleItem(ModItems.SMALL_SMILE);
    simpleItem(ModItems.KISSING_MOUTH);
    simpleItem(ModItems.SMIRKING_MOUTH);
    simpleItem(ModItems.YUM_MOUTH);
    simpleItem(ModItems.TONGUE_MOUTH);
    simpleItem(ModItems.MONEY_MOUTH);
    simpleItem(ModItems.SURPRISED_MOUTH);
    simpleItem(ModItems.THINKING_MOUTH);
    simpleItem(ModItems.DROOLING_MOUTH);
    simpleItem(ModItems.PARTY_MOUTH);
    simpleItem(ModItems.BUCK_TOOTHED_MOUTH);

    simpleItem(ModItems.METAL_DETECTOR);

    //EyeItems
    simpleItem(EyeItems.EYES);
    simpleItem(EyeItems.BIG_EYES);
    simpleItem(EyeItems.SMILING_EYES);
    simpleItem(EyeItems.SQUINTING_EYES);
    simpleItem(EyeItems.WINKING_EYES);
    simpleItem(EyeItems.HEART_EYES);
    simpleItem(EyeItems.STAR_EYES);
    simpleItem(EyeItems.CLOSED_EYES);
    simpleItem(EyeItems.SMIRKING_EYES);
    simpleItem(EyeItems.ZANY_EYES);
    simpleItem(EyeItems.DOLLAR_EYES);
    simpleItem(EyeItems.BIG_EYEBROWS_UP_EYES);
    simpleItem(EyeItems.GLARING_EYES);
    simpleItem(EyeItems.THINKING_EYES);

    // EmojiItems
    simpleItem(EmojiItems.GRINNING_FACE);

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

}
