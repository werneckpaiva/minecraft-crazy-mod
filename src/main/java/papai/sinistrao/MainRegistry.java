//package papai.sinistrao;
//
//import papai.sinistrao.blocs.ServerProxy;
//import papai.sinistrao.recipes.TmEntity;
//
//
//
//import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.EventHandler;
//import cpw.mods.fml.common.Mod.Instance;
//import cpw.mods.fml.common.SidedProxy;
//import cpw.mods.fml.common.event.FMLInitializationEvent;
//import cpw.mods.fml.common.event.FMLPostInitializationEvent;
//import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkRegistry;
//
//
//public class MainRegistry {
//	
//	@SidedProxy(clientSide = "com.thegrovesyproject.main.ClientProxy", serverSide = "com.thegrovesyproject.main.ServerProxy") 
//	public static ServerProxy proxy;
//	
//	
//	@Instance(PapaiSinistraoMod.MODID)
//	public static MainRegistry modInstance;
//	
//	/**
//	 * Loads before
//	 * @param PreEvent
//	 */
//	@EventHandler
//	public static void PreLoad(FMLPreInitializationEvent PreEvent){
//		
//		TmEntity.mainRegistry();
//
//		
//		proxy.registerTileEntities();
//		proxy.registerRenderThings();
//	}
//	
//	/**
//	 * Loads during
//	 * @param event
//	 */
//	@EventHandler
//	public static void load(FMLInitializationEvent event){
//		proxy.registerNetworkStuff();
//	}
//	
//	/**
//	 * Loads after
//	 * @param PostEvent
//	 */
//	@EventHandler
//	public static void PostLoad(FMLPostInitializationEvent PostEvent){
//		
//	}
//	
//}