package com.sirglitchalot.wme.init;

import com.sirglitchalot.wme.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ModModels {

	public static void preInit() {
		OBJLoader.INSTANCE.addDomain(Reference.MODID);
		registerModels();
	}
	
	public static void registerModels() {
		registerModel(ModItems.test);		
	}
	
	public static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
