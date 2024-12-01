/*
 * Created by following Kaupenjoe's tutorial for 1.20.x
 */

package top.drewssite.infiniteemojis.item.custom;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

/**
 * Custom metal detector item,
 * made so that I can learn to extend the Item class.
 */
public class MetalDetectorItem extends Item {

  /**
   * Constructor for MetalDetectorMethod.
   *
   * @param properties Item.Properties for the Item
   */
  public MetalDetectorItem(Properties properties) {

    super(properties);

  }

  /**
   * What to do when this item is used?
   * With a MetalDetectorItem,
   * search under the ground for valuables and send findings to chat.
   *
   * @param context The context in which we are using the item
   * @return Result of the interaction (always InteractionResult.SUCCESS)
   */
  @Override
  public @NotNull InteractionResult useOn(UseOnContext context) {

    // if we are on the server side (very important)
    if (!context.getLevel().isClientSide) {

      BlockPos positionClicked = context.getClickedPos();
      Player player = context.getPlayer();
      boolean foundBlock = false;

      // loop through all blocks that are below us;
      // 'i' is not actually used so the value doesn't matter, just the # of iterations
      for (int i = 0; i <= positionClicked.getY() + 64; i++) {

        // the block we are currently checking
        BlockState state = context.getLevel().getBlockState(positionClicked.below(i));

        // is it valuable?
        if (isValuableBlock(state)) {

          // print location of valuable block to chat
          outputValuableCoordinates(positionClicked.below(i), player, state.getBlock());
          foundBlock = true;

          break;

        }

      }

      if (!foundBlock) {

        // print to chat
        player.sendSystemMessage(Component.literal("No Valuables Found!"));

      }

    }

    EquipmentSlot slot = context.getHand() == InteractionHand.MAIN_HAND
        ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;

    context.getItemInHand().hurtAndBreak(1, context.getPlayer(), slot);

    return InteractionResult.SUCCESS;

  }

  private void outputValuableCoordinates(BlockPos blockPos, Player player, Block block) {

    player.sendSystemMessage(Component.literal(
        "Found " + I18n.get(block.getDescriptionId()) + " at "
            + "(" + blockPos.getX()
            + ", " + blockPos.getY()
            + ", " + blockPos.getZ()
            + ")"));

  }

  private boolean isValuableBlock(BlockState state) {

    return state.is(Tags.Blocks.ORES);

  }

}
