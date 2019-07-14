package io.github.rathuldr.furnace;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * The main mod class.
 * 
 * @author Rath
 */

// dependencies = "required-after:Forge@[14.23.5.2768,)",

@Mod(modid = Mod_RathsFurnace.MODID, name = Mod_RathsFurnace.NAME, version = Mod_RathsFurnace.VERSION, useMetadata = true)
public final class Mod_RathsFurnace {

  /** The mod ID as shown in TODO: ??? */
  public static final String MODID = "rathsfurnace";

  /** The mod's official name. */
  public static final String NAME = "Rath's Furnace";

  /** The version of the mod. */
  public static final String VERSION = "rev001";

  /** A reference to the mod's common proxy. */
  @SidedProxy(clientSide = "io.github.rathuldr.furnace.ClientProxy", serverSide = "io.github.rathuldr.furnace.ServerProxy")
  public static CommonProxy commonProxy;

  /** The instance of this mod. */
  @Mod.Instance
  public static Mod_RathsFurnace instance;

  /** A reference to the mod's logger. */
  private static Logger logger;

  /**
   * Pre-initialization phase.
   * 
   * @param event The {@link FMLPreInitializationEvent}.
   */
  @EventHandler
  public final void preInit(final FMLPreInitializationEvent event) {
    logger = event.getModLog();
    logger.debug("Starting pre-initialization phase.");
    commonProxy.preInit(event);
  }

  /**
   * Initialization phase.
   * 
   * @param event The {@link FMLInitializationEvent}.
   */
  @EventHandler
  public final void init(final FMLInitializationEvent event) {
    logger.debug("Starting initialization phase.");
    commonProxy.init(event);
  }

  /**
   * Post-initialization phase.
   * 
   * @param event The {@link FMLPostInitializationEvent}.
   */
  @EventHandler
  public final void postInit(final FMLPostInitializationEvent event) {
    logger.debug("Starting post-initialization phase.");
    commonProxy.postInit(event);
  }
}
