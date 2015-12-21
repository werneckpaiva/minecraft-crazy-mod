package papai.sinistrao.itens;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class GerenciadorDeItens {

	public static void initAll() {
		initGrama();
		initPepitaDeDiamante();
		initPeidinho();
		initZangard();
		initReverd();
	}

	public static Item itemPepitaDeGrama;

	public static void initGrama() {
		System.out.println("GERENCIADOR DE ITENS");
		itemPepitaDeGrama = new ItemPepitaDeGrama();
		GameRegistry.registerItem(itemPepitaDeGrama, "ItemPepitaDeGramaX");
	}

	public static Item itemPepitaDeDiamante;

	public static void initPepitaDeDiamante() {
		System.out.println("GERENCIADOR DE ITENS");
		itemPepitaDeDiamante = new ItemPepitaDeDiamante();
		GameRegistry
				.registerItem(itemPepitaDeDiamante, "ItemPepitaDeDiamanteX");
	}

	public static Item peidinho;

	public static void initPeidinho() {
		System.out.println("GERENCIADOR DE ITENS");
		peidinho = new Peidinho();
		GameRegistry.registerItem(peidinho, "peidinhoX");
	}

	public static Item ZangardItem;

	public static void initZangard() {
		ZangardItem = new ZangardItem();
		GameRegistry.registerItem(ZangardItem, " ZangardItemX");
	}

	public static Item Rerved2;

	public static void initReverd() {
		Rerved2 = new Rerved2();
		GameRegistry.registerItem(Rerved2, " Rerved2");
	}
}
