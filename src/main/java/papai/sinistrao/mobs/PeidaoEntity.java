package papai.sinistrao.mobs;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class PeidaoEntity extends EntityZombie {

    public static final int ENTITY_ID = EntityRegistry.findGlobalUniqueEntityId();

    public PeidaoEntity(World world) {
        super(world);
        this.setVelocity(10, 20, 30);
    }

    public static void init() {
        EntityRegistry.registerGlobalEntityID(PeidaoEntity.class, "Peidao", PeidaoEntity.ENTITY_ID);
        EntityRegistry.addSpawn(PeidaoEntity.class, 2, 1, 2, EnumCreatureType.creature, BiomeGenBase.plains);
        EntityRegistry.addSpawn(PeidaoEntity.class, 5, 1, 2, EnumCreatureType.creature, BiomeGenBase.extremeHills);
    }

//    @Override
//    public PeidaoEntity createChild(EntityAgeable entityAgeable) {
//        return new PeidaoEntity(this.worldObj);
//    }

}
