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
   * Mouths
   */
  public static final RegistryObject<Item> SMILE = ITEMS.register("smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BEAMING_SMILE = ITEMS.register("beaming_smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SLIGHT_SMILE = ITEMS.register("slight_smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMALL_SMILE = ITEMS.register("small_smile",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> KISSING_MOUTH = ITEMS.register("kissing_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMIRKING_MOUTH = ITEMS.register("smirking_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> YUM_MOUTH = ITEMS.register("yum_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> TONGUE_MOUTH = ITEMS.register("tongue_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MONEY_MOUTH = ITEMS.register("money_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SURPRISED_MOUTH = ITEMS.register("surprised_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> THINKING_MOUTH = ITEMS.register("thinking_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> DROOLING_MOUTH = ITEMS.register("drooling_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> PARTY_MOUTH = ITEMS.register("party_mouth",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BUCK_TOOTHED_MOUTH = ITEMS.register("buck_toothed_mouth",
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
