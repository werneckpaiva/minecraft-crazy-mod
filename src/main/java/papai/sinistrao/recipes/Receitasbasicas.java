package papai.sinistrao.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.resources.GrassColorReloadListener;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import papai.sinistrao.itens.GerenciadorDeItens;
import papai.sinistrao.itens.ItemPepitaDeDiamante;
import papai.sinistrao.itens.ItemPepitaDeGrama;

public class Receitasbasicas
{
   public static void init()
   {
	   //ItemStacks
	    ItemStack stack1 = new ItemStack(GerenciadorDeItens.itemPepitaDeGrama, 9);
	    ItemStack stack2 = new ItemStack(Blocks.dirt, 1);
	    ItemStack stack3 = new ItemStack(GerenciadorDeItens.itemPepitaDeDiamante);
	    ItemStack stack4 = new ItemStack(Items.diamond);
	   //ComForma
	   GameRegistry.addShapedRecipe(stack2, "ppp", "ppp","ppp",'p', GerenciadorDeItens.itemPepitaDeGrama );
	   GameRegistry.addShapedRecipe(stack4, "ppp", "ppp","ppp",'p', GerenciadorDeItens.itemPepitaDeDiamante );
	   //SemForma
	   GameRegistry.addShapelessRecipe(stack1, Blocks.dirt);
	   //Fornalha
	   GameRegistry.addSmelting(GerenciadorDeItens.itemPepitaDeGrama,stack3, 5);
	   
   }
}
