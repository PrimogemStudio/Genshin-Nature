package net.mcreator.genshinnature.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelthunder_manifestation<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelthunder_manifestation"), "main");
	public final ModelPart head;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart bone;
	public final ModelPart bb_main;

	public Modelthunder_manifestation(ModelPart root) {
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-2.0F, -10.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
						.addBox(-1.0F, -14.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(2.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 18).addBox(-3.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 17).mirror().addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -9.5F, -4.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 17).addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.5F, -4.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r3 = head.addOrReplaceChild(
				"cube_r3", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-9.5F, -2.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 0).mirror()
						.addBox(-8.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 8).mirror().addBox(-6.5F, 1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.5F, -8.0F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 8).addBox(0.5F, 1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
				.addBox(5.5F, -2.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0).addBox(0.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -8.0F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 49).addBox(-19.5F, -2.0F, -0.5F, 20.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
				.addBox(-20.5F, -5.0F, -0.5F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 22).addBox(-24.5F, -5.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -2.0F, 0.5F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r5 = leftarm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 61).addBox(-16.5F, -1.0F, -0.5F, 17.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.9829F, -1.2611F, -0.5F, 20.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 38).mirror()
						.addBox(-0.9829F, -4.2611F, -0.5F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 22).mirror().addBox(20.0171F, -4.2611F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9829F, -2.7389F, 0.5F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r6 = rightarm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -1.0F, -0.5F, 17.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4829F, 3.7389F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(44, 33).addBox(-2.5F, -33.0F, -2.5F, 5.0F, 26.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(33, 6).addBox(-2.5F, -32.0F, -3.5F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 4)
						.addBox(-3.5F, -32.0F, -2.5F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 4).mirror().addBox(2.5F, -32.0F, -2.5F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 6)
						.addBox(-2.5F, -32.0F, 2.5F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 24).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 15)
						.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(20, 30).mirror().addBox(-5.0F, -4.6733F, 3.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 30).mirror()
						.addBox(-5.0F, -4.6733F, -3.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 27).mirror().addBox(-6.0F, -4.6733F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 24)
						.mirror().addBox(-5.0F, -9.6133F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 24).mirror().addBox(-4.0F, -5.6733F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 24).mirror().addBox(-5.0F, -7.6733F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.5F, -31.6667F, 0.0F, -0.2182F, 0.0F, -0.3491F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(20, 30).mirror().addBox(1.5F, -5.0F, 3.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 30).mirror().addBox(1.5F, -5.0F, -3.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(18, 27).mirror().addBox(5.5F, -5.0F, -2.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 24).mirror().addBox(4.5F, -10.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 24).mirror().addBox(2.5F, -8.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 24).mirror().addBox(0.5F, -6.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 24).mirror().addBox(-0.5F, -3.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -31.5F, 0.0F, -0.2182F, 0.0F, 0.3491F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-2.5F, -3.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -31.5F, 0.0F, -0.2182F, 0.0F, -0.3491F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(43, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -19.5F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(43, 25).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -19.5F, 0.0F, 0.0F, 0.0F, 0.1745F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
