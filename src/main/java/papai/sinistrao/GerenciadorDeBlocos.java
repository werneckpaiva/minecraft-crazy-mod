package papai.sinistrao;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GerenciadorDeBlocos
{
	public static Block BlocoDeGrama;
	public static void init()
	{
		BlocoDeGrama = new BlocoDeGrama(Material.wood);
		GameRegistry.registerBlock(BlocoDeGrama, "BlocoDeGrama");
	}
}
