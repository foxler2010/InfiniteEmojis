package top.drewssite.infiniteemojis.block;

import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.drewssite.infiniteemojis.InfiniteEmojis;
import top.drewssite.infiniteemojis.block.custom.ModFlammableRotatedPillarBlock;
import top.drewssite.infiniteemojis.block.custom.ModPlanksBlock;
import top.drewssite.infiniteemojis.item.ModItems;

/**
 * General blocks added by the mod.
 */
public class ModBlocks {

  /**
   * Register for general blocks added by the mod.
   */
  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, InfiniteEmojis.MOD_ID);

  public static final RegistryObject<Block> EMO_LOG = registerBlock(
      "emo_log",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_LOG)
          .strength(2f)));

  public static final RegistryObject<Block> EMO_WOOD = registerBlock(
      "emo_wood",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_WOOD)
          .strength(2f)));

  public static final RegistryObject<Block> STRIPPED_EMO_LOG = registerBlock(
      "stripped_emo_log",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.STRIPPED_OAK_LOG)
          .strength(2f)));

  public static final RegistryObject<Block> STRIPPED_EMO_WOOD = registerBlock(
      "stripped_emo_wood",
      () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.STRIPPED_OAK_WOOD)
          .strength(2f)));

  public static final RegistryObject<Block> EMO_PLANKS = registerBlock(
      "emo_planks",
      () -> new ModPlanksBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_PLANKS)
          .strength(2f)));

  public static final RegistryObject<Block> EMO_STAIRS = registerBlock(
      "emo_stairs",
      () -> new StairBlock(
          ModBlocks.EMO_PLANKS.get().defaultBlockState(),
          BlockBehaviour.Properties
              .ofFullCopy(Blocks.OAK_STAIRS)
              .strength(2f)));

  public static final RegistryObject<Block> EMO_SLAB = registerBlock(
      "emo_slab",
      () -> new SlabBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_SLAB)
          .strength(2f)));

  public static final RegistryObject<Block> EMO_BUTTON = registerBlock(
      "emo_button",
      () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_BUTTON)
          .strength(0.5f)));

  public static final RegistryObject<Block> EMO_PRESSURE_PLATE = registerBlock(
      "emo_pressure_plate",
      () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_PRESSURE_PLATE)
          .strength(0.5f)));

  public static final RegistryObject<Block> EMO_FENCE = registerBlock(
      "emo_fence",
      () -> new FenceBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_FENCE)
          .strength(2f)));

  public static final RegistryObject<Block> EMO_FENCE_GATE = registerBlock(
      "emo_fence_gate",
      () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_FENCE_GATE)
          .strength(2f)));

  public static final RegistryObject<Block> EMO_DOOR = registerBlock(
      "emo_door",
      () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_DOOR)
          .strength(3f)));

  public static final RegistryObject<Block> EMO_TRAPDOOR = registerBlock(
      "emo_trapdoor",
      () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_TRAPDOOR)
          .strength(3f)));

  public static final RegistryObject<Block> EMO_LEAVES = registerBlock(
      "emo_leaves",
      () -> new LeavesBlock(BlockBehaviour.Properties
          .ofFullCopy(Blocks.OAK_LEAVES)
          .strength(0.2f)) {

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
