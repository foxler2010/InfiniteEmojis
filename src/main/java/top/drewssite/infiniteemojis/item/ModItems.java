package top.drewssite.infiniteemojis.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.item.custom.MetalDetectorItem;

/**
 * Items added by the mod.
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
   * Eyes
   */
  public static final RegistryObject<Item> EYES = ITEMS.register("eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BIG_EYES = ITEMS.register("big_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMILING_EYES = ITEMS.register("smiling_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SQUINTING_EYES = ITEMS.register("squinting_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> WINKING_EYES = ITEMS.register("winking_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> HEART_EYES = ITEMS.register("heart_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> STAR_EYES = ITEMS.register("star_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> CLOSED_EYES = ITEMS.register("closed_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMIRKING_EYES = ITEMS.register("smirking_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ZANY_EYES = ITEMS.register("zany_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> DOLLAR_EYES = ITEMS.register("dollar_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BIG_EYEBROWS_UP_EYES =
      ITEMS.register("big_eyebrows_up_eyes",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> GLARING_EYES = ITEMS.register("glaring_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> THINKING_EYES = ITEMS.register("thinking_eyes",
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
   * @param event Event bus to register to.
   */
  public static void register(IEventBus event) {

    ITEMS.register(event);

  }

}
