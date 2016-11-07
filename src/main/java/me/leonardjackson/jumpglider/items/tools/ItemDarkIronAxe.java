package me.leonardjackson.jumpglider.items.tools;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.ItemAxe;

public class ItemDarkIronAxe extends ItemAxe {

	public ItemDarkIronAxe(ToolMaterial material) {
		super(material, 8F, -2F);
		setUnlocalizedName(Reference.JumpGliderItems.DARK_IRON_AXE.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.DARK_IRON_AXE.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}
	
}
