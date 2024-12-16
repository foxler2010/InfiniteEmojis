package top.drewssite.infiniteemojis.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.item.custom.MetalDetectorItem;

/**
 * General items added by the mod.
 */
public class ModItems {

  /*
   * Register for items added by the mod
   */
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, InfiniteEmojis.MOD_ID);

  /*
   * Basic face item, used for building all emojis
   */
  public static final RegistryObject<Item> FACE = ITEMS.register("face",
      () -> new Item(new Item.Properties()));

  /*
   * Metal detector, learned how to make advanced/custom items by making it.
   */
  public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
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
