/*
 * Infinite Emojis
 * Author: drew@drewssite.top <Foxler2010>
 * Created: 11/25/24
 * Neoforge Port Created: 1/20/25
 *
 * Infinite Emojis is a mod that adds emojis to Minecraft.
 */

package top.drewssite.infiniteemojis;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import top.drewssite.infiniteemojis.block.EmojiBlocks;
import top.drewssite.infiniteemojis.block.ModBlocks;
import top.drewssite.infiniteemojis.item.*;

/**
 * Main mod class.
 */
@Mod(InfiniteEmojis.MOD_ID)
public class InfiniteEmojis {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "infiniteemojis";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    /**
     * The constructor for the mod class is the first code that is run when your mod is loaded.
     * FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
     */
    public InfiniteEmojis(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // General blocks added by the mod.
        ModBlocks.BLOCKS.register(modEventBus);
        // Emoji blocks added by the mod.
        EmojiBlocks.EMOJI_BLOCKS.register(modEventBus);
        // General items added by the mod.
        ModItems.ITEMS.register(modEventBus);
        // Emoji items added by the mod.
        EmojiItems.EMOJI_ITEMS.register(modEventBus);
        // "Eye"-type items added by the mod.
        EyeItems.EYE_ITEMS.register(modEventBus);
        // "Mouth"-type items added by the mod.
        MouthItems.MOUTH_ITEMS.register(modEventBus);
        // Creative mode tabs for the mod.
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (InfiniteEmojis) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
    }

    /**
     * Common setup method.
     *
     * @param event Event tyhis method is called at.
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
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
