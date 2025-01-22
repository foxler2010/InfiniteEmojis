package top.drewssite.infiniteemojis.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.drewssite.infiniteemojis.block.ModBlocks;

/**
 * Custom log and wood blocks' type.
 */
public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {

  /**
   * Constructor for ModFlammableRotatedPillarBlock.
   *
   * @param properties Properties of the Block.
   */
  public ModFlammableRotatedPillarBlock(Properties properties) {
    super(properties);
  }

  /**
   * Returns whether the Block is flammable.
   *
   * @param state BlockState
   * @param level BlockGetter
   * @param pos BlockPos
   * @param direction Direction
   * @return Whether the Block is flammable.
   */
  @Override
  public boolean isFlammable(
          @NotNull BlockState state,
          @NotNull BlockGetter level,
          @NotNull BlockPos pos,
          @NotNull Direction direction) {
    return true;
  }

  /**
   * Returns the flammability of the Block.
   *
   * @param state BlockState
   * @param level BlockGetter
   * @param pos BlockPos
   * @param direction Direction
   * @return The flammability of the Block.
   */
  @Override
  public int getFlammability(
          @NotNull BlockState state,
          @NotNull BlockGetter level,
          @NotNull BlockPos pos,
          @NotNull Direction direction) {
    return 20;
  }

  /**
   * Returns the fire spread speed of the Block.
   *
   * @param state BlockState
   * @param level BlockGetter
   * @param pos BlockPos
   * @param direction Direction
   * @return The fire spread speed of the Block.
   */
  @Override
  public int getFireSpreadSpeed(
          @NotNull BlockState state,
          @NotNull BlockGetter level,
          @NotNull BlockPos pos,
          @NotNull Direction direction) {
    return 5;
  }

  /**
   * Returns the BlockState that should replace the current one when a tool is used on it.
   *
   * <p>In this case, the method checks if the current state is a log,
   * and then if the player is using an axe on it. If so, the method returns
   * a stripped log. If not the method passes it to the super
   * to do anything else if needed.
   *
   * @param state Current state
   * @param context Context of the action
   * @param ability ItemAbility; passed straight to super
   * @param simulate boolean; passed straight to super
   * @return The BlockState that should replace the current one when a tool is used on it.
   */
  @Override
  public @Nullable BlockState getToolModifiedState(
          @NotNull BlockState state,
          UseOnContext context,
          @NotNull ItemAbility ability,
          boolean simulate) {

    // If the player uses an axe on the block
    if (context.getItemInHand().getItem() instanceof AxeItem) {
      // ...and the block is a log
      if (state.is(ModBlocks.EMO_LOG.get())) {
        // return a stripped log that's facing the same way
        return ModBlocks.STRIPPED_EMO_LOG.get()
                .defaultBlockState()
                .setValue(AXIS, state.getValue(AXIS));
      }
      // ...and the block is a wood
      if (state.is(ModBlocks.EMO_WOOD.get())) {
        // return a stripped wood that's facing the same way
        return ModBlocks.STRIPPED_EMO_WOOD.get()
                .defaultBlockState()
                .setValue(AXIS, state.getValue(AXIS));
      }
    }
    // Defer to super if we're not stripping the block
    return super.getToolModifiedState(state, context, ability, simulate);
  }
}
