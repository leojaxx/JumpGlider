package me.leonardjackson.jumpglider.init;

import java.util.HashMap;
import java.util.Map;

import me.leonardjackson.jumpglider.items.ItemJumpGliderArmor;
import me.leonardjackson.jumpglider.items.models.ModelJumpGliderArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {


	public static Item jumpGliderHelm;
	public static Item jumpGliderWings;
	public static Item jumpGliderLeggings;
	public static Item jumpGliderBoots;

	public static void init() {
		ArmorMaterial MATERIAL = EnumHelper.addArmorMaterial("MATERIAL", "jumpglider:jumpglider", 15, new int[] {2, 5, 4, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
		
		jumpGliderHelm = new ItemJumpGliderArmor("jumpglider_helm", MATERIAL, 1, EntityEquipmentSlot.HEAD);
		jumpGliderWings = new ItemJumpGliderArmor("jumpglider_wings", MATERIAL, 1, EntityEquipmentSlot.CHEST);
		jumpGliderLeggings = new ItemJumpGliderArmor("jumpglider_leggings", MATERIAL, 1, EntityEquipmentSlot.LEGS);
		jumpGliderBoots = new ItemJumpGliderArmor("jumpglider_boots", MATERIAL, 1, EntityEquipmentSlot.FEET);
		
	}
	public static void register() {
		GameRegistry.register(jumpGliderHelm);
		GameRegistry.register(jumpGliderWings);
		GameRegistry.register(jumpGliderLeggings);
		GameRegistry.register(jumpGliderBoots);
	}
	
	public static void registerRenders() {
		registerRender(jumpGliderHelm);
		registerRender(jumpGliderWings);
		registerRender(jumpGliderLeggings);
		registerRender(jumpGliderBoots);
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();

	public static void registerJumpGliderArmor() {
		ModelJumpGliderArmor glider_armor = new ModelJumpGliderArmor(1F);
		ModelJumpGliderArmor glider_leggings = new ModelJumpGliderArmor(0.5F);
		
		armorModels.put(ModItems.jumpGliderHelm, glider_armor);
		armorModels.put(ModItems.jumpGliderWings, glider_armor);
		armorModels.put(ModItems.jumpGliderLeggings, glider_leggings);
		armorModels.put(ModItems.jumpGliderBoots, glider_armor);
	}
}
