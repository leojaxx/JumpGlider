package me.leonardjackson.jumpglider.blocks;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockDarknessInfusedIron extends Block {

	public BlockDarknessInfusedIron() {
		super(Material.IRON);
		setUnlocalizedName(Reference.JumpGliderBlocks.DARKNESS_INFUSED_IRON_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderBlocks.DARKNESS_INFUSED_IRON_BLOCK.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
		setHardness(5F);
		setResistance(10F);
		setSoundType(SoundType.METAL);
	}

}
