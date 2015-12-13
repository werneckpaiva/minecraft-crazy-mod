package papai.sinistrao.blocs;

import cpw.mods.fml.common.registry.GameRegistry;
import papai.sinistrao.CrazyMod;
import papai.sinistrao.PapaiSinistraoMod;
import papai.sinistrao.itens.PeidoAxe;
import papai.sinistrao.itens.PeidoHoe;
import papai.sinistrao.itens.PeidoPickaxe;
import papai.sinistrao.itens.PeidoSpade;
import papai.sinistrao.itens.PeidoSword;
import papai.sinistrao.itens.TutAxe;
import papai.sinistrao.itens.TutHoe;
import papai.sinistrao.itens.TutPickaxe;
import papai.sinistrao.itens.TutSpade;
import papai.sinistrao.itens.TutSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TMItem {
	
	public static void mainRegistry()  {
		initialiseItem();
		registerItem();
	}
	
	
	
	
	public static ToolMaterial tutMaterial = EnumHelper.addToolMaterial("Tutorial Tool Material", 3, 200, 15.0F, 4.0F, 10);
	public static ToolMaterial peidoMaterial = EnumHelper.addToolMaterial("Peido Tool Material", 3, 200, 16.0F, 4.0F, 10);
	public static ToolMaterial peidoMaterial2 = EnumHelper.addToolMaterial("Peido Tool Material2", 3, 200, 50.0F, 20.0F, 30);
	
	public static Item tutPickaxe;
	public static Item tutAxe;
	public static Item tutSword;
	public static Item tutHoe;
	public static Item tutSpade;
	
	public static Item peidoPickaxe;
	public static Item peidoAxe;
	public static Item peidoSword;
	public static Item peidoHoe;
	public static Item peidoSpade;
	
	
	public static void initialiseItem() {
		tutPickaxe = new TutPickaxe(tutMaterial).setUnlocalizedName("TutPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":TutPickaxe");
		tutAxe = new TutAxe(tutMaterial).setUnlocalizedName("TutAxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":TutAxe");
		tutSword = new TutSword(tutMaterial).setUnlocalizedName("TutSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(PapaiSinistraoMod.MODID + ":TutSword");
		tutHoe = new TutHoe(tutMaterial).setUnlocalizedName("TutHoe").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":TutHoe");
		tutSpade = new TutSpade(tutMaterial).setUnlocalizedName("TutSpade").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":TutSpade");
	
	peidoPickaxe = new PeidoPickaxe(peidoMaterial).setUnlocalizedName("PeidoPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":PeidoPickaxe");
	peidoAxe = new PeidoAxe(peidoMaterial2).setUnlocalizedName("PeidoAxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":PeidoAxe");
	peidoSword = new PeidoSword(peidoMaterial).setUnlocalizedName("PeidoSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(PapaiSinistraoMod.MODID + ":PeidoSword");
	peidoHoe = new PeidoHoe(peidoMaterial).setUnlocalizedName("PeidoHoe").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":PeidoHoe");
	peidoSpade = new PeidoSpade(peidoMaterial2).setUnlocalizedName("PeidoSpade").setCreativeTab(CreativeTabs.tabTools).setTextureName(PapaiSinistraoMod.MODID + ":PeidoSpade");}
	
	public static void registerItem() {
	
			GameRegistry.registerItem(tutPickaxe, tutPickaxe.getUnlocalizedName());
			GameRegistry.registerItem(tutAxe, tutAxe.getUnlocalizedName());
			GameRegistry.registerItem(tutSword, tutSword.getUnlocalizedName());
			GameRegistry.registerItem(tutHoe, tutHoe.getUnlocalizedName());
			GameRegistry.registerItem(tutSpade, tutSpade.getUnlocalizedName());

			GameRegistry.registerItem(peidoPickaxe, peidoPickaxe.getUnlocalizedName());
			GameRegistry.registerItem(peidoAxe, peidoAxe.getUnlocalizedName());
			GameRegistry.registerItem(peidoSword, peidoSword.getUnlocalizedName());
			GameRegistry.registerItem(peidoHoe, peidoHoe.getUnlocalizedName());
			GameRegistry.registerItem(peidoSpade, peidoSpade.getUnlocalizedName());

	}
	
}
