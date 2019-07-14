package io.github.rathuldr.furnace;

import io.github.rathuldr.furnace.blocks.SmithingStation;
import io.github.rathuldr.furnace.items.SmithingHammer;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * A base class for both client and server proxies.
 * 
 * @author Rath
 */
@Mod.EventBusSubscriber
public class CommonProxy {

  /**
   * Pre-initialization phase.
   * 
   * @param event The {@link FMLPreInitializationEvent}.
   */
  public void preInit(final FMLPreInitializationEvent event) {

  }

  /**
   * Initialization phase.
   * 
   * @param event The {@link FMLInitializationEvent}.
   */
  public void init(final FMLInitializationEvent event) {

  }

  /**
   * Post-initialization phase.
   * 
   * @param event The {@link FMLPostInitializationEvent}.
   */
  public void postInit(final FMLPostInitializationEvent event) {

  }

  /**
   * Registers all blocks added by this mod.
   * 
   * @param event the {@link RegistryEvent} that registers every {@link Block}.
   */
  @SubscribeEvent
  public static final void registerBlocks(final RegistryEvent.Register<Block> event) {

    final IForgeRegistry<Block> reg = event.getRegistry();

    reg.registerAll( //@formatter:off
    
      // TODO: Register other blocks here
      new SmithingStation()
      
    );               //@formatter:on

  }

  /**
   * Registers all blocks added by this mod.
   * 
   * @param event the {@link RegistryEvent} that registers every {@link Item}.
   */
  @SubscribeEvent
  public static final void registerItems(final RegistryEvent.Register<Item> event) {

    final IForgeRegistry<Item> reg = event.getRegistry();

    reg.registerAll( //@formatter:off
    
      // TODO: Register other items here
      new SmithingHammer(),
        
      // TODO: Register other block items here
      new ItemBlock(Mod_Blocks.smithingStation).setRegistryName(Mod_Blocks.smithingStation.getRegistryName())
      
    );               //@formatter:on

  }

}
