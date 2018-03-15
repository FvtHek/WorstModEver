package com.sirglitchalot.wme.proxy;

import com.sirglitchalot.wme.init.ModBlocks;
import com.sirglitchalot.wme.init.ModCrafting;
import com.sirglitchalot.wme.init.ModItems;
import com.sirglitchalot.wme.init.ModModels;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		ModModels.preInit();
		ModItems.preInit();
		ModBlocks.preInit();
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModCrafting.register();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
