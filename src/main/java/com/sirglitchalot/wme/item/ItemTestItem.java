package com.sirglitchalot.wme.item;

import java.util.List;

import com.sirglitchalot.wme.WorstModEver;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTestItem extends Item{
	
	public ItemTestItem(String unlocalizedName) {
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(WorstModEver.tabCore);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("Whatup you Wanker!");
		super.addInformation(stack, playerIn, tooltip, advanced);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}
	
	
	
	
	
	
}
