package top.drewssite.infiniteemojis.datagen;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.block.EmojiBlocks;
import top.drewssite.infiniteemojis.block.ModBlocks;

/**
 * Provider of block tags for blocks added by the mod.
 */
public class ModBlockTagProvider extends BlockTagsProvider {

  /**
   * Constructor for ModBlockTagProvider.
   *
   * @param output PackOutput
   * @param lookupProvider CompletableFuture<HolderLookup.Provider>
   * @param existingFileHelper ExistingFileHelper
   */
  public ModBlockTagProvider(
      PackOutput output,
      CompletableFuture<HolderLookup.Provider> lookupProvider,
      @Nullable ExistingFileHelper existingFileHelper) {

    super(output, lookupProvider, InfiniteEmojis.MOD_ID, existingFileHelper);

  }

  /**
   * Registers blocks for block tag creation.
   */
  @Override
  protected void addTags(HolderLookup.Provider provider) {

    // Register tags
    IntrinsicTagAppender<Block> needsStoneTool = this.tag(BlockTags.NEEDS_STONE_TOOL);
    IntrinsicTagAppender<Block> mineableWithPickaxe = this.tag(BlockTags.MINEABLE_WITH_PICKAXE);

    // Loops thru all emoji blocks and adds them to the tag
    for (RegistryObject<Block> block : EmojiBlocks.EMOJI_BLOCKS.getEntries()) {

      needsStoneTool.add(block.get());
      mineableWithPickaxe.add(block.get());

    }

    this.tag(BlockTags.LOGS)
        .add(ModBlocks.EMO_LOG.get())
        .add(ModBlocks.EMO_WOOD.get())
        .add(ModBlocks.STRIPPED_EMO_LOG.get())
        .add(ModBlocks.STRIPPED_EMO_WOOD.get());
    
    this.tag(BlockTags.LOGS_THAT_BURN)
        .add(ModBlocks.EMO_LOG.get())
        .add(ModBlocks.EMO_WOOD.get())
        .add(ModBlocks.STRIPPED_EMO_LOG.get())
        .add(ModBlocks.STRIPPED_EMO_WOOD.get());

    // this tag makes the destroy time the same as
    // regular wood blocks, and
    this.tag(BlockTags.MINEABLE_WITH_AXE)
        .add(ModBlocks.EMO_LOG.get())
        .add(ModBlocks.EMO_WOOD.get())
        .add(ModBlocks.STRIPPED_EMO_LOG.get())
        .add(ModBlocks.STRIPPED_EMO_WOOD.get())
        .add(ModBlocks.EMO_PLANKS.get())
        .add(ModBlocks.EMO_STAIRS.get())
        .add(ModBlocks.EMO_SLAB.get())
        .add(ModBlocks.EMO_BUTTON.get())
        .add(ModBlocks.EMO_PRESSURE_PLATE.get())
        .add(ModBlocks.EMO_FENCE.get())
        .add(ModBlocks.EMO_FENCE_GATE.get())
        .add(ModBlocks.EMO_DOOR.get())
        .add(ModBlocks.EMO_TRAPDOOR.get());

    // This tag allows planks to be used to craft
    // all non-wood-specific items
    // (sticks, crafting tables, chests, etc.)
    this.tag(BlockTags.PLANKS)
        .add(ModBlocks.EMO_PLANKS.get());

    /*
     * All other applicable tags (based on name) from BlockTags
     */

    this.tag(BlockTags.STAIRS)
        .add(ModBlocks.EMO_STAIRS.get());

    this.tag(BlockTags.WOODEN_STAIRS)
        .add(ModBlocks.EMO_STAIRS.get());

    this.tag(BlockTags.SLABS)
        .add(ModBlocks.EMO_SLAB.get());

    this.tag(BlockTags.WOODEN_SLABS)
        .add(ModBlocks.EMO_SLAB.get());

    // Ensures fences connect to each other.
    this.tag(BlockTags.FENCES)
        .add(ModBlocks.EMO_FENCE.get());

    this.tag(BlockTags.WOODEN_FENCES)
        .add(ModBlocks.EMO_FENCE.get());

    // Ensures fence gates connect to each other.
    this.tag(BlockTags.FENCE_GATES)
        .add(ModBlocks.EMO_FENCE_GATE.get());

    this.tag(BlockTags.BUTTONS)
        .add(ModBlocks.EMO_BUTTON.get());

    this.tag(BlockTags.WOODEN_BUTTONS)
        .add(ModBlocks.EMO_BUTTON.get());

    this.tag(BlockTags.PRESSURE_PLATES)
        .add(ModBlocks.EMO_PRESSURE_PLATE.get());

    this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
        .add(ModBlocks.EMO_PRESSURE_PLATE.get());

    this.tag(BlockTags.DOORS)
        .add(ModBlocks.EMO_DOOR.get());

    this.tag(BlockTags.WOODEN_DOORS)
        .add(ModBlocks.EMO_DOOR.get());

    this.tag(BlockTags.TRAPDOORS)
        .add(ModBlocks.EMO_TRAPDOOR.get());

    this.tag(BlockTags.WOODEN_TRAPDOORS)
        .add(ModBlocks.EMO_TRAPDOOR.get());

    this.tag(BlockTags.LEAVES)
        .add(ModBlocks.EMO_LEAVES.get());

  }

}
