
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SquirrelEntity;
import net.mcreator.genshinnature.client.model.Modelsquirrel;

public class SquirrelRenderer extends MobRenderer<SquirrelEntity, Modelsquirrel<SquirrelEntity>> {
	public SquirrelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsquirrel<SquirrelEntity>(context.bakeLayer(Modelsquirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SquirrelEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/squirrel.png");
	}
}
