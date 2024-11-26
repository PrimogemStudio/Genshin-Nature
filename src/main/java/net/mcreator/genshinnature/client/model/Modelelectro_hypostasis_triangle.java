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
public class Modelelectro_hypostasis_triangle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelelectro_hypostasis_triangle"), "main");
	public final ModelPart bone;
	public final ModelPart inside_cube;
	public final ModelPart bone2;

	public Modelelectro_hypostasis_triangle(ModelPart root) {
		this.bone = root.getChild("bone");
		this.inside_cube = this.bone.getChild("inside_cube");
		this.bone2 = this.inside_cube.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition inside_cube = bone.addOrReplaceChild("inside_cube",
				CubeListBuilder.create().texOffs(14, 14).addBox(-4.0F, -11.0F, -3.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(94, 118).addBox(-4.0F, -8.0F, -10.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition cube_r1 = inside_cube.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 118).addBox(-3.0F, -0.5F, -2.5F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -7.5F, 4.5F, 0.0F, 0.9599F, 0.0F));
		PartDefinition bone2 = inside_cube.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-4.0F, -7.5F, 3.5F));
		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 118).addBox(-4.0F, -0.5F, -2.5F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.9599F, 0.0F));
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
