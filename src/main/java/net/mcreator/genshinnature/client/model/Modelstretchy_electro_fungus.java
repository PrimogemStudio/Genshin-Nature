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
public class Modelstretchy_electro_fungus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelstretchy_electro_fungus"), "main");
	public final ModelPart bone;
	public final ModelPart hat;
	public final ModelPart bone2;
	public final ModelPart bone3;

	public Modelstretchy_electro_fungus(ModelPart root) {
		this.bone = root.getChild("bone");
		this.hat = this.bone.getChild("hat");
		this.bone2 = this.hat.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(112, 106).addBox(-1.0F, -18.0F, -1.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 24.0F, -1.0F));
		PartDefinition hat = bone.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(36, 45).addBox(-9.0F, -22.0F, -7.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(58, 68)
				.addBox(-8.0F, -23.0F, -6.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(4, 75).addBox(-6.0F, -25.0F, -4.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 2.0F, 0.0F));
		PartDefinition bone2 = hat.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -24.0F, -1.0F, 0.0436F, -0.2182F, 0.0F));
		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.6099F, -2.4087F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 6.0F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 111).addBox(-4.0F, -7.0F, -3.6F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7304F, -10.7713F, 10.0654F, -0.0436F, -0.2618F, 0.0F));
		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 39).addBox(-1.0409F, -9.4897F, -3.5463F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0106F, 7.8469F, 9.5273F, 2.8666F, 0.8986F, 0.9314F));
		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(101, 32).addBox(-1.4362F, -2.7335F, -3.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7058F, 8.0047F, 8.3093F, -0.8979F, 1.0912F, 0.8807F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(114, 0).addBox(-1.0F, -6.0403F, -1.85F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2696F, 1.7713F, 6.9346F, -2.6364F, 1.0248F, -0.1554F));
		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 0).addBox(-0.9F, -6.4148F, -2.8F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7304F, 1.7713F, 1.9346F, -1.5241F, 0.5934F, 0.1867F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
