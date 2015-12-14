package papai.sinistrao.mobs;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class MulaSemCabecaEntity extends EntityHorse {

    public static int MULE_TYPE = 2;
    
    public MulaSemCabecaEntity(World world) {
	    super(world);
	}

	public static void init() {
	    EntityRegistry.registerGlobalEntityID(MulaSemCabecaEntity.class, "MulaSemCabeca", EntityRegistry.findGlobalUniqueEntityId());
	}

    public static void registerRendering() {
        RenderingRegistry.registerEntityRenderingHandler(MulaSemCabecaEntity.class, new MulaSemCabecaRendering(new MulaSemCabecaModel(), 0.5F));
    }

    public int getHorseType(){
        return MulaSemCabecaEntity.MULE_TYPE;
    }
    
    public int getGrowingAge() {
        return 10;
    }
    
    public float getHorseSize() {
        return 1.0f;
    }
}
