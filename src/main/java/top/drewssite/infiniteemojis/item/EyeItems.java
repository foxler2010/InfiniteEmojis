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
public class EyeItems {

  /*
   * Register for eye-type items added by the mod
   */
  public static final DeferredRegister<Item> EYE_ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, InfiniteEmojis.MOD_ID);

  /*
   * Eyes
   */
  public static final RegistryObject<Item> EYES = EYE_ITEMS.register("eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BIG_EYES = EYE_ITEMS.register("big_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMILING_EYES = EYE_ITEMS.register("smiling_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SQUINTING_EYES = EYE_ITEMS.register("squinting_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> WINKING_EYES = EYE_ITEMS.register("winking_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> HEART_EYES = EYE_ITEMS.register("heart_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> STAR_EYES = EYE_ITEMS.register("star_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> CLOSED_EYES = EYE_ITEMS.register("closed_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> SMIRKING_EYES = EYE_ITEMS.register("smirking_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ZANY_EYES = EYE_ITEMS.register("zany_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> DOLLAR_EYES = EYE_ITEMS.register("dollar_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> BIG_EYEBROWS_UP_EYES =
      EYE_ITEMS.register("big_eyebrows_up_eyes",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> GLARING_EYES = EYE_ITEMS.register("glaring_eyes",
      () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> THINKING_EYES = EYE_ITEMS.register("thinking_eyes",
      () -> new Item(new Item.Properties()));

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param event Event bus to register to.
   */
  public static void register(IEventBus event) {

    EYE_ITEMS.register(event);

  }

}
