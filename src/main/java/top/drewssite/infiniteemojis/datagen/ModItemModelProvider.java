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

    simpleItem(ModItems.FACE);
    simpleItem(EyeItems.EYES);
    simpleItem(ModItems.SMILE);
    // more items here

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
