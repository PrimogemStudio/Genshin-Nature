
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.genshinnature.client.particle.WarmbubbleParticle;
import net.mcreator.genshinnature.client.particle.SmokefogParticle;
import net.mcreator.genshinnature.client.particle.SakuraparticleParticle;
import net.mcreator.genshinnature.client.particle.ParticlethunderrifthoundParticle;
import net.mcreator.genshinnature.client.particle.ParticlehitwolflordParticle;
import net.mcreator.genshinnature.client.particle.ParticlegeorifthoundParticle;
import net.mcreator.genshinnature.client.particle.MysteriousbubbleParticle;
import net.mcreator.genshinnature.client.particle.LuminousbubbleParticle;
import net.mcreator.genshinnature.client.particle.ElectrobubbleParticle;
import net.mcreator.genshinnature.client.particle.DarkfogParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GenshinNatureModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(GenshinNatureModParticleTypes.MYSTERIOUSBUBBLE.get(), MysteriousbubbleParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.ELECTROBUBBLE.get(), ElectrobubbleParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.WARMBUBBLE.get(), WarmbubbleParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.SAKURAPARTICLE.get(), SakuraparticleParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.PARTICLETHUNDERRIFTHOUND.get(), ParticlethunderrifthoundParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.PARTICLEGEORIFTHOUND.get(), ParticlegeorifthoundParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.PARTICLEHITWOLFLORD.get(), ParticlehitwolflordParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.LUMINOUSBUBBLE.get(), LuminousbubbleParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.SMOKEFOG.get(), SmokefogParticle::provider);
		event.registerSpriteSet(GenshinNatureModParticleTypes.DARKFOG.get(), DarkfogParticle::provider);
	}
}
