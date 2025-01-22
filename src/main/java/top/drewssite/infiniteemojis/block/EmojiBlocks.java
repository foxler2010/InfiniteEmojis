package top.drewssite.infiniteemojis.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.item.ModItems;

import java.util.function.Supplier;

/**
 * Emoji blocks added by the mod.
 * Each of these blocks correspond to an emoji
 * registered in top.drewssite.infiniteemojis.item.EmojiItems
 */
public class EmojiBlocks {

  /**
   * Register for emoji blocks added by the mod.
   */
  public static final DeferredRegister.Blocks EMOJI_BLOCKS =
      DeferredRegister.createBlocks(InfiniteEmojis.MOD_ID);

  public static final DeferredBlock<Block> GRINNING_FACE_BLOCK = registerBlock(
      "grinning_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> GRINNING_FACE_WITH_BIG_EYES_BLOCK = registerBlock(
      "grinning_face_with_big_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> GRINNING_FACE_WITH_SMILING_EYES_BLOCK = registerBlock(
      "grinning_face_with_smiling_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> BEAMING_FACE_BLOCK = registerBlock(
      "beaming_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> GRINNING_SQUINTING_FACE_BLOCK = registerBlock(
      "grinning_squinting_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> SLIGHTLY_SMILING_FACE_BLOCK = registerBlock(
      "slightly_smiling_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> WINKING_FACE_BLOCK = registerBlock(
      "winking_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> SMILING_FACE_WITH_SMILING_EYES_BLOCK = registerBlock(
      "smiling_face_with_smiling_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> HEART_EYED_FACE_BLOCK = registerBlock(
      "heart_eyed_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> STAR_STRUCK_FACE_BLOCK = registerBlock(
      "star_struck_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> FACE_BLOWING_A_KISS_BLOCK = registerBlock(
      "face_blowing_a_kiss_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> KISSING_FACE_BLOCK = registerBlock(
      "kissing_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> SMILING_FACE_WITH_CLOSED_EYES_BLOCK = registerBlock(
      "smiling_face_with_closed_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> KISSING_FACE_WITH_CLOSED_EYES_BLOCK = registerBlock(
      "kissing_face_with_closed_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> KISSING_FACE_WITH_SMILING_EYES_BLOCK = registerBlock(
      "kissing_face_with_smiling_eyes_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  public static final DeferredBlock<Block> SMIRKING_FACE_BLOCK = registerBlock(
      "smirking_face_block",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

  /**
   * Helper method that registers the Block and BlockItem in one call.
   *
   * @param name Name of the item (machine-readable)
   * @param block Supplier of Block to use
   * @return DeferredHolder<Block, T extends Block> of the Block registered by the method.
   */
  private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
    DeferredBlock<T> toReturn = EMOJI_BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
  }

  /**
   * Helper method that creates a basic BlockItem for the passed in Block
   *
   * @param name Name of the BlockItem. Should be the same as its associated Block.
   * @param block Block to use create the BlockItem off of.
   * @return DeferredHolder<Item, BlockItem> for the created BlockItem.
   */
  @SuppressWarnings({"CheckStyle", "UnusedReturnValue"})
  private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
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
