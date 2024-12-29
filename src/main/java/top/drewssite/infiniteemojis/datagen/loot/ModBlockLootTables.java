package top.drewssite.infiniteemojis.datagen.loot;

import java.util.Set;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import top.drewssite.infiniteemojis.block.EmojiBlocks;
import top.drewssite.infiniteemojis.block.ModBlocks;

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

    this.dropSelf(ModBlocks.EMO_LOG.get());
    this.dropSelf(ModBlocks.EMO_WOOD.get());
    this.dropSelf(ModBlocks.STRIPPED_EMO_LOG.get());
    this.dropSelf(ModBlocks.STRIPPED_EMO_WOOD.get());
    this.dropSelf(ModBlocks.EMO_PLANKS.get());

    this.add(
        ModBlocks.EMO_LEAVES.get(),
        block -> createLeavesDrops(
            block,
            ModBlocks.EMO_LEAVES.get(), // TODO change to sapling
            NORMAL_LEAVES_SAPLING_CHANCES));

  }

  @Override
  protected @NotNull Iterable<Block> getKnownBlocks() {

    return EmojiBlocks.EMOJI_BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

  }

}
