package papai.sinistrao.mobs;

import papai.sinistrao.PapaiSinistraoMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class PeidaoRendering extends RenderLiving{

    private static final ResourceLocation peidaoTexture = new ResourceLocation(PapaiSinistraoMod.MODID+ ":textures/entity/peidao.png");  //refers to:assets/yourmod/textures/entity/yourtexture.png
//    private static final ResourceLocation cowTextures = new ResourceLocation("textures/entity/cow/cow.png");

    public PeidaoRendering(ModelBase mainModel, float shadowSize) {
        super(mainModel, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return peidaoTexture;
    }

}
