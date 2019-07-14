package io.github.rathuldr.furnace.blocks;

import io.github.rathuldr.furnace.Mod_RathsFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * TODO_JDOC: Description for the Smithing Station
 * 
 * @author Rath
 */
public final class SmithingStation extends Block {

  /** The unlocalized name of this block before applying a translation. */
  public static final String UNLOCALIZED_NAME = "SmithingStation";

  /**
   * Constructs a new {@link SmithingStation} {@link Block}.
   */
  public SmithingStation() {
    super(Material.ANVIL);
    setUnlocalizedName(Mod_RathsFurnace.MODID + "." + UNLOCALIZED_NAME);
    setRegistryName(UNLOCALIZED_NAME);
  }

}
