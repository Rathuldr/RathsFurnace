package io.github.rathuldr.furnace;

import io.github.rathuldr.furnace.items.SmithingHammer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * A collection of {@link Item} objects added by this mod.
 * 
 * @author Rathuldr <a href="mailto:rathuldr@gmail.com">rathuldr@gmail.com</a>
 */
public final class Mod_Items {

  /** The Smithing Hammer item, used to TODO: ?? */
  @ObjectHolder(Mod_RathsFurnace.MODID + ":" + SmithingHammer.UNLOCALIZED_NAME)
  public static SmithingHammer smithingHammer;

}
