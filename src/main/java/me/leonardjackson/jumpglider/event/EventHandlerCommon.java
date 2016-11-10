package me.leonardjackson.jumpglider.event;

import me.leonardjackson.jumpglider.items.ItemJumpGliderArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerCommon {
	
	@SubscribeEvent
	public void onEntityDamage(LivingFallEvent event) {
		if (event.getEntityLiving() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)event.getEntityLiving();
			
			ItemStack itemStack = player.inventory.armorItemInSlot(0);
			
			if (itemStack != null && itemStack.getItem() instanceof ItemJumpGliderArmor) {
				
				ItemJumpGliderArmor armor = (ItemJumpGliderArmor)itemStack.getItem();
				
				double playerHeight = armor.letGo;
				BlockPos block = player.getPosition();
				double blockHeight = block.getY();
				double distance = (playerHeight - blockHeight);
				distance = distance - 4;
				
				if (player.posY - blockHeight >= distance)
					event.setDistance((float)distance);
			}
		}
	}
	
}