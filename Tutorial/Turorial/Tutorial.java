package Turorial;
import Blocks.GerenciadorDeBlocos;
import Items.GerenciadorDeItems;
import Proxy.Client;
import Proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lib.Strings;
@Mod(modid = Strings.MODID ,version = Strings.VERSION , name = Strings.MODNAME)
public class Tutorial
{
@EventHandler
	public static void PreLoad(FMLPreInitializationEvent event)
	{
	CommonProxy.RegisterRender();
	Client.RegisterRender();
	GerenciadorDeBlocos.BlocoDeEnderpreal();
	GerenciadorDeItems.PepitaDeEnderpreal();
	}
	@EventHandler
	public static void Load(FMLInitializationEvent event)
	{
	
	}
	
	
	
	@EventHandler
	
	public static void postLoad(FMLPostInitializationEvent event)
	{
		
	}}
	
	
	
	
	








