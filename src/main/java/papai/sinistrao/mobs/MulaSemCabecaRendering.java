package papai.sinistrao.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderHorse;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class MulaSemCabecaRendering extends RenderHorse {

    private static final ResourceLocation muleTexture = new ResourceLocation("textures/entity/horse/mule.png");
    
    public MulaSemCabecaRendering(ModelBase mainModel, float shadowSize) {
        super(mainModel, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.muleTexture;
    }
    
}
