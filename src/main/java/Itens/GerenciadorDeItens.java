package Itens;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class GerenciadorDeItens
{
   public static Item itemPepitaDeGrama;
   public static void init()
   {
       itemPepitaDeGrama = new ItemPepitaDeGrama();
       GameRegistry.registerItem(itemPepitaDeGrama, "ItemPepitaDeGrama");
   }
}
