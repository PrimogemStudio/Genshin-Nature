
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.IceshieldwallmitachurlEntity;
import net.mcreator.genshinnature.client.model.Modelice_shieldwall_mitachurl;

public class IceshieldwallmitachurlRenderer extends MobRenderer<IceshieldwallmitachurlEntity, Modelice_shieldwall_mitachurl<IceshieldwallmitachurlEntity>> {
	public IceshieldwallmitachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelice_shieldwall_mitachurl<IceshieldwallmitachurlEntity>(context.bakeLayer(Modelice_shieldwall_mitachurl.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(IceshieldwallmitachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ice_shieldwall_mitachurl.png");
	}
}
