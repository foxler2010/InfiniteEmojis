package top.drewssite.infiniteemojis.datagen;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.drewssite.infiniteemojis.InfiniteEmojis;

/**
 * This class contains information relating to the
 * data generation system as a whole in the scope of the mod.
 */
@Mod.EventBusSubscriber(modid = InfiniteEmojis.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
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

    // create references to some things we will need later on
    DataGenerator generator = event.getGenerator();
    PackOutput packOutput = generator.getPackOutput();
    ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
    CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

    generator.addProvider(event.includeClient(), new ModRecipeProvider(packOutput, lookupProvider));
    generator.addProvider(event.includeClient(),
        new ModItemModelProvider(packOutput, existingFileHelper));

  }

}
