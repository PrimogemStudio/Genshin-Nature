
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GenshinNatureModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> ALLOWLITPYROSLIMES;
	public static GameRules.Key<GameRules.BooleanValue> ALLOWWEASELTHIEVES;
	public static GameRules.Key<GameRules.BooleanValue> ALLOWSTARTINGITEMS;
	public static GameRules.Key<GameRules.BooleanValue> ALLOWSHEERCOLD;
	public static GameRules.Key<GameRules.BooleanValue> ALLOWQUESTS;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		ALLOWLITPYROSLIMES = GameRules.register("allowLitPyroSlimes", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		ALLOWWEASELTHIEVES = GameRules.register("allowWeaselThieves", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		ALLOWSTARTINGITEMS = GameRules.register("allowStartingItems", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
		ALLOWSHEERCOLD = GameRules.register("allowSheerCold", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
		ALLOWQUESTS = GameRules.register("allowQuests", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	}
}
