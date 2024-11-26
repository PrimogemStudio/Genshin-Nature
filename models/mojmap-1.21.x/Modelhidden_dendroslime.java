// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelhidden_dendroslime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hidden_dendroslime"), "main");
	private final ModelPart leaves;
	private final ModelPart leaves2;
	private final ModelPart leaves3;

	public Modelhidden_dendroslime(ModelPart root) {
		this.leaves = root.getChild("leaves");
		this.leaves2 = root.getChild("leaves2");
		this.leaves3 = root.getChild("leaves3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leaves = partdefinition.addOrReplaceChild("leaves", CubeListBuilder.create().texOffs(15, 27).addBox(0.1162F, 8.2535F, -3.7592F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 13.0937F, -2.9226F, 0.3771F, 0.5603F, 0.0662F));

		PartDefinition cube_r1 = leaves.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 34).addBox(-0.8838F, -2.6771F, -13.9328F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5315F, -1.1131F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leaves.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 29).addBox(0.1162F, 6.8218F, -9.2098F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0937F, 0.4226F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leaves2 = partdefinition.addOrReplaceChild("leaves2", CubeListBuilder.create().texOffs(15, 27).addBox(-0.4953F, 8.3931F, -3.3982F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.0937F, -2.9226F, 0.3064F, -0.6225F, 0.0005F));

		PartDefinition cube_r3 = leaves2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 34).addBox(-1.4953F, -2.2902F, -13.9236F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5315F, -1.1131F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leaves2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 29).addBox(-0.4953F, 7.1008F, -8.9416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0937F, 0.4226F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leaves3 = partdefinition.addOrReplaceChild("leaves3", CubeListBuilder.create().texOffs(15, 27).addBox(-0.3513F, 8.6497F, -2.4348F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 13.0937F, 2.0774F, -2.9273F, 0.1281F, 3.128F));

		PartDefinition cube_r5 = leaves3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 34).addBox(-1.3513F, -1.3019F, -13.792F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.5315F, -1.1131F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leaves3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 29).addBox(-0.3513F, 7.7405F, -8.1769F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0937F, 0.4226F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leaves.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leaves2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leaves3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}