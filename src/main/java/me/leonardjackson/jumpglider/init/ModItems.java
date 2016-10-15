package me.leonardjackson.jumpglider.init;

import me.leonardjackson.jumpglider.items.ItemCloth;
import me.leonardjackson.jumpglider.items.ItemGliderWing;
import me.leonardjackson.jumpglider.items.ItemGlue;
import me.leonardjackson.jumpglider.items.ItemJumpBoots;
import me.leonardjackson.jumpglider.items.ItemPole;
import me.leonardjackson.jumpglider.items.ItemProtectedGliderWings;
import me.leonardjackson.jumpglider.items.ItemGliderWings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item pole;
	public static Item cloth;
	public static Item glue;
	public static Item gliderWing;
	public static Item gliderWings;
	public static Item protectedGliderWings;
	public static Item jumpBoots;
	
	public static void init() {
		pole = new ItemPole();
		cloth = new ItemCloth();
		glue = new ItemGlue();
		gliderWing = new ItemGliderWing();
		gliderWings = new ItemGliderWings();
		protectedGliderWings = new ItemProtectedGliderWings();
		jumpBoots = new ItemJumpBoots();
	}
	
	public static void register() {
		GameRegistry.register(pole);
		GameRegistry.register(cloth);
		GameRegistry.register(glue);
		GameRegistry.register(gliderWing);
		GameRegistry.register(gliderWings);
		GameRegistry.register(protectedGliderWings);
		GameRegistry.register(jumpBoots);
	}
	
	public static void registerRenders() {
		registerRender(pole);
		registerRender(cloth);
		registerRender(glue);
		registerRender(gliderWing);
		registerRender(gliderWings);
		registerRender(protectedGliderWings);
		registerRender(jumpBoots);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
