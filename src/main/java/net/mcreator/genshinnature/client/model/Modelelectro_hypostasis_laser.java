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
public class Modelelectro_hypostasis_laser<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelelectro_hypostasis_laser"), "main");
	public final ModelPart bone;
	public final ModelPart inside_cube;
	public final ModelPart outside_cubes;

	public Modelelectro_hypostasis_laser(ModelPart root) {
		this.bone = root.getChild("bone");
		this.inside_cube = this.bone.getChild("inside_cube");
		this.outside_cubes = this.bone.getChild("outside_cubes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 13.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition inside_cube = bone.addOrReplaceChild("inside_cube",
				CubeListBuilder.create().texOffs(7, 7).addBox(3.0F, -11.0F, -38.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-12.0F, -11.0F, -36.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-12.0F, -11.0F, -9.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(3.0F, -11.0F, -11.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(8.0F, -11.0F, 28.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-7.0F, -11.0F, 31.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-7.0F, -11.0F, 4.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(8.0F, -11.0F, 1.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -5.0F, 0.0F));
		PartDefinition cube_r1 = inside_cube.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(7, 7).addBox(14.0F, -2.0F, -32.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-2.0F, -2.0F, -30.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-15.0F, -2.0F, -40.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-15.0F, -2.0F, -14.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(8.0F, -2.0F, -39.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-4.0F, -2.0F, -34.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-19.0F, -2.0F, -29.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-19.0F, -2.0F, -56.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-4.0F, -2.0F, -61.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(8.0F, -2.0F, -66.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(14.0F, -2.0F, -6.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-2.0F, -2.0F, -4.5F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.0F, -9.0F, 9.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition outside_cubes = bone.addOrReplaceChild("outside_cubes",
				CubeListBuilder.create().texOffs(88, 108).mirror().addBox(-20.0F, -14.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 108)
						.addBox(15.0F, -14.0F, 6.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(88, 108).mirror().addBox(-15.0F, -14.0F, -19.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 108)
						.addBox(0.0F, -14.0F, -21.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(88, 108).mirror().addBox(13.0F, -14.0F, -11.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 108)
						.addBox(-16.0F, -14.0F, 7.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(88, 108).mirror().addBox(5.0F, -14.0F, 18.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 108).mirror()
						.addBox(-10.0F, -14.0F, 21.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, -5.0F, 0.0F));
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
