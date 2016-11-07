package me.leonardjackson.jumpglider.init;

import java.util.HashMap;
import java.util.Map;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.items.ItemCrossOfDarkness;
import me.leonardjackson.jumpglider.items.ItemDarknessInfusedIron;
import me.leonardjackson.jumpglider.items.ItemJumpGliderArmor;
import me.leonardjackson.jumpglider.items.ItemJumpGliderWing;
import me.leonardjackson.jumpglider.items.models.ModelJumpGliderArmor;
import me.leonardjackson.jumpglider.items.tools.ItemDarkIronAxe;
import me.leonardjackson.jumpglider.items.tools.ItemDarkIronHoe;
import me.leonardjackson.jumpglider.items.tools.ItemDarkIronPickaxe;
import me.leonardjackson.jumpglider.items.tools.ItemDarkIronShovel;
import me.leonardjackson.jumpglider.items.tools.ItemDarkIronSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {


	public static Item jumpGliderHelm;
	public static Item jumpGliderWings;
	public static Item jumpGliderLeggings;
	public static Item jumpGliderBoots;
	
	public static ItemAxe darkIronAxe;
	public static ItemHoe darkIronHoe;
	public static ItemPickaxe darkIronPickaxe;
	public static ItemSpade darkIronShovel;
	public static ItemSword darkIronSword;
	
	public static Item jumpGliderWing;
	public static Item darknessInfusedIron;
	public static Item crossOfDarkness;

	public static void init() {
		
		jumpGliderHelm = new ItemJumpGliderArmor("jumpglider_helm", JumpGlider.darkIronArmorMaterial, 1, EntityEquipmentSlot.HEAD);
		jumpGliderWings = new ItemJumpGliderArmor("jumpglider_wings", JumpGlider.darkIronArmorMaterial, 1, EntityEquipmentSlot.CHEST);
		jumpGliderLeggings = new ItemJumpGliderArmor("jumpglider_leggings", JumpGlider.darkIronArmorMaterial, 1, EntityEquipmentSlot.LEGS);
		jumpGliderBoots = new ItemJumpGliderArmor("jumpglider_boots", JumpGlider.darkIronArmorMaterial, 1, EntityEquipmentSlot.FEET);
		
		darkIronAxe = new ItemDarkIronAxe(JumpGlider.darkIronToolMaterial);
		darkIronHoe = new ItemDarkIronHoe(JumpGlider.darkIronToolMaterial);
		darkIronPickaxe = new ItemDarkIronPickaxe(JumpGlider.darkIronToolMaterial);
		darkIronShovel = new ItemDarkIronShovel(JumpGlider.darkIronToolMaterial);
		darkIronSword = new ItemDarkIronSword(JumpGlider.darkIronToolMaterial);
		
		jumpGliderWing = new ItemJumpGliderWing();
		darknessInfusedIron = new ItemDarknessInfusedIron();
		crossOfDarkness = new ItemCrossOfDarkness();
		
	}
	public static void register() {
		GameRegistry.register(jumpGliderHelm);
		GameRegistry.register(jumpGliderWings);
		GameRegistry.register(jumpGliderLeggings);
		GameRegistry.register(jumpGliderBoots);
		
		GameRegistry.register(darkIronAxe);
		GameRegistry.register(darkIronHoe);
		GameRegistry.register(darkIronPickaxe);
		GameRegistry.register(darkIronShovel);
		GameRegistry.register(darkIronSword);
		
		GameRegistry.register(jumpGliderWing);
		GameRegistry.register(darknessInfusedIron);
		GameRegistry.register(crossOfDarkness);
	}
	
	public static void registerRenders() {
		registerRender(jumpGliderHelm);
		registerRender(jumpGliderWings);
		registerRender(jumpGliderLeggings);
		registerRender(jumpGliderBoots);
		
		registerRender(darkIronAxe);
		registerRender(darkIronHoe);
		registerRender(darkIronPickaxe);
		registerRender(darkIronShovel);
		registerRender(darkIronSword);
		
		registerRender(jumpGliderWing);
		registerRender(darknessInfusedIron);
		registerRender(crossOfDarkness);
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();

	public static void registerJumpGliderArmor() {
		ModelJumpGliderArmor glider_armor = new ModelJumpGliderArmor(0.75F);
		ModelJumpGliderArmor glider_leggings = new ModelJumpGliderArmor(0.5F);
		
		armorModels.put(ModItems.jumpGliderHelm, glider_armor);
		armorModels.put(ModItems.jumpGliderWings, glider_armor);
		armorModels.put(ModItems.jumpGliderLeggings, glider_leggings);
		armorModels.put(ModItems.jumpGliderBoots, glider_armor);
	}
}
