package papai.sinistrao.blocs;

import papai.sinistrao.PapaiSinistraoMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TurBlock extends Block {

	protected TurBlock(Material material) {
		super(material);
		this.setHardness(20);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("TurmarinaBlock");
		this.setBlockTextureName(PapaiSinistraoMod.MODID + ":" + "TurBlock");
	}

}