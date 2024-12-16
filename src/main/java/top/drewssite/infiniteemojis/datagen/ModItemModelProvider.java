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

    simpleItem(MouthItems.SMILE);
    simpleItem(MouthItems.BEAMING_SMILE);
    simpleItem(MouthItems.SLIGHT_SMILE);
    simpleItem(MouthItems.SMALL_SMILE);
    simpleItem(MouthItems.KISSING_MOUTH);
    simpleItem(MouthItems.SMIRKING_MOUTH);
    simpleItem(MouthItems.YUM_MOUTH);
    simpleItem(MouthItems.TONGUE_MOUTH);
    simpleItem(MouthItems.MONEY_MOUTH);
    simpleItem(MouthItems.SURPRISED_MOUTH);
    simpleItem(MouthItems.THINKING_MOUTH);
    simpleItem(MouthItems.DROOLING_MOUTH);
    simpleItem(MouthItems.PARTY_MOUTH);
    simpleItem(MouthItems.BUCK_TOOTHED_MOUTH);

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
    simpleItem(EmojiItems.GRINNING_FACE_WITH_BIG_EYES);
    simpleItem(EmojiItems.GRINNING_FACE_WITH_SMILING_EYES);
    simpleItem(EmojiItems.BEAMING_FACE);
    simpleItem(EmojiItems.GRINNING_SQUINTING_FACE);
    simpleItem(EmojiItems.SLIGHTLY_SMILING_FACE);
    simpleItem(EmojiItems.WINKING_FACE);
    simpleItem(EmojiItems.SMILING_FACE_WITH_SMILING_EYES);
    simpleItem(EmojiItems.HEART_EYED_FACE);
    simpleItem(EmojiItems.STAR_STRUCK_FACE);
    simpleItem(EmojiItems.FACE_BLOWING_A_KISS);
    simpleItem(EmojiItems.KISSING_FACE);
    simpleItem(EmojiItems.SMILING_FACE_WITH_CLOSED_EYES);
    simpleItem(EmojiItems.KISSING_FACE_WITH_CLOSED_EYES);
    simpleItem(EmojiItems.KISSING_FACE_WITH_SMILING_EYES);
    simpleItem(EmojiItems.SMIRKING_FACE);

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
