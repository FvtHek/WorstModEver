package com.sirglitchalot.wme.init;

import com.sirglitchalot.wme.Reference;
import com.sirglitchalot.wme.WorstModEver;
import com.sirglitchalot.wme.block.BlockTestBlock;
import com.sirglitchalot.wme.item.ItemTestItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block testBlock;
	
	public static void preInit() {
		
		testBlock = new BlockTestBlock("test_block");
		
		registerBlocks();
	}
	
	public static void registerBlock(Block block, String name) {
		GameRegistry.register(block, new ResourceLocation(Reference.MODID, name));
		GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MODID, name));
	}
	
	public static void registerBlocks() {
		registerBlock(testBlock, "test_block");
		
	}
	
	public static void registerRenders() {
		registerRender(testBlock);
	}
	
	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
