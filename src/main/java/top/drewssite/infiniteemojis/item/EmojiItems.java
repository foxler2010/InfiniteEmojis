package top.drewssite.infiniteemojis.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.item.custom.*;

/**
 * Emoji items added by the mod.
 * These are combinations of components
 * put together to create a full emoji.
 */
public class EmojiItems {

  /*
   * Register for emoji items added by the mod
   */
  public static DeferredRegister<Item> EMOJI_ITEMS = DeferredRegister.create(
      ForgeRegistries.ITEMS,
      InfiniteEmojis.MOD_ID);

  /*
   * Emojis use their display names on emojipedia.org unless otherwise noted
   */
  public static RegistryObject<Item> GRINNING_FACE = EMOJI_ITEMS.register(
      "grinning_face",
      () -> new GrinningFaceItem(new Item.Properties()));

  public static RegistryObject<Item> GRINNING_FACE_WITH_BIG_EYES = EMOJI_ITEMS.register(
      "grinning_face_with_big_eyes",
      () -> new GrinningFaceWithBigEyesItem(new Item.Properties()));

  public static RegistryObject<Item> GRINNING_FACE_WITH_SMILING_EYES = EMOJI_ITEMS.register(
      "grinning_face_with_smiling_eyes",
      () -> new GrinningFaceWithSmilingEyesItem(new Item.Properties()));

  // Emojipedia Name: Beaming Face with Smiling Eyes
  public static RegistryObject<Item> BEAMING_FACE = EMOJI_ITEMS.register(
      "beaming_face",
      () -> new BeamingFaceItem(new Item.Properties()));

  public static RegistryObject<Item> GRINNING_SQUINTING_FACE = EMOJI_ITEMS.register(
      "grinning_squinting_face",
      () -> new GrinningSquintingFaceItem(new Item.Properties()));

  public static RegistryObject<Item> SLIGHTLY_SMILING_FACE = EMOJI_ITEMS.register(
      "slightly_smiling_face",
      () -> new SlightlySmilingFaceItem(new Item.Properties()));

  public static RegistryObject<Item> WINKING_FACE = EMOJI_ITEMS.register(
      "winking_face",
      () -> new WinkingFaceItem(new Item.Properties()));

  public static RegistryObject<Item> SMILING_FACE_WITH_SMILING_EYES = EMOJI_ITEMS.register(
      "smiling_face_with_smiling_eyes",
      () -> new SmilingFaceWithSmilingEyesItem(new Item.Properties()));

  // Emojipedia Name: Smiling Face with Heart Eyes
  public static RegistryObject<Item> HEART_EYED_FACE = EMOJI_ITEMS.register(
      "heart_eyed_face",
      () -> new HeartEyedFaceItem(new Item.Properties()));

  // Emojipedia Name: Star-Struck
  public static RegistryObject<Item> STAR_STRUCK_FACE = EMOJI_ITEMS.register(
      "star_struck_face",
      () -> new StarStruckFaceItem(new Item.Properties()));

  public static RegistryObject<Item> FACE_BLOWING_A_KISS = EMOJI_ITEMS.register(
      "face_blowing_a_kiss",
      () -> new FaceBlowingAKissItem(new Item.Properties()));

  public static RegistryObject<Item> KISSING_FACE = EMOJI_ITEMS.register(
      "kissing_face",
      () -> new KissingFaceItem(new Item.Properties()));

  // Emojipedia Name: Smiling Face
  public static RegistryObject<Item> SMILING_FACE_WITH_CLOSED_EYES = EMOJI_ITEMS.register(
      "smiling_face_with_closed_eyes",
      () -> new SmilingFaceWithClosedEyesItem(new Item.Properties()));

  public static RegistryObject<Item> KISSING_FACE_WITH_CLOSED_EYES = EMOJI_ITEMS.register(
      "kissing_face_with_closed_eyes",
      () -> new KissingFaceWithClosedEyesItem(new Item.Properties()));

  public static RegistryObject<Item> KISSING_FACE_WITH_SMILING_EYES = EMOJI_ITEMS.register(
      "kissing_face_with_smiling_eyes",
      () -> new KissingFaceWithSmilingEyesItem(new Item.Properties()));

  public static RegistryObject<Item> SMIRKING_FACE = EMOJI_ITEMS.register(
      "smirking_face",
      () -> new SmirkingFaceItem(new Item.Properties()));

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param event Event bus to register to.
   */
  public static void register(IEventBus event) {

    EMOJI_ITEMS.register(event);

  }

}
