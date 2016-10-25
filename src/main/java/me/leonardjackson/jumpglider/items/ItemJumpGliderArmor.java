package me.leonardjackson.jumpglider.items;

import me.leonardjackson.jumpglider.JumpGlider;
import me.leonardjackson.jumpglider.Reference;
import me.leonardjackson.jumpglider.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemJumpGliderArmor extends ItemArmor {

	public ItemJumpGliderArmor(String unlocalizedName, ArmorMaterial material, int index, EntityEquipmentSlot armorSlot) {
		super(material, index, armorSlot);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		setCreativeTab(JumpGlider.CREATIVE_TAB);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot armorSlot, String layer){
		
		String name = this.getUnwrappedUnlocalizedName(super.getUnlocalizedName());
		name = name.substring(0, name.indexOf('_'));
		
		return String.format("%s:textures/models/armor/%s_layer_%d.png", Reference.MOD_ID, name, armorSlot.getSlotIndex() == 2 ? 2 : 1);
	}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {
		ModelBiped armorModel = ModItems.armorModels.get(this);
		
		if (armorModel != null) {
			armorModel.bipedHead.showModel = armorSlot.getSlotIndex() == 0;
			armorModel.bipedHeadwear.showModel = false;

			armorModel.bipedBody.showModel = armorSlot.getSlotIndex() == 1 || armorSlot.getSlotIndex() == 2;

			armorModel.bipedRightArm.showModel = armorSlot.getSlotIndex() ==  1;
			armorModel.bipedLeftArm.showModel = armorSlot.getSlotIndex() ==  1;
			
			armorModel.bipedRightLeg.showModel = armorSlot.getSlotIndex() == 2|| armorSlot.getSlotIndex() == 3;
			armorModel.bipedLeftLeg.showModel = armorSlot.getSlotIndex() == 2|| armorSlot.getSlotIndex() == 3;
			
			armorModel.isChild = entityLiving.isChild();
			armorModel.isRiding = entityLiving.isRiding();
			armorModel.isSneak = entityLiving.isSneaking();
		}

		return armorModel;
	}

	private void getPotionEffect(EntityPlayer player, Potion potion, int amplifier) {
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
			player.addPotionEffect(new PotionEffect(potion, 2, 1, false, false));
		}
	}

	public boolean isGliding;
	public double letGo;

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		Potion haste = Potion.getPotionById(3);
		Potion speed = Potion.getPotionById(1);

		if (itemStack.getItem() == ModItems.jumpGliderHelm) {
			getPotionEffect(player, haste, 1);
		}
		
		// if player wearing chestplate they will have the ability to glide forward while in the air
		if (itemStack.getItem() == ModItems.jumpGliderWings) {
			boolean inAir = !player.onGround && player.motionY < 0 && !player.isInWater();
			boolean sneaking = player.isSneaking();

			double horizontalSpeed = 0.08;
			double verticalSpeed = 0.5;
			
			if (inAir && sneaking) {

				player.motionY *= verticalSpeed;
				double x = Math.cos(Math.toRadians(player.rotationYawHead + 90)) * horizontalSpeed;
				double z = Math.sin(Math.toRadians(player.rotationYawHead + 90)) * horizontalSpeed;
				player.motionX += x;
				player.motionZ += z;
				player.fallDistance = 0F;
			}
			
			isGliding = true;
		}
		
		// if player is wearing the leggings they will get a speed potion
		if (itemStack.getItem() == ModItems.jumpGliderLeggings) {
			getPotionEffect(player, speed, 1);
		}
		
		// if player wearing boots they will get a jet pack type effect shooting them in the air to use their glider wings
		if (itemStack.getItem() == ModItems.jumpGliderBoots) {
			if (player.isAirBorne) {
				EntityPlayerSP singlePlayer = Minecraft.getMinecraft().thePlayer;
				double addY = 0.05D;
				if (singlePlayer.movementInput.jump) {
					singlePlayer.motionY += (addY * 3.0F);
					letGo = player.posY;
				}
			}
		}
		
		// if player is wearing both leggings and boots they will get step assist
		ItemStack jumpBoots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
		ItemStack leggings = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		if (jumpBoots != null && jumpBoots.getItem() == ModItems.jumpGliderBoots &&
				leggings != null && leggings.getItem() == ModItems.jumpGliderLeggings) {
			player.stepHeight = 1.0023F;
		} else {
			player.stepHeight = 0.6F;
		}

		super.onArmorTick(world, player, itemStack);
	}

}

















