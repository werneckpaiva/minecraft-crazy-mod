package papai.sinistrao;

import papai.sinistrao.mobs.MulaSemCabecaEntity;
import papai.sinistrao.mobs.PeidaoEntity;

public class Client extends CommonProxy {
	public static final String COMMON_PROXY = "papai.sinistrao.Client";
	
	public static void registerRender(){
	    PeidaoEntity.registerRendering();
	    MulaSemCabecaEntity.registerRendering();
	}
}
