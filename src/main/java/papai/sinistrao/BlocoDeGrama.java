package papai.sinistrao;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlocoDeGrama extends Block {

	protected BlocoDeGrama(Material material) {
		super(material);
		this.setHardness(20);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("BlocoDeGrama");
	}

}
