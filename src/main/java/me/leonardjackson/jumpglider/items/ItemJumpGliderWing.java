package me.leonardjackson.jumpglider.items;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.Item;

public class ItemJumpGliderWing extends Item {
	
	public ItemJumpGliderWing() {
		setUnlocalizedName(Reference.JumpGliderItems.JUMPGLIDERWING.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.JUMPGLIDERWING.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

}
