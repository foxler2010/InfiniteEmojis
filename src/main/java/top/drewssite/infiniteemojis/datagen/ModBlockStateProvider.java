package top.drewssite.infiniteemojis.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
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

      modCubeBlock(block);

    }

    // BlockState for EMO_LOG
    logBlock((RotatedPillarBlock) ModBlocks.EMO_LOG.get());
    // BlockItem for EMO_LOG
    modBlockItem(ModBlocks.EMO_LOG);

    // BlockState for EMO_WOOD
    axisBlock(
        (RotatedPillarBlock) ModBlocks.EMO_WOOD.get(),
        // sides and top/bottom are all just the log texture
        blockTexture(ModBlocks.EMO_LOG.get()),
        blockTexture(ModBlocks.EMO_LOG.get()));
    // BlockItem for EMO_WOOD
    modBlockItem(ModBlocks.EMO_WOOD);

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
    modBlockItem(ModBlocks.STRIPPED_EMO_LOG);

    // BlockState for STRIPPED_EMO_WOOD
    axisBlock(
        (RotatedPillarBlock) ModBlocks.STRIPPED_EMO_WOOD.get(),
        // sides and top/bottom are all just the stripped wood texture
        blockTexture(ModBlocks.STRIPPED_EMO_LOG.get()),
        blockTexture(ModBlocks.STRIPPED_EMO_LOG.get()));
    // BlockItem for STRIPPED_EMO_WOOD
    modBlockItem(ModBlocks.STRIPPED_EMO_WOOD);

    // BlockState & BlockItem for EMO_PLANKS
    modCubeBlock(ModBlocks.EMO_PLANKS);

    // BlockState for EMO_STAIRS
    stairsBlock(
        (StairBlock) ModBlocks.EMO_STAIRS.get(),
        blockTexture(ModBlocks.EMO_PLANKS.get()));
    // BlockItem for EMO_STAIRS
    modBlockItem(ModBlocks.EMO_STAIRS);

    // BlockState for EMO_SLAB
    slabBlock(
        (SlabBlock) ModBlocks.EMO_SLAB.get(),
        blockTexture(ModBlocks.EMO_PLANKS.get()),
        blockTexture(ModBlocks.EMO_PLANKS.get()));
    // BlockItem for EMO_SLAB
    modBlockItem(ModBlocks.EMO_SLAB);

    // BlockState for EMO_BUTTON
    buttonBlock(
        (ButtonBlock) ModBlocks.EMO_BUTTON.get(),
        blockTexture(ModBlocks.EMO_PLANKS.get()));
    // BlockItem is created in ModItemModelProvider

    // BlockState for EMO_PRESSURE_PLATE
    pressurePlateBlock(
        (PressurePlateBlock) ModBlocks.EMO_PRESSURE_PLATE.get(),
        blockTexture(ModBlocks.EMO_PLANKS.get()));
    // BlockItem for EMO_PRESSURE_PLATE
    modBlockItem(ModBlocks.EMO_PRESSURE_PLATE);

    // BlockState for EMO_FENCE
    fenceBlock(
        (FenceBlock) ModBlocks.EMO_FENCE.get(),
        blockTexture(ModBlocks.EMO_PLANKS.get()));
    // BlockItem is created in ModItemModelProvider

    // BlockState for EMO_FENCE_GATE
    fenceGateBlock(
        (FenceGateBlock) ModBlocks.EMO_FENCE_GATE.get(),
        blockTexture(ModBlocks.EMO_PLANKS.get()));
    // BlockItem for EMO_FENCE_GATE
    modBlockItem(ModBlocks.EMO_FENCE_GATE);

    // BlockState for EMO_DOOR
    doorBlockWithRenderType(
        (DoorBlock) ModBlocks.EMO_DOOR.get(),
        modLoc("block/emo_door_bottom"),
        modLoc("block/emo_door_top"),
        "cutout");
    // BlockItem is created in ModItemModelProvider

    // BlockState for EMO_TRAPDOOR
    trapdoorBlockWithRenderType(
        (TrapDoorBlock) ModBlocks.EMO_TRAPDOOR.get(),
        modLoc("block/emo_trapdoor"),
        true,
        "cutout");

    // BlockState & BlockItem for EMO_LEAVES
    leavesBlock(ModBlocks.EMO_LEAVES);

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
  private void modBlockItem(RegistryObject<Block> blockRegistryObject) {

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
  private void modCubeBlock(RegistryObject<Block> blockRegistryObject) {

    simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

  }

}
