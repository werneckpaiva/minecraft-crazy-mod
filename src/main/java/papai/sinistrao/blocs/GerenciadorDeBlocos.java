package papai.sinistrao.blocs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GerenciadorDeBlocos
{
	public static Block BlocoDeGrama;
	public static void init()
	{
		System.out.println("GERENCIADOR DE BLOCOS");
		BlocoDeGrama = new BlocoDeGrama(Material.wood);
		GameRegistry.registerBlock(BlocoDeGrama, "BlocoDeGrama");
	}
	public static Block Xixi;
	public static void init3()
	{
		System.out.println("GERENCIADOR DE BLOCOS");
		Xixi = new Xixi(Material.wood);
		GameRegistry.registerBlock(Xixi, "X");
	}
}