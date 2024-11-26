// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelelectro_regisvine extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer head;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r12;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public Modelelectro_regisvine() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -14.5F, 4.0F);
		bone.setTextureOffset(94, 87).addBox(-4.0F, 5.5F, -6.0F, 9.0F, 33.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, 38.0F, -7.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 2.4435F, 0.0F, -3.1416F);
		cube_r1.setTextureOffset(104, 65).addBox(-4.5F, -8.5F, -1.5F, 9.0F, 9.0F, 3.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 38.0F, 3.5F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6981F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(104, 65).addBox(-4.5F, -8.5F, -1.5F, 9.0F, 9.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.5F, 38.0F, -2.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.6981F);
		cube_r3.setTextureOffset(0, 111).addBox(-1.5F, -8.5F, -4.0F, 3.0F, 9.0F, 8.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.5F, 38.0F, -2.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.6981F);
		cube_r4.setTextureOffset(0, 111).addBox(-1.5F, -8.5F, -4.0F, 3.0F, 9.0F, 8.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, -16.5668F, 10.9249F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(94, 91).addBox(-4.5F, -25.6577F, -3.3126F, 9.0F, 29.0F, 8.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(94, 92).addBox(-3.9F, -20.5F, -1.9F, 9.0F, 28.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.5F, -53.3932F, 7.5616F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -1.7084F, 0.3489F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.3526F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 58).addBox(-4.49F, -15.6264F, -2.7579F, 9.0F, 20.0F, 7.0F, 0.0F, false);
		cube_r7.setTextureOffset(106, 14).addBox(-2.5F, -18.6264F, 3.2421F, 5.0F, 3.0F, 6.0F, 0.0F, false);
		cube_r7.setTextureOffset(25, 30).addBox(-1.5F, -21.6264F, 3.2421F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r7.setTextureOffset(25, 30).addBox(3.5F, -21.6264F, -1.7579F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(106, 14).addBox(3.5F, -18.6264F, -2.7579F, 6.0F, 3.0F, 5.0F, 0.0F, true);
		cube_r7.setTextureOffset(106, 14).addBox(-9.5F, -18.6264F, -2.7579F, 6.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r7.setTextureOffset(25, 30).addBox(-8.5F, -21.6264F, -1.7579F, 5.0F, 3.0F, 3.0F, 0.0F, true);
		cube_r7.setTextureOffset(75, 26).addBox(-3.5F, -21.6264F, -4.7579F, 7.0F, 6.0F, 8.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.0F, -8.6706F, -18.0576F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.4366F, -0.1726F, -0.9047F);
		cube_r8.setTextureOffset(25, 30).addBox(-1.5F, -2.1493F, -0.5711F, 3.0F, 3.0F, 6.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, -8.6706F, -18.0576F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.4366F, 0.1726F, 0.9047F);
		cube_r9.setTextureOffset(25, 30).addBox(-1.5F, -2.1493F, -0.5711F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-6.0F, 0.3168F, -14.0419F);
		head.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2618F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.4153F, 0.1536F, 0.7734F);
		cube_r10.setTextureOffset(0, 50).addBox(-47.9591F, -3.0862F, 4.7932F, 49.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-13.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-23.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-33.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-43.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-13.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-23.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-33.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(-43.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(43.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(33.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(23.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(13.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(13.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(23.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(33.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(104, 0).addBox(43.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 50).addBox(5.0409F, -3.0862F, 4.7932F, 49.0F, 3.0F, 5.0F, 0.0F, true);
		cube_r10.setTextureOffset(0, 0).addBox(5.0409F, 0.9138F, 0.7932F, 19.0F, 1.0F, 13.0F, 0.0F, true);
		cube_r10.setTextureOffset(0, 0).addBox(-17.9591F, 0.9138F, 0.7932F, 19.0F, 1.0F, 13.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.1917F, -6.7106F, -12.5568F);
		head.addChild(bone3);
		setRotationAngle(bone3, 0.3638F, 0.0819F, 1.8098F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.9502F, 4.3243F, -0.7707F);
		bone3.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.4153F, 0.1536F, 0.7734F);
		cube_r11.setTextureOffset(0, 0).addBox(-17.3668F, 0.9432F, -0.1464F, 19.0F, 1.0F, 13.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-44.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-34.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-14.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-24.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-14.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-24.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-34.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(-44.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(43.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(33.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(23.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(13.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(13.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(23.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(33.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(104, 0).addBox(43.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(0, 50).addBox(5.6332F, -4.0568F, 3.8536F, 49.0F, 3.0F, 5.0F, 0.0F, true);
		cube_r11.setTextureOffset(0, 50).addBox(-48.3668F, -4.0568F, 3.8536F, 49.0F, 3.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(3.1917F, -6.7106F, -12.5568F);
		head.addChild(bone4);
		setRotationAngle(bone4, 0.3638F, 0.0819F, 1.8098F);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.9502F, 4.3243F, -0.7707F);
		bone4.addChild(cube_r12);
		setRotationAngle(cube_r12, 1.4153F, 0.1536F, 0.7734F);
		cube_r12.setTextureOffset(0, 0).addBox(5.6332F, 0.9432F, -0.1464F, 19.0F, 1.0F, 13.0F, 0.0F, true);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.2976F, -52.8022F, 0.9342F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(37.5176F, 23.5885F, -6.5786F);
		leftarm.addChild(cube_r13);
		setRotationAngle(cube_r13, 1.4604F, 0.1886F, 1.0367F);
		cube_r13.setTextureOffset(64, 67).addBox(15.1987F, -2.0671F, -11.3556F, 3.0F, 5.0F, 9.0F, 0.0F, false);
		cube_r13.setTextureOffset(64, 67).addBox(15.1987F, -2.0671F, 2.6444F, 3.0F, 5.0F, 9.0F, 0.0F, false);
		cube_r13.setTextureOffset(48, 67).addBox(15.1987F, 2.9329F, -2.3556F, 3.0F, 9.0F, 5.0F, 0.0F, false);
		cube_r13.setTextureOffset(48, 67).addBox(15.1987F, -11.0671F, -2.3556F, 3.0F, 9.0F, 5.0F, 0.0F, false);
		cube_r13.setTextureOffset(46, 122).addBox(19.1987F, -1.0671F, -1.3556F, 12.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r13.setTextureOffset(21, 96).addBox(-1.8013F, -2.0671F, -2.3556F, 21.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(19.0869F, 20.1019F, -4.4707F);
		leftarm.addChild(cube_r14);
		setRotationAngle(cube_r14, 1.3598F, 0.056F, 0.2559F);
		cube_r14.setTextureOffset(28, 108).addBox(-1.9995F, -3.3997F, -1.0152F, 21.0F, 5.0F, 5.0F, 0.0F, true);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-9.7976F, -0.2742F, -7.4145F);
		leftarm.addChild(cube_r15);
		setRotationAngle(cube_r15, 1.4153F, 0.1536F, 0.7734F);
		cube_r15.setTextureOffset(0, 86).addBox(3.0409F, 3.9138F, 4.7932F, 30.0F, 5.0F, 5.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-2.1907F, -53.4099F, 1.5633F);
		setRotationAngle(rightarm, -2.9138F, -0.0198F, 3.0286F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(37.5725F, 24.7002F, -5.4583F);
		rightarm.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.4604F, 0.1886F, 1.0367F);
		cube_r16.setTextureOffset(64, 67).addBox(15.1987F, -2.0671F, -11.3556F, 3.0F, 5.0F, 9.0F, 0.0F, false);
		cube_r16.setTextureOffset(64, 67).addBox(15.1987F, -2.0671F, 2.6444F, 3.0F, 5.0F, 9.0F, 0.0F, false);
		cube_r16.setTextureOffset(48, 67).addBox(15.1987F, 2.9329F, -2.3556F, 3.0F, 9.0F, 5.0F, 0.0F, false);
		cube_r16.setTextureOffset(48, 67).addBox(15.1987F, -11.0671F, -2.3556F, 3.0F, 9.0F, 5.0F, 0.0F, false);
		cube_r16.setTextureOffset(46, 122).addBox(19.1987F, -1.0671F, -1.3556F, 12.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r16.setTextureOffset(21, 96).addBox(-1.8013F, -2.0671F, -2.3556F, 21.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(19.1418F, 21.2136F, -3.3504F);
		rightarm.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.3598F, 0.056F, 0.2559F);
		cube_r17.setTextureOffset(28, 108).addBox(-1.9995F, -3.4037F, -1.0152F, 21.0F, 5.0F, 5.0F, 0.0F, true);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-9.7427F, 0.8375F, -6.2942F);
		rightarm.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.4153F, 0.1536F, 0.7734F);
		cube_r18.setTextureOffset(0, 86).addBox(3.0409F, 3.9138F, 4.7932F, 30.0F, 5.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}