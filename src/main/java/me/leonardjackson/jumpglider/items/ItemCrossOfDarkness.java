package me.leonardjackson.jumpglider.items;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.Item;

public class ItemCrossOfDarkness extends Item {
	
	public ItemCrossOfDarkness() {
		setUnlocalizedName(Reference.JumpGliderItems.CROSS_OF_DARKNESS.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.CROSS_OF_DARKNESS.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

}
