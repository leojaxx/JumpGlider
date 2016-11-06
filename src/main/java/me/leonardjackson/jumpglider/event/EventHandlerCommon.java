package me.leonardjackson.jumpglider.event;

import me.leonardjackson.jumpglider.init.ModItems;
import me.leonardjackson.jumpglider.items.ItemJumpGliderArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

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
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		// if player is wearing both leggings and boots they will get step assist
		ItemStack jumpBoots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
		ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		if (jumpBoots != null && jumpBoots.getItem() == ModItems.jumpGliderBoots &&
				leggings != null && leggings.getItem() == ModItems.jumpGliderLeggings) {
			player.stepHeight = 1.0023F;
		} else {
			player.stepHeight = 0.6F;
		}
	}
}