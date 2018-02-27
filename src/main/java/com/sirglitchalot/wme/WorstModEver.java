package com.sirglitchalot.wme;

import com.sirglitchalot.wme.item.ModItems;
import com.sirglitchalot.wme.proxy.CommonProxy;
import com.sirglitchalot.wme.tabs.CreativeTabCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class WorstModEver {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static WorstModEver instance;
	
	public static CreativeTabCore tabCore;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tabCore = new CreativeTabCore(CreativeTabs.getNextID(), "tab_core");
		proxy.preInit(event);
		ModItems.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
