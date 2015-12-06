package papai.sinistrao.blocs;

import papai.sinistrao.PapaiSinistraoMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Xixi extends Block {

	protected Xixi(Material material) {
		super(material);
		System.out.println("XIXI");
		this.setHardness(20);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Xixi");
		this.setBlockTextureName(PapaiSinistraoMod.MODID + ":" + "Xixi");
	}

}