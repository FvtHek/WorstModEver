package com.sirglitchalot.wme.item;

import com.sirglitchalot.wme.WorstModEver;

import net.minecraft.item.Item;

public class ItemBagel extends Item{
	
	public ItemBagel(String name) {
		setUnlocalizedName(name);
		setCreativeTab(WorstModEver.tabCore);
		setMaxStackSize(256);
	}

}
