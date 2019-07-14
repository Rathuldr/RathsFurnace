package io.github.rathuldr.furnace;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * The proxy for client-only things such as models and textures.
 * 
 * @author Rath
 */
@Mod.EventBusSubscriber(value = Side.CLIENT)
public final class ClientProxy extends CommonProxy {

  @Override
  public final void preInit(final FMLPreInitializationEvent e) {
    super.preInit(e);
  }

  /**
   * Handles registering entity models.
   * 
   * @param event The {@link ModelRegistryEvent}.
   */
  @SubscribeEvent
  public static final void registerModels(final ModelRegistryEvent event) {

  }

}
