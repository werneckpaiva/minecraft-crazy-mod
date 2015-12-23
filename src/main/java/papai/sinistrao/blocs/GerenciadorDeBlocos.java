package papai.sinistrao.blocs;

import papai.sinistrao.PapaiSinistraoMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class GerenciadorDeBlocos {

	public static void initAll() {
		initBlocoDeGrama();
//		initXixi();
		initZangard();
		initReved();
		initTurBlock();
	}

	public static Block BlocoDeGrama;

	public static void initBlocoDeGrama() {
		System.out.println("GERENCIADOR DE BLOCOS");
		BlocoDeGrama = new BlocoDeGrama(Material.wood);
		GameRegistry.registerBlock(BlocoDeGrama, "BlocoDeGrama");
	}

	public static Block Xixi;

	public static void initXixi() {
		System.out.println("GERENCIADOR DE BLOCOS");
		Xixi = new Xixi(Material.wood);
		GameRegistry.registerBlock(Xixi, "Xixi");
	}

	public static Block Zangard;

	public static void initZangard() {
		Zangard = new Zangard(true);
		GameRegistry.registerBlock(Zangard, "Zangard");
	}

	public static Block TurmarinaOre;

	public static void initReved() {
		TurBlock = new TurmarinaOre(true);
		GameRegistry.registerBlock(TurBlock, "Rerved");
}
//	public static Block xX;
//
//	public static void initxX() {
//		xX = new xX(Material.wood);
//		GameRegistry.registerBlock(xX, "xX");
//	}
	public static Block TurBlock;

	public static void initTurBlock() {
		TurBlock = new TurBlock(Material.wood);
		GameRegistry.registerBlock(TurBlock, "TurBlock");
	}
}
