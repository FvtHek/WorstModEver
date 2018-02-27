package com.sirglitchalot.wme.item;

import com.sirglitchalot.wme.Reference;
import com.sirglitchalot.wme.WorstModEver;

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
	
	public static void registerItems() {
		
		GameRegistry.register(test, new ResourceLocation(Reference.MODID, "test_item"));
	}
	
	public static void registerRenders() {
		registerRender(test);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
