package io.github.rathuldr.furnace.items;

import io.github.rathuldr.furnace.Mod_RathsFurnace;
import net.minecraft.item.Item;

/**
 * TODO_JDOC: Write description for Smithing Hammer.
 * 
 * @author Rath
 */
public final class SmithingHammer extends Item {

  /** The unlocalized name of this item before a translation is applied. */
  public static final String UNLOCALIZED_NAME = "SmithingHammer";

  /**
   * Constructs a new {@link SmithingHammer} {@link Item}.
   */
  public SmithingHammer() {
    setRegistryName(UNLOCALIZED_NAME);
    setUnlocalizedName(Mod_RathsFurnace.MODID + "." + UNLOCALIZED_NAME);
  }

}
