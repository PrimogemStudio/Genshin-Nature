
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AzurecraneEntity;
import net.mcreator.genshinnature.client.model.Modelcrane;

public class AzurecraneRenderer extends MobRenderer<AzurecraneEntity, Modelcrane<AzurecraneEntity>> {
	public AzurecraneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrane<AzurecraneEntity>(context.bakeLayer(Modelcrane.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(AzurecraneEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/azure_crane.png");
	}
}
