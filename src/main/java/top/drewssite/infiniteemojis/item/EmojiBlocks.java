package top.drewssite.infiniteemojis.item;

import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;

/**
 * General items added by the mod.
 */
public class EmojiBlocks {

  /*
   * Register for emoji blocks added by the mod
   */
  public static final DeferredRegister<Block> EMOJI_BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, InfiniteEmojis.MOD_ID);

  public static final RegistryObject<Block> GRINNING_FACE_BLOCK = registerBlock(
      "grinning_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> GRINNING_FACE_WITH_BIG_EYES_BLOCK = registerBlock(
      "grinning_face_with_big_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> GRINNING_FACE_WITH_SMILING_EYES_BLOCK = registerBlock(
      "grinning_face_with_smiling_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> BEAMING_FACE_BLOCK = registerBlock(
      "beaming_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> GRINNING_SQUINTING_FACE_BLOCK = registerBlock(
      "grinning_squinting_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> SLIGHTLY_SMILING_FACE_BLOCK = registerBlock(
      "slightly_smiling_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> WINKING_FACE_BLOCK = registerBlock(
      "winking_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> SMILING_FACE_WITH_SMILING_EYES_BLOCK = registerBlock(
      "smiling_face_with_smiling_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> HEART_EYED_FACE_BLOCK = registerBlock(
      "heart_eyed_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> STAR_STRUCK_FACE_BLOCK = registerBlock(
      "star_struck_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> FACE_BLOWING_A_KISS_BLOCK = registerBlock(
      "face_blowing_a_kiss_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> KISSING_FACE_BLOCK = registerBlock(
      "kissing_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> SMILING_FACE_WITH_CLOSED_EYES_BLOCK = registerBlock(
      "smiling_face_with_closed_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> KISSING_FACE_WITH_CLOSED_EYES_BLOCK = registerBlock(
      "kissing_face_with_closed_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> KISSING_FACE_WITH_SMILING_EYES_BLOCK = registerBlock(
      "kissing_face_with_smiling_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static RegistryObject<Block> SMIRKING_FACE_BLOCK = registerBlock(
      "smirking_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {

    RegistryObject<T> toReturn = EMOJI_BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;

  }

  @SuppressWarnings({"CheckStyle", "UnusedReturnValue"})
  private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {

    return ModItems.ITEMS.register(name,
        () -> new BlockItem(block.get(), new Item.Properties()));

  }

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param eventBus Event bus to register to.
   */
  public static void register(IEventBus eventBus) {

    EMOJI_BLOCKS.register(eventBus);

  }

}
