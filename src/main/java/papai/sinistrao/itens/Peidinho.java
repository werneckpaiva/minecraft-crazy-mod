package papai.sinistrao.itens;

import papai.sinistrao.PapaiSinistraoMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Peidinho extends Item
{
	public Peidinho()
	{
		 this.setTextureName(PapaiSinistraoMod.MODID + ":" + "Peidinho");
		   this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
