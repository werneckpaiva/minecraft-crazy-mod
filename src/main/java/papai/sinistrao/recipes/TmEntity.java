//package papai.sinistrao.recipes;
//
//import papai.sinistrao.EntityGrenade;
//import papai.sinistrao.MainRegistry;
//import papai.sinistrao.PapaiSinistraoMod;
//import net.minecraft.entity.EntityList;
//import papai.sinistrao.PapaiSinistraoMod;
//import papai.sinistrao.blocs.TutHostileMob;
//import cpw.mods.fml.common.registry.EntityRegistry;
//
//public class TmEntity {
//	
//	private static final Object MainRegistry = null;
//
//	public static void mainRegistry(){
//		registerEntity();
//	}
//	
//	public static void registerEntity(){
//		createEntity(EntityTutMob.class, "TutMob", 0xEC4545, 0x001EFF);
//		createEntity(TutHostileMob.class, "TutHostileMob", 0xE15050, 0xFFF700);
//		
//		createEntity(EntityGrenade.class, "TutGrenade", 0x008521, 0x00FF08);
//	}
//	
//	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
//		int randomId = EntityRegistry.findGlobalUniqueEntityId();
//		
//		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
//		EntityRegistry.registerModEntity(entityClass, entityName, randomId,MainRegistry, 64, 1, true);
//		createEgg(randomId, solidColour, spotColour);
//	}
//
//	private static void createEgg(int randomId, int solidColour, int spotColour) {
//		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
//	}
//}

