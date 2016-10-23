package me.leonardjackson.jumpglider.event;

import me.leonardjackson.jumpglider.init.ModItems;
import me.leonardjackson.jumpglider.items.ItemJumpGliderArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerCommon {
	
	@SubscribeEvent
	public void onEntityDamage(LivingFallEvent event) {
		if (event.getEntityLiving() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)event.getEntityLiving();
			
			if (!player.getEntityWorld().isRemote) {
				if (player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.jumpGliderBoots) {
					
					double playerHeight = ItemJumpGliderArmor.letGo;
					BlockPos block = player.getPosition();
					double blockHeight = block.getY();
					double distance = (playerHeight - blockHeight);
					distance = distance - 3;
					
					if (player.posY - blockHeight >= distance)
						event.setDistance((float)distance);
				}
			}
		}
	}

}
