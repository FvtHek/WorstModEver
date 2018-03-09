package com.sirglitchalot.wme.block;

import com.sirglitchalot.wme.WorstModEver;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTestBlock extends Block{

	public BlockTestBlock(Material materialIn, String name) {
		super(materialIn);
		setCreativeTab(WorstModEver.tabCore);
		setUnlocalizedName(name);
	}

}
