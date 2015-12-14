package papai.sinistrao.mobs;

import papai.sinistrao.itens.GerenciadorDeItens;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.particle.EntityDropParticleFX;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class PeidaoEntity extends EntityZombie {

    public PeidaoEntity(World world) {
        super(world);
        this.setVelocity(10, 20, 30);
    }

    public static void init() { 
        EntityRegistry.registerGlobalEntityID(PeidaoEntity.class, "Peidao", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(PeidaoEntity.class, 2, 1, 2, EnumCreatureType.creature, BiomeGenBase.plains);
        EntityRegistry.addSpawn(PeidaoEntity.class, 5, 1, 2, EnumCreatureType.creature, BiomeGenBase.extremeHills);
    }

    public static void registerRendering() {
        RenderingRegistry.registerEntityRenderingHandler(PeidaoEntity.class, new PeidaoRendering(new PeidaoModel(), 0.5F));
    }

}
