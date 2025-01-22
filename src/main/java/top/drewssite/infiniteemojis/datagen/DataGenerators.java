package top.drewssite.infiniteemojis.datagen;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import top.drewssite.infiniteemojis.InfiniteEmojis;

/**
 * This class contains information relating to the
 * data generation system as a whole in the scope of the mod.
 */
@EventBusSubscriber(modid = InfiniteEmojis.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

  /**
   * This method is called when running the data generation,
   * and creates all the data providers that are specified in
   * other files in this package.
   *
   * @param event The event to run this method at.
   */
  @SubscribeEvent
  public static void gatherData(GatherDataEvent event) {
    // Create references to some things we will need later on
    DataGenerator generator = event.getGenerator();
    PackOutput packOutput = generator.getPackOutput();
    ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
    CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

    /*
     * Add data providers
     */

    // recipe & loot table providers (data, server-side)
    generator.addProvider(event.includeServer(),
        new ModRecipeProvider(packOutput, lookupProvider));
    generator.addProvider(event.includeServer(),
        ModLootTableProvider.create(packOutput, lookupProvider));

    // model & block state providers (assets, client-side)
    generator.addProvider(event.includeClient(),
        new ModBlockStateProvider(packOutput));
    generator.addProvider(event.includeClient(),
        new ModItemModelProvider(packOutput));

    // tag providers (data, server-side)
    ModBlockTagProvider modBlockTagProvider = generator.addProvider(event.includeServer(),
        new ModBlockTagProvider(packOutput, lookupProvider));
    generator.addProvider(event.includeServer(),
        new ModItemTagsProvider(packOutput, lookupProvider, modBlockTagProvider.contentsGetter()));
  }
}
