package papai.sinistrao;

import Itens.GerenciadorDeItens;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PapaiSinistraoMod.MODID, version = PapaiSinistraoMod.VERSION, name = PapaiSinistraoMod.NAME)
public class PapaiSinistraoMod
{
    public static final String MODID = "papaisinistraomod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Papai Sinistrão";

    @Instance(PapaiSinistraoMod.MODID)
    public static PapaiSinistraoMod instance; 
    

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Papai Sinistrão - Init");
        MinecraftForge.EVENT_BUS.register(new OvelhaColorida());
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("Papai Sinistrão - PreInit");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("Papai Sinistrão - PostInit");
    }
    
	@EventHandler  
	public void preLoad(FMLPreInitializationEvent event) {
	   GerenciadorDeBlocos.init();
	   GerenciadorDeItens.init();
//	   CommonProxy.RegisterRender();S
	  
	}
}
