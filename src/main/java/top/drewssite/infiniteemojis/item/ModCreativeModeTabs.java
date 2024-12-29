package top.drewssite.infiniteemojis.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.block.EmojiBlocks;
import top.drewssite.infiniteemojis.block.ModBlocks;

/**
 * Creative mode tabs for the mod.
 */
public class ModCreativeModeTabs {

  /**
   * Register for creative mode tabs added by the mod.
   */
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
      DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfiniteEmojis.MOD_ID);

  @SuppressWarnings("unused")
  public static final RegistryObject<CreativeModeTab> INFINITE_EMOJIS_TAB =
      CREATIVE_MODE_TABS.register("infinite_emojis_tab", () -> CreativeModeTab.builder()
          .icon(() -> new ItemStack(EmojiItems.GRINNING_FACE.get()))
          .title(Component.translatable("creativetab.infinite_emojis_tab"))
          .displayItems((parameters, output) -> {

            // General Items
            output.accept(ModItems.FACE.get());
            output.accept(ModItems.METAL_DETECTOR.get());

            // General Blocks
            for (RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {

              output.accept(block.get());

            }

            // Eyes
            for (RegistryObject<Item> item : EyeItems.EYE_ITEMS.getEntries()) {

              output.accept(item.get());

            }

            // Mouths
            for (RegistryObject<Item> item : MouthItems.MOUTH_ITEMS.getEntries()) {

              output.accept(item.get());

            }

            // Emoji Items
            for (RegistryObject<Item> item : EmojiItems.EMOJI_ITEMS.getEntries()) {

              output.accept(item.get());

            }

            // Emoji Blocks
            for (RegistryObject<Block> block : EmojiBlocks.EMOJI_BLOCKS.getEntries()) {

              output.accept(block.get());

            }

          })
          .build());

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param event event bus to register to
   */
  public static void register(IEventBus event) {

    CREATIVE_MODE_TABS.register(event);

  }

}
