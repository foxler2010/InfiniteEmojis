package top.drewssite.infiniteemojis.item.custom;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

/**
 * Custom emoji item.
 * Displays ingredients as tooltips when hovered over.
 */
public class FaceBlowingAKissItem extends Item {

  /**
   * Constructor for the Item.
   *
   * @param properties Item.Properties for the Item
   */
  public FaceBlowingAKissItem(Properties properties) {

    super(properties);

  }

  /**
   * Adds a tooltip that shows when hovering over the item in the inventory.
   *
   * @param stack The stack being hovered over.
   * @param context ToolTipContext
   * @param tooltipComponents Components pointing to the actual text that gets displayed.
   *                          This method overrides the super and
   *                          modifies the Components from the default.
   * @param tooltipFlag TooltipFlag
   */
  @Override
  public void appendHoverText(
      ItemStack stack,
      TooltipContext context,
      List<Component> tooltipComponents,
      TooltipFlag tooltipFlag) {

    tooltipComponents.add(
        Component.translatable("tooltip.infiniteemojis.emoji_item.ingredients")
            .withStyle(ChatFormatting.GRAY));

    tooltipComponents.add(
        Component.literal("- ").append(
            Component.translatable("item.infiniteemojis.face"))
            .withStyle(ChatFormatting.GRAY));

    tooltipComponents.add(
        Component.literal("- ").append(
            Component.translatable("item.infiniteemojis.winking_eyes"))
            .withStyle(ChatFormatting.GRAY));

    tooltipComponents.add(
        Component.literal("- ").append(
            Component.translatable("item.infiniteemojis.kissing_mouth"))
            .withStyle(ChatFormatting.GRAY));

    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);

  }

}
