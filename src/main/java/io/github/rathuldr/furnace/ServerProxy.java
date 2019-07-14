package io.github.rathuldr.furnace;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

/**
 * The proxy for server-only things.
 * 
 * @author Rath
 */
@Mod.EventBusSubscriber(value = Side.SERVER)
public final class ServerProxy extends CommonProxy {

}
