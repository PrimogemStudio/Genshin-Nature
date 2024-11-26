// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgeo_hypostasis_pillar extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public Modelgeo_hypostasis_pillar() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -40.0F, -6.0F, 12.0F, 40.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -39.0F, 1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -36.0F, -6.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -29.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -32.0F, -5.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -34.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -26.0F, -5.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -18.0F, -2.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -24.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -22.0F, -6.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -13.0F, 1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -14.0F, -6.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -9.0F, -1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(6.0F, -4.0F, -5.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -39.0F, 1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -36.0F, -6.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -34.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -32.0F, -5.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -29.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -24.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -26.0F, -5.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -22.0F, -6.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -18.0F, -2.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -14.0F, -6.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -13.0F, 1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -9.0F, -1.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 56).addBox(-7.0F, -4.0F, -5.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -21.5769F, 6.8846F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -3.1416F, 1.5708F, 3.1416F);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, 18.5769F, -4.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, 13.5769F, -0.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, 9.5769F, 1.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, 8.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, 4.5769F, -1.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, 0.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, -3.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, -1.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, -6.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, -9.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, -11.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, -13.4231F, -5.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(12.5F, -16.4231F, 1.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, 18.5769F, -4.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, 13.5769F, -0.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, 9.5769F, 1.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, 8.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, 4.5769F, -1.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, 0.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, -3.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, -1.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, -6.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, -9.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, -11.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, -13.4231F, -5.8846F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 56).addBox(0.5F, -16.4231F, 1.1154F, 1.0F, 3.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}