package me.leonardjackson.jumpglider.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelGliderWings extends ModelBase {

    private ModelRenderer leftwingbase;
    private ModelRenderer leftwingone;
    private ModelRenderer leftwingtwo;
    private ModelRenderer leftwingthree;
    private ModelRenderer leftwingfour;
    private ModelRenderer leftwingfive;
    private ModelRenderer leftwingsix;
    private ModelRenderer leftwingseven;
    private ModelRenderer leftwingeight;
    private ModelRenderer leftwingnine;
    private ModelRenderer leftwingten;
    private ModelRenderer leftwingeleven;
    private ModelRenderer rightwingbase;
    private ModelRenderer rightwingone;
    private ModelRenderer rightwingtwo;
    private ModelRenderer rightwingthree;
    private ModelRenderer rightwingfour;
    private ModelRenderer rightwingfive;
    private ModelRenderer rightwingsix;
    private ModelRenderer rightwingseven;
    private ModelRenderer rightwingeight;
    private ModelRenderer rightwingnine;
    private ModelRenderer rightwingten;
    private ModelRenderer rightwingeleven;
  
    public ModelGliderWings() {
        textureWidth = 64;
        textureHeight = 64;
        
        leftwingbase = new ModelRenderer(this, 16, 33);
        leftwingbase.addBox(1F, 3F, 2F, 1, 2, 1);
        leftwingbase.setRotationPoint(0F, 0F, 0F);
        leftwingbase.setTextureSize(64, 64);
        leftwingbase.mirror = true;
        setRotation(leftwingbase, 0F, 0F, 0F);

        leftwingone = new ModelRenderer(this, 2, 33);
        leftwingone.addBox(5.3F, -1F, 2.8F, 2, 1, 1);
        leftwingone.setRotationPoint(0F, 0F, 0F);
        leftwingone.setTextureSize(64, 64);
        leftwingone.mirror = true;
        setRotation(leftwingone, 0F, -0.0872665F, 0F);

        leftwingtwo = new ModelRenderer(this, 1, 35);
        leftwingtwo.addBox(3.3F, 0F, 2.8F, 5, 1, 1);
        leftwingtwo.setRotationPoint(0F, 0F, 0F);
        leftwingtwo.setTextureSize(64, 64);
        leftwingtwo.mirror = true;
        setRotation(leftwingtwo, 0F, -0.0872665F, 0F);

        leftwingthree = new ModelRenderer(this, 0, 37);
        leftwingthree.addBox(2.3F, 1F, 2.8F, 7, 1, 1);
        leftwingthree.setRotationPoint(0F, 0F, 0F);
        leftwingthree.setTextureSize(64, 64);
        leftwingthree.mirror = true;
        setRotation(leftwingthree, 0F, -0.0872665F, 0F);

        leftwingfour = new ModelRenderer(this, 0, 39);
        leftwingfour.addBox(1.3F, 2F, 2.8F, 8, 4, 1);
        leftwingfour.setRotationPoint(0F, 0F, 0F);
        leftwingfour.setTextureSize(64, 64);
        leftwingfour.mirror = true;
        setRotation(leftwingfour, 0F, -0.0872665F, 0F);

        leftwingfive = new ModelRenderer(this, 0, 44);
        leftwingfive.addBox(2.3F, 6F, 2.8F, 7, 1, 1);
        leftwingfive.setRotationPoint(0F, 0F, 0F);
        leftwingfive.setTextureSize(64, 64);
        leftwingfive.mirror = true;
        setRotation(leftwingfive, 0F, -0.0872665F, 0F);

        leftwingsix = new ModelRenderer(this, 0, 46);
        leftwingsix.addBox(3.3F, 7F, 2.8F, 6, 2, 1);
        leftwingsix.setRotationPoint(0F, 0F, 0F);
        leftwingsix.setTextureSize(64, 64);
        leftwingsix.mirror = true;
        setRotation(leftwingsix, 0F, -0.0872665F, 0F);

        leftwingseven = new ModelRenderer(this, 0, 49);
        leftwingseven.addBox(4.3F, 9F, 2.8F, 5, 1, 1);
        leftwingseven.setRotationPoint(0F, 0F, 0F);
        leftwingseven.setTextureSize(64, 64);
        leftwingseven.mirror = true;
        setRotation(leftwingseven, 0F, -0.0872665F, 0F);

        leftwingeight = new ModelRenderer(this, 0, 51);
        leftwingeight.addBox(5.3F, 10F, 2.8F, 4, 1, 1);
        leftwingeight.setRotationPoint(0F, 0F, 0F);
        leftwingeight.setTextureSize(64, 64);
        leftwingeight.mirror = true;
        setRotation(leftwingeight, 0F, -0.0872665F, 0F);

        leftwingnine = new ModelRenderer(this, 0, 53);
        leftwingnine.addBox(6.3F, 11F, 2.8F, 3, 2, 1);
        leftwingnine.setRotationPoint(0F, 0F, 0F);
        leftwingnine.setTextureSize(64, 64);
        leftwingnine.mirror = true;
        setRotation(leftwingnine, 0F, -0.0872665F, 0F);

        leftwingten = new ModelRenderer(this, 0, 56);
        leftwingten.addBox(7.3F, 13F, 2.8F, 2, 1, 1);
        leftwingten.setRotationPoint(0F, 0F, 0F);
        leftwingten.setTextureSize(64, 64);
        leftwingten.mirror = true;
        setRotation(leftwingten, 0F, -0.0872665F, 0F);

        leftwingeleven = new ModelRenderer(this, 3, 33);
        leftwingeleven.addBox(8.3F, 14F, 2.8F, 1, 1, 1);
        leftwingeleven.setRotationPoint(0F, 0F, 0F);
        leftwingeleven.setTextureSize(64, 64);
        leftwingeleven.mirror = true;
        setRotation(leftwingeleven, 0F, -0.0872665F, 0F);

        rightwingbase = new ModelRenderer(this, 16, 33);
        rightwingbase.addBox(-2F, 3F, 2F, 1, 2, 1);
        rightwingbase.setRotationPoint(0F, 0F, 0F);
        rightwingbase.setTextureSize(64, 64);
        rightwingbase.mirror = true;
        setRotation(rightwingbase, 0F, 0F, 0F);

        rightwingone = new ModelRenderer(this, 2, 33);
        rightwingone.addBox(-7.3F, -1F, 2.8F, 2, 1, 1);
        rightwingone.setRotationPoint(0F, 0F, 0F);
        rightwingone.setTextureSize(64, 64);
        rightwingone.mirror = true;
        setRotation(rightwingone, 0F, 0.0872665F, 0F);

        rightwingtwo = new ModelRenderer(this, 22, 35);
        rightwingtwo.addBox(-8.3F, 0F, 2.8F, 5, 1, 1);
        rightwingtwo.setRotationPoint(0F, 0F, 0F);
        rightwingtwo.setTextureSize(64, 64);
        rightwingtwo.mirror = true;
        setRotation(rightwingtwo, 0F, 0.0872665F, 0F);

        rightwingthree = new ModelRenderer(this, 20, 37);
        rightwingthree.addBox(-9.3F, 1F, 2.8F, 7, 1, 1);
        rightwingthree.setRotationPoint(0F, 0F, 0F);
        rightwingthree.setTextureSize(64, 64);
        rightwingthree.mirror = true;
        setRotation(rightwingthree, 0F, 0.0872665F, 0F);

        rightwingfour = new ModelRenderer(this, 19, 39);
        rightwingfour.addBox(-9.3F, 2F, 2.8F, 8, 4, 1);
        rightwingfour.setRotationPoint(0F, 0F, 0F);
        rightwingfour.setTextureSize(64, 64);
        rightwingfour.mirror = true;
        setRotation(rightwingfour, 0F, 0.0872665F, 0F);

        rightwingfive = new ModelRenderer(this, 20, 44);
        rightwingfive.addBox(-9.3F, 6F, 2.8F, 7, 1, 1);
        rightwingfive.setRotationPoint(0F, 0F, 0F);
        rightwingfive.setTextureSize(64, 64);
        rightwingfive.mirror = true;
        setRotation(rightwingfive, 0F, 0.0872665F, 0F);

        rightwingsix = new ModelRenderer(this, 21, 46);
        rightwingsix.addBox(-9.3F, 7F, 2.8F, 6, 2, 1);
        rightwingsix.setRotationPoint(0F, 0F, 0F);
        rightwingsix.setTextureSize(64, 64);
        rightwingsix.mirror = true;
        setRotation(rightwingsix, 0F, 0.0872665F, 0F);

        rightwingseven = new ModelRenderer(this, 22, 49);
        rightwingseven.addBox(-9.3F, 9F, 2.8F, 5, 1, 1);
        rightwingseven.setRotationPoint(0F, 0F, 0F);
        rightwingseven.setTextureSize(64, 64);
        rightwingseven.mirror = true;
        setRotation(rightwingseven, 0F, 0.0872665F, 0F);

        rightwingeight = new ModelRenderer(this, 23, 51);
        rightwingeight.addBox(-9.3F, 10F, 2.8F, 4, 1, 1);
        rightwingeight.setRotationPoint(0F, 0F, 0F);
        rightwingeight.setTextureSize(64, 64);
        rightwingeight.mirror = true;
        setRotation(rightwingeight, 0F, 0.0872665F, 0F);

        rightwingnine = new ModelRenderer(this, 24, 53);
        rightwingnine.addBox(-9.3F, 11F, 2.8F, 3, 2, 1);
        rightwingnine.setRotationPoint(0F, 0F, 0F);
        rightwingnine.setTextureSize(64, 64);
        rightwingnine.mirror = true;
        setRotation(rightwingnine, 0F, 0.0872665F, 0F);

        rightwingten = new ModelRenderer(this, 25, 56);
        rightwingten.addBox(-9.3F, 13F, 2.8F, 2, 1, 1);
        rightwingten.setRotationPoint(0F, 0F, 0F);
        rightwingten.setTextureSize(64, 64);
        rightwingten.mirror = true;
        setRotation(rightwingten, 0F, 0.0872665F, 0F);

        rightwingeleven = new ModelRenderer(this, 3, 33);
        rightwingeleven.addBox(-9.3F, 14F, 2.8F, 1, 1, 1);
        rightwingeleven.setRotationPoint(0F, 0F, 0F);
        rightwingeleven.setTextureSize(64, 64);
        rightwingeleven.mirror = true;
        setRotation(rightwingeleven, 0F, 0.0872665F, 0F);
        
  }
  
    public void render(float size) {
    	leftwingbase.render(size);
        leftwingone.render(size);
        leftwingtwo.render(size);
        leftwingthree.render(size);
        leftwingfour.render(size);
        leftwingfive.render(size);
        leftwingsix.render(size);
        leftwingseven.render(size);
        leftwingeight.render(size);
        leftwingnine.render(size);
        leftwingten.render(size);
        leftwingeleven.render(size);
        rightwingbase.render(size);
        rightwingone.render(size);
        rightwingtwo.render(size);
        rightwingthree.render(size);
        rightwingfour.render(size);
        rightwingfive.render(size);
        rightwingsix.render(size);
        rightwingseven.render(size);
        rightwingeight.render(size);
        rightwingnine.render(size);
        rightwingten.render(size);
        rightwingeleven.render(size);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {

    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
