package top.drewssite.infiniteemojis.datagen;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import top.drewssite.infiniteemojis.block.ModBlocks;

/**
 * Provider of item tags for blocks added by the mod.
 */
public class ModItemTagsProvider extends ItemTagsProvider {

  /**
   * Constructor for ModItemTagsProvider
   *
   * @param output PackOutput
   * @param lookupProvider CompletableFuture<HolderLookup.Provider>
   * @param blockTags CompletableFuture<TagLookup<Block>>
   */
  public ModItemTagsProvider(
      PackOutput output,
      CompletableFuture<HolderLookup.Provider> lookupProvider,
      CompletableFuture<TagLookup<Block>> blockTags) {

    super(output, lookupProvider, blockTags);

  }

  /**
   * Adds item tags.
   *
   * @param provider HolderLookup.Provider
   */
  @Override
  protected void addTags(HolderLookup.Provider provider) {

    this.tag(ItemTags.LOGS_THAT_BURN)
        .add(ModBlocks.EMO_LOG.get().asItem())
        .add(ModBlocks.EMO_WOOD.get().asItem())
        .add(ModBlocks.STRIPPED_EMO_LOG.get().asItem())
        .add(ModBlocks.STRIPPED_EMO_WOOD.get().asItem());

    // This tag allows planks to be used to craft
    // all non-wood-specific items
    // (sticks, crafting tables, chests, etc.)
    this.tag(ItemTags.PLANKS)
        .add(ModBlocks.EMO_PLANKS.get().asItem());

  }

}
