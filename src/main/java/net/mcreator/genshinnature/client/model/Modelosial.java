package net.mcreator.genshinnature.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
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

public class Modelosial<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelosial"), "main");
	public final ModelPart bone;
	public final ModelPart head;

	public Modelosial(ModelPart root) {
		bone = root.getChild("bone");
		head = bone.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		var meshdefinition = new MeshDefinition();
		var bone = meshdefinition.getRoot().addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.005F, -103.58F, 23.5705F));
		var head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 83).addBox(-7.005F, -22.6F, -44.6174F, 14.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
		head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -26.2214F, -11.7521F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -6.3786F, 7.1347F, 1.0036F, 0.0F, 0.0F));
		head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0657F, -16.1F, -16.3196F, -0.1797F, 0.6784F, -0.2817F));
		head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 0).addBox(-19.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.505F, -16.1F, -37.1174F, 0.0F, 0.6981F, 0.0F));
		head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(76, 0).addBox(-14.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.505F, -16.1F, -37.1174F, 0.1447F, 0.6855F, 0.2262F));
		head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8218F, -16.1F, -15.6768F, -0.1447F, -0.6855F, 0.2262F));
		head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 0).addBox(3.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.495F, -16.1F, -37.1174F, 0.0F, -0.6981F, 0.0F));
		head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 0).addBox(-4.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.495F, -16.1F, -37.1174F, 0.1447F, -0.6855F, -0.2262F));
		var bb_main = bone.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -68.0F, -7.0F, 14.0F, 68.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-7.01F, -24.1986F, -8.7053F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -109.9586F, 30.7053F, 0.0436F, 0.0F, 0.0F));
		bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-6.99F, -52.0F, -6.0F, 14.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -67.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
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
