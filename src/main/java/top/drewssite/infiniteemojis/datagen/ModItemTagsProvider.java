package top.drewssite.infiniteemojis.datagen;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;

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

    // nothing here, yet...

  }

}
