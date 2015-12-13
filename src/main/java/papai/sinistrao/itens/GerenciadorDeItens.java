package papai.sinistrao.itens;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class GerenciadorDeItens
{		
	public static void initall() {
  init(); 
  init2();
  init5();
  init1();
  init50();}
	
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
	 public static Item ZangardItem;
		public static void init1()
			   {
			 ZangardItem = new ZangardItem();
		       GameRegistry.registerItem( ZangardItem, " ZangardItemX");
		   }
		 public static Item Rerved2;
			public static void init50()
				   {
				Rerved2 = new Rerved2();
			       GameRegistry.registerItem( Rerved2, " Rerved2");
			   }
			   }
	
