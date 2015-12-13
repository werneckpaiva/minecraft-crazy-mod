package papai.sinistrao.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelZombie;

@SideOnly(Side.CLIENT)
public class PeidaoModel extends ModelZombie {

    public PeidaoModel() {
        super();
    }
    public PeidaoModel(float x, boolean flag)
    {
        super(x, flag);
    }
    
}
