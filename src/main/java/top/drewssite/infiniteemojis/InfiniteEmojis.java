/*
 * Infinite Emojis
 * Author: drew@drewssite.top <Foxler2010>
 * Created: 11/25/24
 *
 * Infinite Emojis is a mod that adds emojis to Minecraft.
 */

package top.drewssite.infiniteemojis;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * Main mod class.
 */
@Mod(InfiniteEmojis.MODID)
public class InfiniteEmojis {

  // Define mod id in a common place for everything to reference
  public static final String MODID = "infiniteemojis";

  // Directly reference a slf4j logger
  private static final Logger LOGGER = LogUtils.getLogger();

  /**
   * Constructor for InfiniteEmojis class.
   */
  public InfiniteEmojis() {

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    // Register the commonSetup method for modloading
    modEventBus.addListener(this::commonSetup);

    // Register ourselves for server and other game events we are interested in
    MinecraftForge.EVENT_BUS.register(this);
        
  }

  /**
   * Common setup method.
   *
   * @param event Event this method is called at.
   */
  private void commonSetup(final FMLCommonSetupEvent event) {
        
    // Some common setup code
    LOGGER.info("HELLO FROM COMMON SETUP");
        
  }

  /**
   * You can use SubscribeEvent and let the Event Bus discover methods to call.
   */
  @SubscribeEvent
  public void onServerStarting(ServerStartingEvent event) {

    // Do something when the server starts
    LOGGER.info("HELLO from server starting");

  }

  /**
   * You can use EventBusSubscriber to automatically register all static methods
   * in the class annotated with @SubscribeEvent.
   */
  @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
  public static class ClientModEvents {

    /**
     * Client setup method.
     *
     * @param event Event this method is called at.
     */
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

      // Some client setup code
      LOGGER.info("HELLO FROM CLIENT SETUP");
      LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

    }

  }

}
