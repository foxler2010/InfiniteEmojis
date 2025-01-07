package top.drewssite.infiniteemojis.datagen.loot;

import java.util.Set;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import top.drewssite.infiniteemojis.block.EmojiBlocks;

/**
 * Loot tables for all EmojiBlocks.
 */
public class EmojiBlockLootTables extends BlockLootSubProvider {

  /**
   * Constructor for EmojiBlockLootTables.
   */
  public EmojiBlockLootTables() {

    super(Set.of(), FeatureFlags.DEFAULT_FLAGS);

  }

  @Override
  protected void generate() {

    // All Emoji blocks drop themselves
    for (RegistryObject<Block> block : EmojiBlocks.EMOJI_BLOCKS.getEntries()) {

      this.dropSelf(block.get());

    }

  }

  @Override
  protected @NotNull Iterable<Block> getKnownBlocks() {

    return EmojiBlocks.EMOJI_BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

  }

}
