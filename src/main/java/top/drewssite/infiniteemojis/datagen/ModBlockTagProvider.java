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
import top.drewssite.infiniteemojis.item.EmojiBlocks;

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

  }

}
