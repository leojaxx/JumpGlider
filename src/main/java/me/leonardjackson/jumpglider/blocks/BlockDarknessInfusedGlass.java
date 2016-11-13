package me.leonardjackson.jumpglider.blocks;

import java.util.Random;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockDarknessInfusedGlass extends BlockGlass {

	public BlockDarknessInfusedGlass(Material materialIn, boolean ignoreSimilarity) {
		super(Material.GLASS, false);
		setUnlocalizedName(Reference.JumpGliderBlocks.DARKNESS_INFUSED_GLASS.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderBlocks.DARKNESS_INFUSED_GLASS.getRegistryName());
		setCreativeTab(JumpGlider.CREATIVE_TAB);
		setSoundType(SoundType.GLASS);
		setHardness(4F);
	}
	
	@Override
	public int quantityDropped(Random random) {
        return 1;
    }
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

}
