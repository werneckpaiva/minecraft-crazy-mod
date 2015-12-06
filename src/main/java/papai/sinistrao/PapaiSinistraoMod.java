package papai.sinistrao;

import com.google.common.base.Strings;

import papai.sinistrao.blocs.GerenciadorDeBlocos;
import papai.sinistrao.itens.GerenciadorDeItens;
import papai.sinistrao.recipes.Receitasbasicas;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PapaiSinistraoMod.MODID, version = PapaiSinistraoMod.VERSION, name = PapaiSinistraoMod.NAME)
public class PapaiSinistraoMod
{
    public static final String MODID = "papaisinistraomod";
    public static final String VERSION = "2.0 E NÃO SE FALA MAIS NISSO";
    public static final String NAME = "Papai Sinistrao";

    @Instance(PapaiSinistraoMod.MODID)
    public static PapaiSinistraoMod instance; 
    
    @SidedProxy(clientSide=Client.COMMON_PROXY, serverSide=CommonProxy.COMMON_PROXY)
    public static CommonProxy proxy;
    

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Papai Sinistrao - Init");
        MinecraftForge.EVENT_BUS.register(new OvelhaColorida());
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
       GerenciadorDeItens.init5();
       GerenciadorDeBlocos.init3();
 	   GerenciadorDeBlocos.init();
 	   GerenciadorDeItens.init();
 	   GerenciadorDeItens.init2();
 	   Client.registerRender();
 	   Receitasbasicas.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("Papai Sinistrao - PostInit");
    }
    
    
    public static CreativeTabs tab = new CrazyMod(CreativeTabs.getNextID(), PapaiSinistraoMod.MODID); 
    
}
