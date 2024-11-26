
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FrostarmlawachurlEntity;
import net.mcreator.genshinnature.client.model.Modelfrostarm_lawachurl;

public class FrostarmlawachurlRenderer extends MobRenderer<FrostarmlawachurlEntity, Modelfrostarm_lawachurl<FrostarmlawachurlEntity>> {
	public FrostarmlawachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfrostarm_lawachurl<FrostarmlawachurlEntity>(context.bakeLayer(Modelfrostarm_lawachurl.LAYER_LOCATION)), 1.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrostarmlawachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/frostarm_lawachurl.png");
	}
}
