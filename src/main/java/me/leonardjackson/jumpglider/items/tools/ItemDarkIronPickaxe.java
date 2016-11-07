package me.leonardjackson.jumpglider.items.tools;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemDarkIronPickaxe extends ItemPickaxe {

	public ItemDarkIronPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.JumpGliderItems.DARK_IRON_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.DARK_IRON_PICKAXE.getUnlocalizedName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

}
