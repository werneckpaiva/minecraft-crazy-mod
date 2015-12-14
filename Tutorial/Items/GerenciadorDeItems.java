package Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GerenciadorDeItems
{
public static PepitaDeEnderpreal PepitaDeEnderpreal;
public static void PepitaDeEnderpreal()
{
	PepitaDeEnderpreal= new PepitaDeEnderpreal();
	GameRegistry.registerItem(PepitaDeEnderpreal, "PepitaDeEnderpreal");
}
}
