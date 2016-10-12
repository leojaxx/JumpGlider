package me.leonardjackson.jumpglider.init;

import me.leonardjackson.jumpglider.Reference;
import me.leonardjackson.jumpglider.items.ItemCloth;
import me.leonardjackson.jumpglider.items.ItemGlue;
import me.leonardjackson.jumpglider.items.ItemPole;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item pole;
	public static Item cloth;
	public static Item glue;
	
	public static void init() {
		pole = new ItemPole();
		cloth = new ItemCloth();
		glue = new ItemGlue();
	}
	
	public static void register() {
		GameRegistry.register(pole);
		GameRegistry.register(cloth);
		GameRegistry.register(glue);
	}
	
	public static void registerRenders() {
		registerRender(pole);
		registerRender(cloth);
		registerRender(glue);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
