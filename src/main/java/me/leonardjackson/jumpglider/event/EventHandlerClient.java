package me.leonardjackson.jumpglider.event;

import me.leonardjackson.jumpglider.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EventHandlerClient {

		@SubscribeEvent
		public void onPlayerTick(TickEvent.PlayerTickEvent event) {
			EntityPlayer player = event.player;
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

