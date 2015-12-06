package papai.sinistrao;

import papai.sinistrao.mobs.PeidaoEntity;
import papai.sinistrao.mobs.PeidaoModel;
import papai.sinistrao.mobs.PeidaoRendering;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class Client extends CommonProxy {
	public static final String COMMON_PROXY = "papai.sinistrao.Client";
	
	public static void registerRender(){
	    RenderingRegistry.registerEntityRenderingHandler(PeidaoEntity.class, new PeidaoRendering(new PeidaoModel(), 0.5F));
	}
}
