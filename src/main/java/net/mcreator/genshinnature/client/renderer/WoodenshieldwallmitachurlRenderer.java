
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WoodenshieldwallmitachurlEntity;
import net.mcreator.genshinnature.client.model.Modelwooden_shieldwall_mitachurl;

public class WoodenshieldwallmitachurlRenderer extends MobRenderer<WoodenshieldwallmitachurlEntity, Modelwooden_shieldwall_mitachurl<WoodenshieldwallmitachurlEntity>> {
	public WoodenshieldwallmitachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwooden_shieldwall_mitachurl<WoodenshieldwallmitachurlEntity>(context.bakeLayer(Modelwooden_shieldwall_mitachurl.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(WoodenshieldwallmitachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/wooden_shieldwall_mitachurl.png");
	}
}
