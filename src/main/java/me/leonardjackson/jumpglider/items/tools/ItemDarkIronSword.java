package me.leonardjackson.jumpglider.items.tools;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.item.ItemSword;

public class ItemDarkIronSword extends ItemSword {

	public ItemDarkIronSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.JumpGliderItems.DARK_IRON_SWORD.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.DARK_IRON_SWORD.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

}
