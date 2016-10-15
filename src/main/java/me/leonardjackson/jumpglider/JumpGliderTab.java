package me.leonardjackson.jumpglider;

import me.leonardjackson.jumpglider.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class JumpGliderTab extends CreativeTabs {
	
	public JumpGliderTab() {
		super("tabJumpGlider");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.gliderWings;
	}

}
