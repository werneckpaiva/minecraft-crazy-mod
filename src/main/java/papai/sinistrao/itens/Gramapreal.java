package papai.sinistrao.itens;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Gramapreal extends Item
{
	   public static Item Gramapreal;
	   public static void init()
	   {
		   System.out.println("GERENCIADOR DE ITENS");
	       Gramapreal = new Gramapreal();
	       GameRegistry.registerItem(Gramapreal, "GramaprealX");
	   }
	}


