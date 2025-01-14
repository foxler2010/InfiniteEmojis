package top.drewssite.infiniteemojis.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Custom planks block.
 */
public class ModPlanksBlock extends Block {

  /**
   * Constructor for ModPlanksBlock.
   *
   * @param properties Properties of the Block.
   */
  public ModPlanksBlock(Properties properties) {

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
      BlockState state,
      BlockGetter level,
      BlockPos pos,
      Direction direction) {

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
      BlockState state,
      BlockGetter level,
      BlockPos pos,
      Direction direction) {

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
      BlockState state,
      BlockGetter level,
      BlockPos pos,
      Direction direction) {

    return 5;

  }


}
