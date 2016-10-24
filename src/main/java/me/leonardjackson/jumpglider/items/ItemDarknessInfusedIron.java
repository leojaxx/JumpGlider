package me.leonardjackson.jumpglider.items;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.Item;

public class ItemDarknessInfusedIron extends Item {
	
	public ItemDarknessInfusedIron() {
		setUnlocalizedName(Reference.JumpGliderItems.DARKNESS_INFUSED_IRON.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.DARKNESS_INFUSED_IRON.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

}
