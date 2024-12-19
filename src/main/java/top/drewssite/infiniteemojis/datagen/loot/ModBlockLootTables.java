package top.drewssite.infiniteemojis.datagen.loot;

import java.util.Set;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import top.drewssite.infiniteemojis.item.EmojiBlocks;

/**
 * ModBlockLootTables.
 */
public class ModBlockLootTables extends BlockLootSubProvider {

  /**
   * Constructor for ModBlockLootTables.
   */
  public ModBlockLootTables() {

    super(Set.of(), FeatureFlags.REGISTRY.allFlags());

  }

  @Override
  protected void generate() {

    // All Emoji blocks drop themselves
    for (RegistryObject<Block> block : EmojiBlocks.EMOJI_BLOCKS.getEntries()) {

      this.dropSelf(block.get());

    }

    // there are no other types of blocks currently

  }

  @Override
  protected @NotNull Iterable<Block> getKnownBlocks() {

    return EmojiBlocks.EMOJI_BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

  }

}
