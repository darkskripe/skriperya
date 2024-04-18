// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class RabittHat extends EntityModel<Entity> {
	private final ModelRenderer group;
	private final ModelRenderer bone2;
	private final ModelRenderer ureche2;
	private final ModelRenderer bone;
	private final ModelRenderer ureche;

	public RabittHat() {
		textureWidth = 128;
		textureHeight = 128;

		group = new ModelRenderer(this);
		group.setRotationPoint(0.0F, 25.0F, 0.0F);
		group.setTextureOffset(24, 99).addBox(-1.0F, -5.0F, 5.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		group.setTextureOffset(16, 60).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-3.0F, -2.0F, 4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-5.0F, -1.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(4.0F, -1.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		group.setTextureOffset(74, 103).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(4.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-5.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(28, 105).addBox(-5.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(4.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-5.0F, -8.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(4.0F, -8.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(4.0F, -7.0F, -4.0F, 1.0F, 6.0F, 8.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-5.0F, -7.0F, -4.0F, 1.0F, 6.0F, 8.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-5.0F, -5.0F, 4.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(4.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-5.0F, -6.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(18, 99).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 2.0F, 10.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(-5.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(24, 99).addBox(3.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -7.0F, 5.0F);
		group.addChild(bone2);
		

		ureche2 = new ModelRenderer(this);
		ureche2.setRotationPoint(0.0F, 4.0F, -6.0F);
		bone2.addChild(ureche2);
		setRotationAngle(ureche2, 0.0F, 0.0F, -0.3491F);
		ureche2.setTextureOffset(34, 75).addBox(-2.0F, -13.0F, 0.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		ureche2.setTextureOffset(31, 100).addBox(0.0F, -13.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		ureche2.setTextureOffset(31, 100).addBox(-3.0F, -13.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		ureche2.setTextureOffset(31, 100).addBox(-2.0F, -14.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -5.0F, 0.0F);
		ureche2.addChild(bone);
		

		ureche = new ModelRenderer(this);
		ureche.setRotationPoint(3.0F, 4.0F, -6.0F);
		bone2.addChild(ureche);
		setRotationAngle(ureche, 0.0F, 0.0F, 0.2618F);
		ureche.setTextureOffset(34, 75).addBox(-2.0F, -12.0F, 0.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		ureche.setTextureOffset(31, 100).addBox(0.0F, -12.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		ureche.setTextureOffset(31, 100).addBox(-3.0F, -12.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		ureche.setTextureOffset(31, 100).addBox(-2.0F, -13.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		group.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}