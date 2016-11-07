package me.leonardjackson.jumpglider.items.tools;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.ItemSpade;

public class ItemDarkIronShovel extends ItemSpade {

	public ItemDarkIronShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.JumpGliderItems.DARK_IRON_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.DARK_IRON_SHOVEL.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

}
