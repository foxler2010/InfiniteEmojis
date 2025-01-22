package top.drewssite.infiniteemojis.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.item.custom.MetalDetectorItem;

/**
 * General items added by the mod.
 */
public class ModItems {

  /**
   * Register for items added by the mod.
   */
  public static final DeferredRegister.Items ITEMS =
      DeferredRegister.createItems(InfiniteEmojis.MOD_ID);

  /**
   * Basic face item, used for building all emojis.
   */
  public static final DeferredItem<Item> FACE = ITEMS.register("face",
      () -> new Item(new Item.Properties()));

  /**
   * Metal detector, learned how to make advanced/custom items by making it.
   */
  public static final DeferredItem<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
      () -> new MetalDetectorItem(new Item.Properties().durability(100)));

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param eventBus Event bus to register to.
   */
  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
