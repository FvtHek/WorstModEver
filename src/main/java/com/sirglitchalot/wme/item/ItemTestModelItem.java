package com.sirglitchalot.wme.item;

import com.sirglitchalot.wme.WorstModEver;

import net.minecraft.item.Item;

public class ItemTestModelItem extends Item{
	
	public ItemTestModelItem(String name) {
		setUnlocalizedName(name);
		setCreativeTab(WorstModEver.tabCore);
		setMaxStackSize(256);
	}

}
