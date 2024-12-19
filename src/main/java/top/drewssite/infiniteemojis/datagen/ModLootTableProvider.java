package top.drewssite.infiniteemojis.datagen;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import top.drewssite.infiniteemojis.datagen.loot.ModBlockLootTables;

/**
 * Provider of loot tables for the mod.
 */
public class ModLootTableProvider {

  /**
   * Returns a new LootTableProvider that provides loot tables for
   * blocks added by this mod.
   *
   * @param output PackOutput
   * @param lookupProvider CompletableFuture<HolderLookup.Provider>
   * @return new LootTableProvider for use by this mod during datagen.
   */
  public static LootTableProvider create(
      PackOutput output,
      CompletableFuture<HolderLookup.Provider> lookupProvider) {

    return new LootTableProvider(
        output,
        Set.of(),
        List.of(
            new LootTableProvider.SubProviderEntry(
                ModBlockLootTables::new,
                LootContextParamSets.BLOCK)),
        lookupProvider);

  }


}
