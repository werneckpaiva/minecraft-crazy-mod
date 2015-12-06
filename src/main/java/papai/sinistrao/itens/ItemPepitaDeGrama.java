package papai.sinistrao.itens;

import cpw.mods.fml.common.registry.GameRegistry;
import papai.sinistrao.CrazyMod;
import papai.sinistrao.PapaiSinistraoMod;
import scala.reflect.internal.Trees.This;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPepitaDeGrama extends Item
{	 
	
	   public ItemPepitaDeGrama()
	   {
		   this.setTextureName(PapaiSinistraoMod.MODID + ":" + "ItemPepitaDeGrama");
		   this.setCreativeTab(CreativeTabs.tabMaterials);

	   }
	}