package com.sirglitchalot.wme.item;

import java.util.List;

import com.sirglitchalot.wme.WorstModEver;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemTestItem extends Item{
	
	public ItemTestItem(String name) {
		setUnlocalizedName(name);
		setCreativeTab(WorstModEver.tabCore);
		setMaxStackSize(256);
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
