
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenattackerEntity;
import net.mcreator.genshinnature.client.model.Modelgolden_attacker;

public class GoldenattackerRenderer extends MobRenderer<GoldenattackerEntity, Modelgolden_attacker<GoldenattackerEntity>> {
	public GoldenattackerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgolden_attacker<GoldenattackerEntity>(context.bakeLayer(Modelgolden_attacker.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenattackerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/golden_minion.png");
	}
}
