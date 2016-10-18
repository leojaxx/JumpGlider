package me.leonardjackson.jumpglider.client.render;

import me.leonardjackson.jumpglider.client.models.ModelGliderWings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class ModelCustomArmor extends ModelBiped {

	public static ModelCustomArmor INSTANCE = new ModelCustomArmor();
	public static Minecraft minecraft = Minecraft.getMinecraft();
	
	public ArmorModel modelType;
	
	public ModelCustomArmor() {
		resetPart(bipedHead, 0, 0, 0);
		resetPart(bipedBody, 0, 0, 0);
		resetPart(bipedRightArm, 0, 0, 0);
		resetPart(bipedLeftArm, 0, 0, 0);
		resetPart(bipedRightLeg, 0, 0, 0);
		resetPart(bipedLeftLeg, 0, 0, 0);
		
		bipedHeadwear.cubeList.clear();

	}
	
	public void init(Entity entity, float f, float f1, float f2, float f3, float f4, float size) {
		reset();
		
		isSneak = entity.isSneaking();
		isRiding = entity.isRiding();
		
		if (entity instanceof EntityLivingBase) {
			isChild = ((EntityLivingBase)entity).isChild();
		}
		
		if (modelType.armorSlot == 1) {
			bipedBody.isHidden = false;
			bipedBody.showModel = true;
			bipedRightArm.isHidden = false;
			bipedRightArm.showModel = true;
			bipedLeftArm.isHidden = false;
			bipedLeftArm.showModel = true;

		} else if (modelType.armorSlot == 3) {
			bipedLeftLeg.isHidden = false;
			bipedLeftLeg.showModel = true;
			bipedRightLeg.isHidden = false;
			bipedRightLeg.showModel = true;
		}
		
		setRotationAngles(size, f, f1, f2, f3, f4, entity);
		
	}
	
	public void reset() {
			bipedHead.isHidden = true;
			bipedBody.isHidden = true;
			bipedRightArm.isHidden = true;
			bipedLeftArm.isHidden = true;
			bipedRightLeg.isHidden = true;
			bipedLeftLeg.isHidden = true;

			bipedHead.showModel = false;
			bipedBody.showModel = false;
			bipedRightArm.showModel = false;
			bipedLeftArm.showModel = false;
			bipedRightLeg.showModel = false;
			bipedLeftLeg.showModel = false;
		}


	private void resetPart(ModelRenderer renderer, float x, float y, float z) {
		renderer.cubeList.clear();
		ModelCustom model = new ModelCustom(this, renderer);
		renderer.addChild(model);
		setOffset(renderer, x, y, z);
	}
	
	public void setOffset(ModelRenderer renderer, float x, float y, float z) {
		renderer.offsetX = x;
		renderer.offsetY = y;
		renderer.offsetZ = z;
	}
	
	public class ModelCustom extends ModelRenderer {
		public ModelCustomArmor biped;
		public ModelRenderer partRender;
		
		public ModelCustom(ModelCustomArmor base, ModelRenderer renderer) {
			super(base);
			biped = base;
			partRender = renderer;
		}
		
		@Override
		public void render(float size) {
			if (ModelCustomArmor.this.modelType != null) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.F, 0.F, 0.F);
				
				minecraft.renderEngine.bindTexture(modelType.resource);
				
				if (useModel(biped.modelType, partRender, biped )) {
					if (biped.modelType == ArmorModel.GLIDER_WINGS) {
						ArmorModel.gliderWingsModel.render(0.0625F);
					} 
//					else if (biped.modelType == ArmorModel.PROTECTED_GLIDER_WINGS) {
//						ArmorModel.protectedGliderWingsModel.render(0.0625F);
//					} else if (biped.modelType == ArmorModel.JUMP_BOOTS) {
//						GlStateManager.scale(1.02F, 1.02F, 1.02F);
//						
//						if (partRender == biped.bipedLeftLeg) {
//							GlStateManager.translate(-0.1375F, -0.75F, -0.0625F);
//							ArmorModel.jumpBootsModel.renderLeft(0.0625F);
//						} else if (partRender == biped.bipedRightLeg) {
//							GlStateManager.translate(-0.1375F, -0.75F, -0.0625F);
//							ArmorModel.jumpBootsModel.renderRight(0.0625F);
//{
//							
//						}
//					}
				}
					
				GlStateManager.popMatrix();
			}
		}
	}
	
	@Override 
	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		init(entity, par2, par3, par4, par5, par6, par7);
		super.render(entity, par2, par3, par4, par5, par6, par7);
	}

	public static boolean useModel(ArmorModel type, ModelRenderer partRender, ModelCustomArmor biped) {
		if (type.armorSlot == 1) {
			return partRender == biped.bipedBody;
		} else if (type.armorSlot == 3) {
			return partRender == biped.bipedLeftLeg || partRender == biped.bipedRightLeg;
		}
		
		return false;
	}

	public static enum ArmorModel {

		GLIDER_WINGS(1, new ResourceLocation("jumpglider", "textures/models/render/gliderwings.png")),
		PROTECTED_GLIDER_WINGS(1, new ResourceLocation("jumpGlider", "render/protectedgliderwings.png"));

		public int armorSlot;
		public ResourceLocation resource;
		
		public static ModelGliderWings gliderWingsModel = new ModelGliderWings();
		// public static ModelProtectedGliderWings protectedGliderWingsModel = new ModelProtectedGliderWings();
		// public static ModelGliderWings gliderWingsModel = new ModelGliderWings();
		
		private ArmorModel(int slot, ResourceLocation texture) {
			armorSlot = slot;
			resource = texture;
		}

	}
}
