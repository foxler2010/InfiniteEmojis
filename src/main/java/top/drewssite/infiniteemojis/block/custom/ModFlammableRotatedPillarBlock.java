package top.drewssite.infiniteemojis.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;
import top.drewssite.infiniteemojis.block.ModBlocks;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {

  public ModFlammableRotatedPillarBlock(Properties properties) {

    super(properties);

  }

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

  @Override
  public @Nullable BlockState getToolModifiedState(
      BlockState state,
      UseOnContext context,
      ToolAction toolAction,
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
    return super.getToolModifiedState(state, context, toolAction, simulate);

  }

}
