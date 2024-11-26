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
public class Modelmiasmic_tumor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelmiasmic_tumor"), "main");
	public final ModelPart bone7;
	public final ModelPart bone5;
	public final ModelPart bone6;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bb_main;

	public Modelmiasmic_tumor(ModelPart root) {
		this.bone7 = root.getChild("bone7");
		this.bone5 = this.bone7.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone3 = this.bone7.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.bone = this.bone7.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone5 = bone7.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(2, 89).addBox(-8.3421F, 2.5175F, -30.6258F, 38.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3421F, -42.5175F, 2.6258F, -3.1416F, 0.829F, -2.3562F));
		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 106).addBox(-23.3532F, -5.7344F, -2.5665F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.6435F, 22.7123F, 50.9376F, -2.3458F, -0.7023F, 2.7558F));
		PartDefinition cube_r2 = bone5.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 106).addBox(-19.4513F, -3.7092F, -3.2685F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.1167F, 16.92F, 59.2431F, -2.7522F, -0.3262F, -2.8973F));
		PartDefinition cube_r3 = bone5.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 98).addBox(-15.8965F, -4.5504F, -2.7353F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7571F, 5.0401F, 60.3669F, -2.9897F, -0.0441F, -2.2783F));
		PartDefinition cube_r4 = bone5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 98).addBox(-27.6436F, -3.8167F, -2.0524F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.7702F, -17.906F, 51.0816F, -2.9803F, 0.3439F, -2.2167F));
		PartDefinition cube_r5 = bone5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(2, 98).addBox(-27.1134F, -4.1785F, -4.3276F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.712F, -21.304F, 26.9585F, 3.1277F, 1.1638F, -2.6928F));
		PartDefinition cube_r6 = bone5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(2, 89).addBox(-36.4624F, -2.733F, 0.0417F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-34.8905F, -15.8485F, -4.2929F, 1.8921F, 1.2442F, 2.3382F));
		PartDefinition cube_r7 = bone5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(2, 89).addBox(-37.0F, -4.0F, -1.0F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.3421F, 5.5175F, -27.6258F, 0.3663F, 0.5553F, 0.6291F));
		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(46.8515F, 11.219F, 37.6318F, -0.3033F, 0.1264F, 0.0341F));
		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-23.9366F, -3.2298F, -3.5821F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-27.9115F, -17.4611F, -51.363F, -0.0285F, 0.0275F, -0.2319F));
		PartDefinition cube_r9 = bone6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-21.6966F, -3.6918F, -1.949F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.1726F, -21.7113F, -46.0517F, -0.0301F, -0.3214F, -0.2216F));
		PartDefinition cube_r10 = bone6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-7.5192F, -3.4125F, 1.9699F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3315F, -20.775F, -44.7627F, -0.5094F, -0.7077F, 0.4534F));
		PartDefinition cube_r11 = bone6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-16.7269F, -1.3873F, 1.8738F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.7619F, -11.1174F, -21.5314F, -0.9966F, -1.0762F, 1.076F));
		PartDefinition cube_r12 = bone6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-22.3908F, -5.4211F, -2.3969F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6538F, 2.5916F, -4.9188F, -1.8821F, -0.9608F, 2.1422F));
		PartDefinition bone3 = bone7.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(2, 89).addBox(-8.3421F, 2.5175F, -30.6258F, 38.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3421F, -42.5175F, 2.6258F, 0.0F, 0.0F, 2.3998F));
		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(2, 106).addBox(-23.3532F, -5.7344F, -2.5665F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.6435F, 22.7123F, 50.9376F, -2.3458F, -0.7023F, 2.7558F));
		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(2, 106).addBox(-19.4513F, -3.7092F, -3.2685F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.1167F, 16.92F, 59.2431F, -2.7522F, -0.3262F, -2.8973F));
		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(2, 98).addBox(-15.8965F, -4.5504F, -2.7353F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7571F, 5.0401F, 60.3669F, -2.9897F, -0.0441F, -2.2783F));
		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(2, 98).addBox(-27.6436F, -3.8167F, -2.0524F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.7702F, -17.906F, 51.0816F, -2.9803F, 0.3439F, -2.2167F));
		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(2, 98).addBox(-27.1134F, -4.1785F, -4.3276F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.712F, -21.304F, 26.9585F, 3.1277F, 1.1638F, -2.6928F));
		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(2, 89).addBox(-36.4624F, -2.733F, 0.0417F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-34.8905F, -15.8485F, -4.2929F, 1.8921F, 1.2442F, 2.3382F));
		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(2, 89).addBox(-37.0F, -4.0F, -1.0F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.3421F, 5.5175F, -27.6258F, 0.3663F, 0.5553F, 0.6291F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(46.8515F, 11.219F, 37.6318F, -0.3033F, 0.1264F, 0.0341F));
		PartDefinition cube_r20 = bone4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-23.9366F, -3.2298F, -3.5821F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-27.9115F, -17.4611F, -51.363F, -0.0285F, 0.0275F, -0.2319F));
		PartDefinition cube_r21 = bone4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-21.6966F, -3.6918F, -1.949F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.1726F, -21.7113F, -46.0517F, -0.0301F, -0.3214F, -0.2216F));
		PartDefinition cube_r22 = bone4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-7.5192F, -3.4125F, 1.9699F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3315F, -20.775F, -44.7627F, -0.5094F, -0.7077F, 0.4534F));
		PartDefinition cube_r23 = bone4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-16.7269F, -1.3873F, 1.8738F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.7619F, -11.1174F, -21.5314F, -0.9966F, -1.0762F, 1.076F));
		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-22.3908F, -5.4211F, -2.3969F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6538F, 2.5916F, -4.9188F, -1.8821F, -0.9608F, 2.1422F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(2, 89).addBox(-8.3421F, 2.5175F, -30.6258F, 38.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3421F, -42.5175F, 2.6258F, 3.0107F, 1.2217F, -0.7418F));
		PartDefinition cube_r25 = bone8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(2, 106).addBox(-23.3532F, -5.7344F, -2.5665F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.6435F, 22.7123F, 50.9376F, -2.3458F, -0.7023F, 2.7558F));
		PartDefinition cube_r26 = bone8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(2, 106).addBox(-19.4513F, -3.7092F, -3.2685F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.1167F, 16.92F, 59.2431F, -2.7522F, -0.3262F, -2.8973F));
		PartDefinition cube_r27 = bone8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(2, 98).addBox(-15.8965F, -4.5504F, -2.7353F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7571F, 5.0401F, 60.3669F, -2.9897F, -0.0441F, -2.2783F));
		PartDefinition cube_r28 = bone8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(2, 98).addBox(-27.6436F, -3.8167F, -2.0524F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.7702F, -17.906F, 51.0816F, -2.9803F, 0.3439F, -2.2167F));
		PartDefinition cube_r29 = bone8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(2, 98).addBox(-27.1134F, -4.1785F, -4.3276F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.712F, -21.304F, 26.9585F, 3.1277F, 1.1638F, -2.6928F));
		PartDefinition cube_r30 = bone8.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(2, 89).addBox(-36.4624F, -2.733F, 0.0417F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-34.8905F, -15.8485F, -4.2929F, 1.8921F, 1.2442F, 2.3382F));
		PartDefinition cube_r31 = bone8.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(2, 89).addBox(-37.0F, -4.0F, -1.0F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.3421F, 5.5175F, -27.6258F, 0.3663F, 0.5553F, 0.6291F));
		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(46.8515F, 11.219F, 37.6318F, -0.3033F, 0.1264F, 0.0341F));
		PartDefinition cube_r32 = bone9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-23.9366F, -3.2298F, -3.5821F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-27.9115F, -17.4611F, -51.363F, -0.0285F, 0.0275F, -0.2319F));
		PartDefinition cube_r33 = bone9.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-21.6966F, -3.6918F, -1.949F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.1726F, -21.7113F, -46.0517F, -0.0301F, -0.3214F, -0.2216F));
		PartDefinition cube_r34 = bone9.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-7.5192F, -3.4125F, 1.9699F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3315F, -20.775F, -44.7627F, -0.5094F, -0.7077F, 0.4534F));
		PartDefinition cube_r35 = bone9.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-16.7269F, -1.3873F, 1.8738F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.7619F, -11.1174F, -21.5314F, -0.9966F, -1.0762F, 1.076F));
		PartDefinition cube_r36 = bone9.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-22.3908F, -5.4211F, -2.3969F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6538F, 2.5916F, -4.9188F, -1.8821F, -0.9608F, 2.1422F));
		PartDefinition bone = bone7.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(2, 89).addBox(-8.0F, 2.0F, -32.0F, 38.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -42.0F, 0.0F));
		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(2, 106).addBox(-23.3532F, -5.7344F, -2.5665F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.9856F, 22.1948F, 49.5633F, -2.3458F, -0.7023F, 2.7558F));
		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(2, 106).addBox(-19.4513F, -3.7092F, -3.2685F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.4587F, 16.4025F, 57.8688F, -2.7522F, -0.3262F, -2.8973F));
		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(2, 98).addBox(-15.8965F, -4.5504F, -2.7353F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0992F, 4.5226F, 58.9927F, -2.9897F, -0.0441F, -2.2783F));
		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(2, 98).addBox(-27.6436F, -3.8167F, -2.0524F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.4281F, -18.4236F, 49.7074F, -2.9803F, 0.3439F, -2.2167F));
		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(2, 98).addBox(-27.1134F, -4.1785F, -4.3276F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.3699F, -21.8215F, 25.5843F, 3.1277F, 1.1638F, -2.6928F));
		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(2, 89).addBox(-36.4624F, -2.733F, 0.0417F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-34.5485F, -16.366F, -5.6671F, 1.8921F, 1.2442F, 2.3382F));
		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(2, 89).addBox(-37.0F, -4.0F, -1.0F, 40.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 5.0F, -29.0F, 0.3663F, 0.5553F, 0.6291F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(47.1936F, 10.7015F, 36.2576F, -0.3033F, 0.1264F, 0.0341F));
		PartDefinition cube_r44 = bone2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-23.9366F, -3.2298F, -3.5821F, 26.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-27.9115F, -17.4611F, -51.363F, -0.0285F, 0.0275F, -0.2319F));
		PartDefinition cube_r45 = bone2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(2, 109).mirror().addBox(-21.6966F, -3.6918F, -1.949F, 22.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.1726F, -21.7113F, -46.0517F, -0.0301F, -0.3214F, -0.2216F));
		PartDefinition cube_r46 = bone2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-7.5192F, -3.4125F, 1.9699F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3315F, -20.775F, -44.7627F, -0.5094F, -0.7077F, 0.4534F));
		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-16.7269F, -1.3873F, 1.8738F, 18.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.7619F, -11.1174F, -21.5314F, -0.9966F, -1.0762F, 1.076F));
		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(2, 106).mirror().addBox(-22.3908F, -5.4211F, -2.3969F, 28.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6538F, 2.5916F, -4.9188F, -1.8821F, -0.9608F, 2.1422F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r49 = bb_main.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -42.0F, 0.0F, 0.0F, 0.5672F, 0.48F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
