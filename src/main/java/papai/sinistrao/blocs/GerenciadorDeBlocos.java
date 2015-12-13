package papai.sinistrao.blocs;

import papai.sinistrao.PapaiSinistraoMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class GerenciadorDeBlocos
{
	public static void initAll()   {
	init();
	init3();
	init4();
	init8();}
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
		GameRegistry.registerBlock(Xixi, "Xixi");
	}
	public static Block Zangard;
	public static void init4()
	{
		Zangard = new Zangard(true);
		GameRegistry.registerBlock(Zangard, "Zangard");	
}
	
   public static Block Rerved;
   public static void init8()
{
	   Rerved = new Rerved(true);
	GameRegistry.registerBlock(Rerved, "Rerved");
}}
