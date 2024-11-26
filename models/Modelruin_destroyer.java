// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_destroyer extends EntityModel<Entity> {
	private final ModelRenderer HEAD;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;

	public Modelruin_destroyer() {
		textureWidth = 64;
		textureHeight = 64;

		HEAD = new ModelRenderer(this);
		HEAD.setRotationPoint(0.6837F, -2.1867F, -5.1115F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0811F, -2.5475F, -1.6314F);
		HEAD.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.8733F, 0.1525F, 0.1201F);
		cube_r1.setTextureOffset(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-7.9189F, -6.5475F, -5.6314F);
		HEAD.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(52, 0).addBox(7.0F, 2.0F, -1.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(8.0811F, -6.5475F, -5.6314F);
		HEAD.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.0873F, -0.0436F);
		cube_r3.setTextureOffset(36, 30).addBox(-8.0F, -1.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.9189F, -6.5475F, -5.6314F);
		HEAD.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0873F, 0.0436F);
		cube_r4.setTextureOffset(36, 30).addBox(0.0F, -1.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.8483F, -2.4987F, -5.8885F);
		HEAD.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0436F, 0.0F, 0.829F);
		cube_r5.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.5239F, -2.6591F, -5.8885F);
		HEAD.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0436F, 0.0F, -0.7854F);
		cube_r6.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 2.0F, 6.0F, 0.0F, true);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.4157F, -19.658F, -0.1553F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.6039F, -0.9947F, -1.1882F);
		cube_r7.setTextureOffset(6, 15).addBox(7.0F, 1.0F, 0.6553F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(6, 15).addBox(7.0F, -5.0F, 0.6553F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(6, 15).addBox(7.0F, -1.342F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(6, 15).addBox(7.0F, -1.342F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(22, 15).addBox(3.0F, -3.0F, -1.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 27).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1705F, -0.0376F, -0.215F);
		cube_r8.setTextureOffset(15, 55).addBox(0.0F, -1.0F, -8.0F, 8.0F, 1.0F, 8.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1705F, 0.0376F, 0.215F);
		cube_r9.setTextureOffset(15, 55).addBox(-8.0F, -1.0F, -8.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.797F, -2.0279F, 3.7041F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.3526F, -1.3963F, -1.5708F);
		cube_r10.setTextureOffset(15, 55).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, true);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.6696F, -23.5124F, -2.2971F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, -2.4726F, 0.356F, -0.8616F);
		cube_r11.setTextureOffset(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.9764F, -11.7328F, -0.5003F);
		bb_main.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.4673F, -0.5982F, -2.9911F);
		cube_r12.setTextureOffset(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -4.0F, 0.0F);
		bb_main.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0865F, -0.0114F, 1.0031F);
		cube_r13.setTextureOffset(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.797F, -2.0279F, 3.7041F);
		bb_main.addChild(cube_r14);
		setRotationAngle(cube_r14, 1.3526F, 1.3963F, 1.5708F);
		cube_r14.setTextureOffset(15, 55).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		HEAD.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.HEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.HEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}