package com.sirglitchalot.wme.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.testBlock),"TTT", "TTT", "TTT", 'T', ModItems.test);
	}
}
