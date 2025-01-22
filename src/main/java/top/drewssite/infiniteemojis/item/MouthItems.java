package top.drewssite.infiniteemojis.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.drewssite.infiniteemojis.InfiniteEmojis;

/**
 * "Mouth"-type items added by the mod.
 */
public class MouthItems {

  /**
   * Register for mouth-type items added by the mod.
   */
  public static final DeferredRegister.Items MOUTH_ITEMS =
      DeferredRegister.createItems(InfiniteEmojis.MOD_ID);

  /*
   * Mouths
   */
  public static final DeferredItem<Item> SMILE = MOUTH_ITEMS.register("smile",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> BEAMING_SMILE = MOUTH_ITEMS.register("beaming_smile",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> SLIGHT_SMILE = MOUTH_ITEMS.register("slight_smile",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> SMALL_SMILE = MOUTH_ITEMS.register("small_smile",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> KISSING_MOUTH = MOUTH_ITEMS.register("kissing_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> SMIRKING_MOUTH = MOUTH_ITEMS.register("smirking_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> YUM_MOUTH = MOUTH_ITEMS.register("yum_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> TONGUE_MOUTH = MOUTH_ITEMS.register("tongue_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> MONEY_MOUTH = MOUTH_ITEMS.register("money_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> SURPRISED_MOUTH = MOUTH_ITEMS.register("surprised_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> THINKING_MOUTH = MOUTH_ITEMS.register("thinking_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> DROOLING_MOUTH = MOUTH_ITEMS.register("drooling_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> PARTY_MOUTH = MOUTH_ITEMS.register("party_mouth",
      () -> new Item(new Item.Properties()));

  public static final DeferredItem<Item> BUCK_TOOTHED_MOUTH = MOUTH_ITEMS.register(
      "buck_toothed_mouth",
      () -> new Item(new Item.Properties()));

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param event Event bus to register to.
   */
  public static void register(IEventBus event) {
    MOUTH_ITEMS.register(event);
  }
}
