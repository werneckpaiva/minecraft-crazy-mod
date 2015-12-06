package papai.sinistrao;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.event.ClickEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class OvelhaColorida {

    @SubscribeEvent
    public void entityAttachHandler(AttackEntityEvent event){
        if (!event.target.worldObj.isRemote){
            Entity entity = event.target;
            float force = (float) Math.random() * 20;
            System.out.println("Morreu!!!! "+force);
            entity.worldObj.createExplosion(event.entityPlayer, entity.posX, entity.posY, entity.posZ, force, true);
        }
    }

    @SubscribeEvent
    public void entityClickHandler(EntityInteractEvent event){
        if (!event.target.worldObj.isRemote){
            Entity entity = event.target;
            if (entity instanceof EntitySheep){
                EntitySheep sheep = (EntitySheep) entity;
                sheep.setFleeceColor(sheep.getFleeceColor() + 1);
            } else if (entity instanceof EntityCow){
                EntityCow cow = (EntityCow) entity;
                cow.setFire(5);
            }
        }
    }
    
    @SubscribeEvent
    public void entityClickHandler2(BreakEvent event){
        if (!event.world.isRemote){
            event.block.setResistance(20);
        }
    }

}
