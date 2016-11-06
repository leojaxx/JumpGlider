package me.leonardjackson.jumpglider.init;

import me.leonardjackson.jumpglider.blocks.BlockDarknessInfusedIron;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block darknessInfusedIronBlock;
	
	public static void init() {
		darknessInfusedIronBlock = new BlockDarknessInfusedIron();
	}
	
	public static void register() {
		registerBlock(darknessInfusedIronBlock);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(darknessInfusedIronBlock);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
		
