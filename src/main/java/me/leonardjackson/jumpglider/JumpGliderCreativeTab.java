package me.leonardjackson.jumpglider;

import me.leonardjackson.jumpglider.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class JumpGliderCreativeTab extends CreativeTabs {

	public JumpGliderCreativeTab() {
		super("tabJumpGlider");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.jumpGliderWings;
	}

}
