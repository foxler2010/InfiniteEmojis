package top.drewssite.infiniteemojis.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;

/**
 * "Eye"-type items added by the mod.
 */
public class MouthItems {

  /*
   * Register for eye-type items added by the mod
   */
  public static final DeferredRegister<Item> MOUTH_ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, InfiniteEmojis.MOD_ID);

  /*
   * Mouths
   */
  public static final RegistryObject<Item> SMILE = MOUTH_ITEMS.register("smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BEAMING_SMILE = MOUTH_ITEMS.register("beaming_smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SLIGHT_SMILE = MOUTH_ITEMS.register("slight_smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMALL_SMILE = MOUTH_ITEMS.register("small_smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> KISSING_MOUTH = MOUTH_ITEMS.register("kissing_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMIRKING_MOUTH = MOUTH_ITEMS.register("smirking_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> YUM_MOUTH = MOUTH_ITEMS.register("yum_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> TONGUE_MOUTH = MOUTH_ITEMS.register("tongue_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MONEY_MOUTH = MOUTH_ITEMS.register("money_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SURPRISED_MOUTH = MOUTH_ITEMS.register("surprised_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> THINKING_MOUTH = MOUTH_ITEMS.register("thinking_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> DROOLING_MOUTH = MOUTH_ITEMS.register("drooling_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> PARTY_MOUTH = MOUTH_ITEMS.register("party_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BUCK_TOOTHED_MOUTH = MOUTH_ITEMS.register(
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
