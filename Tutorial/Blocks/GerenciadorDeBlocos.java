package Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GerenciadorDeBlocos
{
public static Block BlocoDeEnderpreal;
public static void BlocoDeEnderpreal()
{
	BlocoDeEnderpreal= new BlocoDeEnderpreal(Material.wood);
	GameRegistry.registerBlock(BlocoDeEnderpreal, "BlocoDeEnderpreal"); 
}
}
