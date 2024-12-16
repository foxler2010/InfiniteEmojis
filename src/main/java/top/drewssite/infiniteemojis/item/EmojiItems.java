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
   * Emojis use their display names on emojipedia.org unless otherwise noted
   */
  public static RegistryObject<Item> GRINNING_FACE = EMOJIS.register(
      "grinning_face",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> GRINNING_FACE_WITH_BIG_EYES = EMOJIS.register(
      "grinning_face_with_big_eyes",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> GRINNING_FACE_WITH_SMILING_EYES = EMOJIS.register(
      "grinning_face_with_smiling_eyes",
      () -> new Item(new Item.Properties()));

  // Emojipedia Name: Beaming Face with Smiling Eyes
  public static RegistryObject<Item> BEAMING_FACE = EMOJIS.register(
      "beaming_face",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> GRINNING_SQUINTING_FACE = EMOJIS.register(
      "grinning_squinting_face",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> SLIGHTLY_SMILING_FACE = EMOJIS.register(
      "slightly_smiling_face",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> WINKING_FACE = EMOJIS.register(
      "winking_face",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> SMILING_FACE_WITH_SMILING_EYES = EMOJIS.register(
      "smiling_face_with_smiling_eyes",
      () -> new Item(new Item.Properties()));

  // Emojipedia Name: Smiling Face with Heart Eyes
  public static RegistryObject<Item> HEART_EYED_FACE = EMOJIS.register(
      "heart_eyed_face",
      () -> new Item(new Item.Properties()));

  // Emojipedia Name: Star-Struck
  public static RegistryObject<Item> STAR_STRUCK_FACE = EMOJIS.register(
      "star_struck_face",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> FACE_BLOWING_A_KISS = EMOJIS.register(
      "face_blowing_a_kiss",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> KISSING_FACE = EMOJIS.register(
      "kissing_face",
      () -> new Item(new Item.Properties()));

  // Emojipedia Name: Smiling Face
  public static RegistryObject<Item> SMILING_FACE_WITH_CLOSED_EYES = EMOJIS.register(
      "smiling_face_with_closed_eyes",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> KISSING_FACE_WITH_CLOSED_EYES = EMOJIS.register(
      "kissing_face_with_closed_eyes",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> KISSING_FACE_WITH_SMILING_EYES = EMOJIS.register(
      "kissing_face_with_smiling_eyes",
      () -> new Item(new Item.Properties()));

  public static RegistryObject<Item> SMIRKING_FACE = EMOJIS.register(
      "smirking_face",
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
