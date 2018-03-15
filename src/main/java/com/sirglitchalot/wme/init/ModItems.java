package com.sirglitchalot.wme.init;

import com.sirglitchalot.wme.Reference;
import com.sirglitchalot.wme.item.ItemTestItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item test;
	
	
	public static void preInit() {
		
		test = new ItemTestItem("test_item");
		
		registerItems();
	}
	
	public static void registerItem(Item item, String name) {
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
	}
	
	public static void registerItems() {
		registerItem(test, "test_item");
	}
	
	public static void registerRenders() {
		//registerRender(test);
		
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
