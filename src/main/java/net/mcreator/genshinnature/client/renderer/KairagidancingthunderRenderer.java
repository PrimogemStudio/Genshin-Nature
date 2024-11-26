
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.KairagidancingthunderEntity;
import net.mcreator.genshinnature.client.model.Modelkairagi;

public class KairagidancingthunderRenderer extends MobRenderer<KairagidancingthunderEntity, Modelkairagi<KairagidancingthunderEntity>> {
	public KairagidancingthunderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkairagi<KairagidancingthunderEntity>(context.bakeLayer(Modelkairagi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KairagidancingthunderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/kairagi_dancing_thunder.png");
	}
}
