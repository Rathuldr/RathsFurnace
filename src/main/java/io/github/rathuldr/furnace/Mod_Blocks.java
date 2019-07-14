package io.github.rathuldr.furnace;

import io.github.rathuldr.furnace.blocks.SmithingStation;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * All {@link Block} objects added by this mod.
 * 
 * @author Rath
 */
public final class Mod_Blocks {

  /** The Smithing Station, where metal can be worked. */
  @ObjectHolder(Mod_RathsFurnace.MODID + ":" + SmithingStation.UNLOCALIZED_NAME)
  public static SmithingStation smithingStation;

}
