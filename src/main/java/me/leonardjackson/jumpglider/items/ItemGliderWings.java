package me.leonardjackson.jumpglider.items;

import me.leonardjackson.jumpglider.Reference;
import me.leonardjackson.jumpglider.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemGliderWings extends ItemArmor {
	

	public ItemGliderWings() {
		
		super(EnumHelper.addArmorMaterial("GLIDER_WINGS", "items/gliderWings", 5, new int[] {1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F), 0, EntityEquipmentSlot.CHEST);
		setUnlocalizedName(Reference.JumpGliderItems.GLIDER_WINGS.getUnlocalizedName());
		setRegistryName(Reference.JumpGliderItems.GLIDER_WINGS.getRegistryName());
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == Items.LEATHER;
	}
	
	@Override
	public boolean isValidArmor(ItemStack stack, EntityEquipmentSlot armorType, Entity entity) {
		return armorType == EntityEquipmentSlot.CHEST;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return "jumpglider:items/glider.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (itemStack.getItem() == ModItems.gliderWings) {
			boolean inAir = !player.onGround && player.motionY < 0 && !player.isInWater();
			boolean sneaking = player.isSneaking();

			double horizontalSpeed = 0.08;
			double verticalSpeed = 0.5;
			
			if (inAir && sneaking) {
				System.out.println("should be gliding");
				player.motionY *= verticalSpeed;
				double x = Math.cos(Math.toRadians(player.rotationYawHead + 90)) * horizontalSpeed;
				double z = Math.sin(Math.toRadians(player.rotationYawHead + 90)) * horizontalSpeed;
				player.motionX += x;
				player.motionZ += z;
				player.fallDistance = 0F;
			}
		}
	}
	
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World world, EntityPlayer player, EnumHand hand) {
		EntityEquipmentSlot entityEquipmentSlot = EntityLiving.getSlotForItemStack(itemStackIn);
		ItemStack itemStack = player.getItemStackFromSlot(entityEquipmentSlot);

		if (itemStack == null) {
			player.setItemStackToSlot(entityEquipmentSlot, itemStackIn.copy());
			itemStackIn.stackSize = 0;
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		} else {
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemStackIn);
		}
		
	}
}