package me.leonardjackson.jumpglider.items.tools;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.ItemHoe;

public class ItemDarkIronHoe extends ItemHoe {

	public ItemDarkIronHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.JumpGliderItems.DARK_IRON_HOE.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.DARK_IRON_HOE.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

}
