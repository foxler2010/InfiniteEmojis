package top.drewssite.infiniteemojis.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.block.EmojiBlocks;
import top.drewssite.infiniteemojis.block.ModBlocks;

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

    // BlockState for EMO_LOG
    logBlock((RotatedPillarBlock) ModBlocks.EMO_LOG.get());
    // BlockItem for EMO_LOG
    blockItem(ModBlocks.EMO_LOG);

    // BlockState for EMO_WOOD
    axisBlock(
        (RotatedPillarBlock) ModBlocks.EMO_WOOD.get(),
        // sides and top/bottom are all just the log texture
        blockTexture(ModBlocks.EMO_LOG.get()),
        blockTexture(ModBlocks.EMO_LOG.get()));
    // BlockItem for EMO_WOOD
    blockItem(ModBlocks.EMO_WOOD);

    // BlockState for STRIPPED_EMO_LOG
    axisBlock(
        (RotatedPillarBlock) ModBlocks.STRIPPED_EMO_LOG.get(),
        // sides are the stripped log texture
        blockTexture(ModBlocks.STRIPPED_EMO_LOG.get()),
        // top/bottom is the stripped log top texture
        new ResourceLocation(
            InfiniteEmojis.MOD_ID,
            "block/stripped_emo_log_top"));
    // BlockItem for STRIPPED_EMO_LOG
    blockItem(ModBlocks.STRIPPED_EMO_LOG);

    // BlockState for STRIPPED_EMO_WOOD
    axisBlock(
        (RotatedPillarBlock) ModBlocks.STRIPPED_EMO_WOOD.get(),
        // sides and top/bottom are all just the stripped wood texture
        blockTexture(ModBlocks.STRIPPED_EMO_LOG.get()),
        blockTexture(ModBlocks.STRIPPED_EMO_LOG.get()));
    // BlockItem for STRIPPED_EMO_WOOD
    blockItem(ModBlocks.STRIPPED_EMO_WOOD);

    //BlockState & BlockItem for EMO_PLANKS
    blockWithItem(ModBlocks.EMO_PLANKS);

  }

  private void leavesBlock(RegistryObject<Block> blockRegistryObject) {

    simpleBlockWithItem(
        blockRegistryObject.get(),
        models()
            .singleTexture(
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                new ResourceLocation("minecraft:block/leaves"),
                "all",
                blockTexture(blockRegistryObject.get()))
            .renderType("cutout"));

  }

  /**
   * Helper method to create BlockItem models.
   *
   * @param blockRegistryObject RegistryObject to create the BlockItem model from.
   */
  private void blockItem(RegistryObject<Block> blockRegistryObject) {

    simpleBlockItem(
        blockRegistryObject.get(),
        new ModelFile.UncheckedModelFile(
            InfiniteEmojis.MOD_ID
                + ":block/"
                + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));

  }

  /**
   * Helper method to make creating simple BlockStates and BlockItem models easier.
   *
   * @param blockRegistryObject RegistryObject of Block to create BlockState
   *                            and BlockItem model for.
   */
  private void blockWithItem(RegistryObject<Block> blockRegistryObject) {

    simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

  }

}
