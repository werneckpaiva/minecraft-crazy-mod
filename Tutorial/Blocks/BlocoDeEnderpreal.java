package Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlocoDeEnderpreal extends Block {

	protected BlocoDeEnderpreal(Material material) {
		super(material);
		this.setHardness(20);
		this.setCreativeTab(CreativeTabs.tabBlock);
	  this.setBlockName("BlocoDeEnderreal");
	}

	
}
