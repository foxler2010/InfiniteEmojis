package top.drewssite.infiniteemojis.datagen.loot;

import java.util.Set;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import top.drewssite.infiniteemojis.block.ModBlocks;


/**
 * Loot tables for all ModBlocks.
 */
public class ModBlockLootTables extends BlockLootSubProvider {

  /**
   * Constructor for ModBlockLootTables.
   */
  public ModBlockLootTables() {

    super(Set.of(), FeatureFlags.DEFAULT_FLAGS);

  }

  @Override
  protected void generate() {

    // basic wood
    this.dropSelf(ModBlocks.EMO_LOG.get());
    this.dropSelf(ModBlocks.EMO_WOOD.get());
    this.dropSelf(ModBlocks.STRIPPED_EMO_LOG.get());
    this.dropSelf(ModBlocks.STRIPPED_EMO_WOOD.get());
    this.dropSelf(ModBlocks.EMO_PLANKS.get());

    // "special" wood
    this.dropSelf(ModBlocks.EMO_STAIRS.get());
    this.dropSelf(ModBlocks.EMO_BUTTON.get());
    this.dropSelf(ModBlocks.EMO_PRESSURE_PLATE.get());
    this.dropSelf(ModBlocks.EMO_FENCE.get());
    this.dropSelf(ModBlocks.EMO_FENCE_GATE.get());
    this.dropSelf(ModBlocks.EMO_TRAPDOOR.get());

    // really special wood
    this.add(
        ModBlocks.EMO_SLAB.get(),
        block -> createSlabItemTable(
            ModBlocks.EMO_SLAB.get()));

    this.add(
        ModBlocks.EMO_DOOR.get(),
        block -> createDoorTable(
            ModBlocks.EMO_DOOR.get()));

    this.add(
        ModBlocks.EMO_LEAVES.get(),
        block -> createLeavesDrops(
            block,
            ModBlocks.EMO_LEAVES.get(), // TODO change to sapling
            NORMAL_LEAVES_SAPLING_CHANCES));

  }

  @Override
  protected @NotNull Iterable<Block> getKnownBlocks() {

    return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

  }

}
