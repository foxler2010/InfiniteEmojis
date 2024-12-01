package top.drewssite.infiniteemojis.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;

/**
 * Emoji items added by the mod.
 * These are combinations of components
 * put together to create a full emoji.
 */
public class EmojiItems {

  /*
   * Register for emoji items added by the mod
   */
  public static DeferredRegister<Item> EMOJIS = DeferredRegister.create(
      ForgeRegistries.ITEMS,
      InfiniteEmojis.MOD_ID);

  /*
   * Emojis use their Unicode names unless otherwise noted
   */
  public static RegistryObject<Item> GRINNING_FACE = EMOJIS.register("grinning_face",
      () -> new Item(new Item.Properties()));

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param event Event bus to register to.
   */
  public static void register(IEventBus event) {

    EMOJIS.register(event);

  }

}
