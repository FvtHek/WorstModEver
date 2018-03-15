package com.sirglitchalot.wme.block;

import com.sirglitchalot.wme.WorstModEver;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTestBlock extends Block{

	public BlockTestBlock(String name) {
		super(Material.ROCK);
		setCreativeTab(WorstModEver.tabCore);
		setUnlocalizedName(name);
	}

}
