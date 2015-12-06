package papai.sinistrao.itens;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class GerenciadorDeItens
{		
   public static Item itemPepitaDeGrama;
   public static void init()   
   {
	   System.out.println("GERENCIADOR DE ITENS");
       itemPepitaDeGrama = new ItemPepitaDeGrama();
       GameRegistry.registerItem(itemPepitaDeGrama, "ItemPepitaDeGramaX");
   }
 	
    public static Item itemPepitaDeDiamante;
	public static void init2()
	   {
		   System.out.println("GERENCIADOR DE ITENS");
	       itemPepitaDeDiamante = new ItemPepitaDeDiamante();
	       GameRegistry.registerItem(itemPepitaDeDiamante, "ItemPepitaDeDiamanteX");
	   }
	
	
	 public static Item peidinho;
	public static void init5()
		   {
			   System.out.println("GERENCIADOR DE ITENS");
			   peidinho = new Peidinho();
		       GameRegistry.registerItem(peidinho, "peidinhoX");
		   }
	}	  
