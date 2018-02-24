package sirglitchalot.worstmodever;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sirglitchalot.worstmodever.proxy.CommonProxy;
import sirglitchalot.worstmodever.util.Utils;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class WorstModEver {
	
	@Mod.Instance(Reference.MOD_ID)
	public static WorstModEver instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre Initialize");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Initialize");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post Initialize");
	}
}
