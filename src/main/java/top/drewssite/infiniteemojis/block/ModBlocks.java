package top.drewssite.infiniteemojis.block;

import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.block.custom.ModFlammableRotatedPillarBlock;
import top.drewssite.infiniteemojis.item.ModItems;

/**
 * General blocks added by the mod.
 */
public class ModBlocks {

  /**
   * Register for general blocks added by the mod.
   */
  public static DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, InfiniteEmojis.MOD_ID);

  public static RegistryObject<Block> EMO_LOG = registerBlock(
      "emo_log",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_LOG)
          .strength(3f)));

  public static RegistryObject<Block> EMO_WOOD = registerBlock(
      "emo_wood",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_WOOD)
          .strength(3f)));

  public static RegistryObject<Block> STRIPPED_EMO_LOG = registerBlock(
      "stripped_emo_log",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.STRIPPED_OAK_LOG)
          .strength(3f)));

  public static RegistryObject<Block> STRIPPED_EMO_WOOD = registerBlock(
      "stripped_emo_wood",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.STRIPPED_OAK_WOOD)
          .strength(3f)));

  public static RegistryObject<Block> EMO_PLANKS = registerBlock(
      "emo_planks",
      () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {

        /*
         * Anonymous class
         */

        @Override
        public boolean isFlammable(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            Direction direction) {

          return true;

        }

        @Override
        public int getFlammability(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            Direction direction) {

          return 20;

        }

        @Override
        public int getFireSpreadSpeed(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            Direction direction) {

          return 5;

        }

      });

  public static RegistryObject<Block> EMO_LEAVES = registerBlock(
      "emo_leaves",
      () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {

        /*
         * Anonymous class
         */

        @Override
        public boolean isFlammable(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            Direction direction) {

          return true;

        }

        @Override
        public int getFlammability(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            Direction direction) {

          return 20;

        }

        @Override
        public int getFireSpreadSpeed(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            Direction direction) {

          return 5;

        }

      });

  /**
   * Helper method that registers the Block and BlockItem in one call.
   *
   * @param name Name of the item (machine-readable)
   * @param block Supplier of Block to use
   * @return RegistryObject<Block> of the Block registered by the method.
   */
  private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {

    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;

  }

  /**
   * Helper method that creates a basic BlockItem for the passed in Block
   *
   * @param name Name of the BlockItem. Should be the same as its associated Block.
   * @param block Block to use create the BlockItem off of.
   * @return RegistryObject<Item> for the created BlockItem.
   */
  @SuppressWarnings({"CheckStyle", "UnusedReturnValue"})
  private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {

    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

  }

  /**
   * Register the DeferredRegister to the event bus.
   *
   * @param eventBus Event bus to register to.
   */
  public static void register(IEventBus eventBus) {

    BLOCKS.register(eventBus);

  }

}
