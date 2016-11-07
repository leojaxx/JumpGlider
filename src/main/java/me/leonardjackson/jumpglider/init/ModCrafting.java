package me.leonardjackson.jumpglider.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		ItemStack coal = new ItemStack(Items.COAL, 1);
		ItemStack iron = new ItemStack(Items.IRON_INGOT, 1);
		ItemStack redstone = new ItemStack(Items.REDSTONE, 1);
		ItemStack leatherChestplate = new ItemStack(Items.LEATHER_CHESTPLATE, 1);
		ItemStack feather = new ItemStack(Items.FEATHER, 1);
		ItemStack piston = new ItemStack(Blocks.PISTON, 1);
		ItemStack stick = new ItemStack(Items.STICK);
		
		Item darkIron = ModItems.darknessInfusedIron;
		Block darkIronBlock = ModBlocks.darknessInfusedIronBlock;
		Item darkCross = ModItems.crossOfDarkness;
		Item wing = ModItems.jumpGliderWing;
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darknessInfusedIron), "C", "I", "R", 'C', coal, 'I', iron, 'R', redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.darknessInfusedIron, 9), darkIronBlock);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.crossOfDarkness), " D ", "DRD", " D ", 'D', darkIron, 'R', redstone);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.jumpGliderWing), "FFF", "DFF", "DDF", 'F', feather, 'D', darkIron);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.jumpGliderHelm), "DDD", "I I", 'D', darkIron, 'I', iron);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.jumpGliderWings), "W W", " L ", " C ", 'W', wing, 'L', leatherChestplate, 'C', darkCross);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.jumpGliderLeggings), "DDD", "I I", "I I", 'D', darkIron, 'I', iron);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.jumpGliderBoots), "D D", "P P", 'D', darkIron, 'P', piston);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darkIronAxe), "DD ", "DS ", " S ", 'D', darkIron, 'S', stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darkIronAxe), " DD", " SD", " S ", 'D', darkIron, 'S', stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darkIronHoe), "DD ", " S ", " S ", 'D', darkIron, 'S', stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darkIronHoe), " DD", " S ", " S ", 'D', darkIron, 'S', stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darkIronPickaxe), "DDD", " S ", " S ", 'D', darkIron, 'S', stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darkIronShovel), " D ", " S ", " S ", 'D', darkIron, 'S', stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.darkIronSword), " D ", " D ", " S ", 'D', darkIron, 'S', stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.darknessInfusedIronBlock), "DDD", "DDD", "DDD", 'D', darkIron);

	}
}
