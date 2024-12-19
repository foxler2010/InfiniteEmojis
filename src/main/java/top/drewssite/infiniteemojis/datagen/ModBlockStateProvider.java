package top.drewssite.infiniteemojis.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.item.EmojiBlocks;

/**
 * Provider of block states for blocks added by the mod.
 */
public class ModBlockStateProvider extends BlockStateProvider {

  /**
   * Constructor for ModBlockStateProvider.
   *
   * @param output PackOutput
   * @param existingFileHelper ExistingFileHelper
   */
  public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {

    super(output, InfiniteEmojis.MOD_ID, existingFileHelper);

  }

  /**
   * Registers blocks for block state creation.
   */
  @Override
  protected void registerStatesAndModels() {

    // create a simple block with identical sides for each Emoji block
    for (RegistryObject<Block> block : EmojiBlocks.EMOJI_BLOCKS.getEntries()) {

      blockWithItem(block);

    }

    // there are no other types of blocks currently

  }

  /**
   * Helper method to make creating simple blocks easier.
   *
   * @param blockRegistryObject RegistryObject of Block to create BlockState for.
   */
  private void blockWithItem(RegistryObject<Block> blockRegistryObject) {

    simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

  }

}
