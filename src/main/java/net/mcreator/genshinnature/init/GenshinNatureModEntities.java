
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.entity.YellowbutterflyEntity;
import net.mcreator.genshinnature.entity.WoodenshieldwallmitachurlEntity;
import net.mcreator.genshinnature.entity.WoodenshieldhilichurlguardEntity;
import net.mcreator.genshinnature.entity.WitheringtumorEntity;
import net.mcreator.genshinnature.entity.WispEntity;
import net.mcreator.genshinnature.entity.WingeddendroshroomEntity;
import net.mcreator.genshinnature.entity.WingedcryoshroomEntity;
import net.mcreator.genshinnature.entity.WhitepigeonflyingEntity;
import net.mcreator.genshinnature.entity.WhitepigeonEntity;
import net.mcreator.genshinnature.entity.WhirlwindEntity;
import net.mcreator.genshinnature.entity.WhirlingpyrofungusEntity;
import net.mcreator.genshinnature.entity.WhirlingelectrofungusEntity;
import net.mcreator.genshinnature.entity.WhirlingcryofungusEntity;
import net.mcreator.genshinnature.entity.WeaponreshaperEntity;
import net.mcreator.genshinnature.entity.WeaponrepulsorEntity;
import net.mcreator.genshinnature.entity.WeaponprospectorEntity;
import net.mcreator.genshinnature.entity.WaterminionferretEntity;
import net.mcreator.genshinnature.entity.WaterminioncrabEntity;
import net.mcreator.genshinnature.entity.WaterminionboarEntity;
import net.mcreator.genshinnature.entity.WarmseelieicespikesEntity;
import net.mcreator.genshinnature.entity.WarmseelieEntity;
import net.mcreator.genshinnature.entity.VioletibisEntity;
import net.mcreator.genshinnature.entity.VenomspinefishspawningEntity;
import net.mcreator.genshinnature.entity.VenomspinefishEntity;
import net.mcreator.genshinnature.entity.UnusualhilichurlEntity;
import net.mcreator.genshinnature.entity.UnlitpyroslimeEntity;
import net.mcreator.genshinnature.entity.UnlitlargepyroslimeEntity;
import net.mcreator.genshinnature.entity.UmbertailfalconflyingEntity;
import net.mcreator.genshinnature.entity.UmbertailfalconEntity;
import net.mcreator.genshinnature.entity.TruefruitanglerspawningEntity;
import net.mcreator.genshinnature.entity.TruefruitanglerEntity;
import net.mcreator.genshinnature.entity.TreasurehoarderEntity;
import net.mcreator.genshinnature.entity.ThundermanifestationEntity;
import net.mcreator.genshinnature.entity.ThunderhelmlawachurlEntity;
import net.mcreator.genshinnature.entity.ThundercravenrifthoundwhelpEntity;
import net.mcreator.genshinnature.entity.ThundercravenrifthoundEntity;
import net.mcreator.genshinnature.entity.TeacoloredshirakodaispawningEntity;
import net.mcreator.genshinnature.entity.TeacoloredshirakodaiEntity;
import net.mcreator.genshinnature.entity.TatarigamiEntity;
import net.mcreator.genshinnature.entity.SweetflowermedakaspawningEntity;
import net.mcreator.genshinnature.entity.SweetflowermedakaEntity;
import net.mcreator.genshinnature.entity.SunsetcloudanglerspawningEntity;
import net.mcreator.genshinnature.entity.SunsetcloudanglerEntity;
import net.mcreator.genshinnature.entity.SuncrabEntity;
import net.mcreator.genshinnature.entity.StretchypyrofungusEntity;
import net.mcreator.genshinnature.entity.StretchygeofungusEntity;
import net.mcreator.genshinnature.entity.StretchyelectrofungusEntity;
import net.mcreator.genshinnature.entity.StretchyanemofungusEntity;
import net.mcreator.genshinnature.entity.StonehidelawachurlEntity;
import net.mcreator.genshinnature.entity.SquirrelEntity;
import net.mcreator.genshinnature.entity.SpinocrocodileEntity;
import net.mcreator.genshinnature.entity.SnowweaselEntity;
import net.mcreator.genshinnature.entity.SnowstriderspawningEntity;
import net.mcreator.genshinnature.entity.SnowstriderEntity;
import net.mcreator.genshinnature.entity.SnowfinchflyingEntity;
import net.mcreator.genshinnature.entity.SnowfinchEntity;
import net.mcreator.genshinnature.entity.SnowboarEntity;
import net.mcreator.genshinnature.entity.SkywardharpascendedProjectileEntity;
import net.mcreator.genshinnature.entity.SkywardharpProjectileEntity;
import net.mcreator.genshinnature.entity.SkywardatlasascendedProjectileEntity;
import net.mcreator.genshinnature.entity.SkywardatlasProjectileEntity;
import net.mcreator.genshinnature.entity.SilkwhitefalconflyingEntity;
import net.mcreator.genshinnature.entity.SilkwhitefalconEntity;
import net.mcreator.genshinnature.entity.ShroomboarEntity;
import net.mcreator.genshinnature.entity.ShootingminionEntityProjectile;
import net.mcreator.genshinnature.entity.ShootingminionEntity;
import net.mcreator.genshinnature.entity.ShikikoshouEntity;
import net.mcreator.genshinnature.entity.ShaggysumpterbeastspawningEntity;
import net.mcreator.genshinnature.entity.ShaggysumpterbeastbabyEntity;
import net.mcreator.genshinnature.entity.ShaggysumpterbeastadultEntity;
import net.mcreator.genshinnature.entity.ShadowyhuskstandardbearerEntity;
import net.mcreator.genshinnature.entity.ShadowyhusklinebreakerEntity;
import net.mcreator.genshinnature.entity.ShadowyhuskdefenderEntity;
import net.mcreator.genshinnature.entity.ScorpionEntity;
import net.mcreator.genshinnature.entity.ScarletbeakduckEntity;
import net.mcreator.genshinnature.entity.ScarabballEntity;
import net.mcreator.genshinnature.entity.ScarabEntity;
import net.mcreator.genshinnature.entity.SandstormanglerspawningEntity;
import net.mcreator.genshinnature.entity.SandstormanglerEntity;
import net.mcreator.genshinnature.entity.SacredibisEntity;
import net.mcreator.genshinnature.entity.RustykoispawningEntity;
import net.mcreator.genshinnature.entity.RustykoiEntity;
import net.mcreator.genshinnature.entity.RuinserpentEntity;
import net.mcreator.genshinnature.entity.RuinscoutEntityProjectile;
import net.mcreator.genshinnature.entity.RuinscoutEntity;
import net.mcreator.genshinnature.entity.RuinhunterarmlessEntityProjectile;
import net.mcreator.genshinnature.entity.RuinhunterarmlessEntity;
import net.mcreator.genshinnature.entity.RuinhunterarmEntity;
import net.mcreator.genshinnature.entity.RuinhunterEntityProjectile;
import net.mcreator.genshinnature.entity.RuinhunterEntity;
import net.mcreator.genshinnature.entity.RuinguardinactiveEntity;
import net.mcreator.genshinnature.entity.RuinguardEntity;
import net.mcreator.genshinnature.entity.RuingraderEntity;
import net.mcreator.genshinnature.entity.RuindrakeskywatchEntity;
import net.mcreator.genshinnature.entity.RuindrakeearthwatchEntity;
import net.mcreator.genshinnature.entity.RuindestroyerEntityProjectile;
import net.mcreator.genshinnature.entity.RuindestroyerEntity;
import net.mcreator.genshinnature.entity.RuindefenderEntity;
import net.mcreator.genshinnature.entity.RuincruiserEntityProjectile;
import net.mcreator.genshinnature.entity.RuincruiserEntity;
import net.mcreator.genshinnature.entity.RockshieldwallmitachurlEntity;
import net.mcreator.genshinnature.entity.RockshieldhilichurlguardEntity;
import net.mcreator.genshinnature.entity.RockfondrifthoundwhelpEntity;
import net.mcreator.genshinnature.entity.RockfondrifthoundEntity;
import net.mcreator.genshinnature.entity.RishbolandtigerEntity;
import net.mcreator.genshinnature.entity.RimebiterbathysmalvishaphatchlingEntity;
import net.mcreator.genshinnature.entity.RedtailedweaselEntity;
import net.mcreator.genshinnature.entity.RedtailedlizardEntity;
import net.mcreator.genshinnature.entity.RedhornedlizardEntity;
import net.mcreator.genshinnature.entity.RedfinnedunagiEntity;
import net.mcreator.genshinnature.entity.RaimeiangelfishspawningEntity;
import net.mcreator.genshinnature.entity.RaimeiangelfishEntity;
import net.mcreator.genshinnature.entity.QuicksandunagiEntity;
import net.mcreator.genshinnature.entity.QuestnpcsspawnerEntity;
import net.mcreator.genshinnature.entity.Questnpc9Entity;
import net.mcreator.genshinnature.entity.Questnpc8Entity;
import net.mcreator.genshinnature.entity.Questnpc7Entity;
import net.mcreator.genshinnature.entity.Questnpc6Entity;
import net.mcreator.genshinnature.entity.Questnpc5Entity;
import net.mcreator.genshinnature.entity.Questnpc4Entity;
import net.mcreator.genshinnature.entity.Questnpc3Entity;
import net.mcreator.genshinnature.entity.Questnpc2Entity;
import net.mcreator.genshinnature.entity.Questnpc20Entity;
import net.mcreator.genshinnature.entity.Questnpc1Entity;
import net.mcreator.genshinnature.entity.Questnpc19Entity;
import net.mcreator.genshinnature.entity.Questnpc18Entity;
import net.mcreator.genshinnature.entity.Questnpc17Entity;
import net.mcreator.genshinnature.entity.Questnpc16Entity;
import net.mcreator.genshinnature.entity.Questnpc15Entity;
import net.mcreator.genshinnature.entity.Questnpc14Entity;
import net.mcreator.genshinnature.entity.Questnpc13Entity;
import net.mcreator.genshinnature.entity.Questnpc12Entity;
import net.mcreator.genshinnature.entity.Questnpc11Entity;
import net.mcreator.genshinnature.entity.Questnpc10Entity;
import net.mcreator.genshinnature.entity.PyrowhopperflowerEntity;
import net.mcreator.genshinnature.entity.PyrospecterEntity;
import net.mcreator.genshinnature.entity.PyroslimeEntity;
import net.mcreator.genshinnature.entity.PyroregisvineEntity;
import net.mcreator.genshinnature.entity.Pyrohypostasisphase8Entity;
import net.mcreator.genshinnature.entity.Pyrohypostasisphase7Entity;
import net.mcreator.genshinnature.entity.Pyrohypostasisphase6Entity;
import net.mcreator.genshinnature.entity.Pyrohypostasisphase5Entity;
import net.mcreator.genshinnature.entity.Pyrohypostasisphase4Entity;
import net.mcreator.genshinnature.entity.Pyrohypostasisphase3Entity;
import net.mcreator.genshinnature.entity.Pyrohypostasisphase2Entity;
import net.mcreator.genshinnature.entity.PyrohypostasisEntity;
import net.mcreator.genshinnature.entity.PyroabyssmageEntity;
import net.mcreator.genshinnature.entity.PurpleshirakodaispawningEntity;
import net.mcreator.genshinnature.entity.PurpleshirakodaiEntity;
import net.mcreator.genshinnature.entity.PrimordialbathysmalvishapEntity;
import net.mcreator.genshinnature.entity.PrimalconstructreshaperEntity;
import net.mcreator.genshinnature.entity.PrimalconstructrepulsorEntity;
import net.mcreator.genshinnature.entity.PrimalconstructprospectorEntity;
import net.mcreator.genshinnature.entity.PocketgrimoireascendedProjectileEntity;
import net.mcreator.genshinnature.entity.PocketgrimoireProjectileEntity;
import net.mcreator.genshinnature.entity.PithlizardEntity;
import net.mcreator.genshinnature.entity.PinkbutterflyEntity;
import net.mcreator.genshinnature.entity.Perpetualmechanicalarrayphase4Entity;
import net.mcreator.genshinnature.entity.Perpetualmechanicalarrayphase3Entity;
import net.mcreator.genshinnature.entity.Perpetualmechanicalarrayphase2Entity;
import net.mcreator.genshinnature.entity.PerpetualmechanicalarrayEntityProjectile;
import net.mcreator.genshinnature.entity.PerpetualmechanicalarrayEntity;
import net.mcreator.genshinnature.entity.PeachofthedeepwavesspawningEntity;
import net.mcreator.genshinnature.entity.PeachofthedeepwavesEntity;
import net.mcreator.genshinnature.entity.PaleredcrabEntity;
import net.mcreator.genshinnature.entity.OsialEntity;
import net.mcreator.genshinnature.entity.OnikabutoridingEntity;
import net.mcreator.genshinnature.entity.OnikabutoEntity;
import net.mcreator.genshinnature.entity.OchimusaensorcelledthunderEntity;
import net.mcreator.genshinnature.entity.OchimusacankeredflameEntity;
import net.mcreator.genshinnature.entity.OceancrabEntity;
import net.mcreator.genshinnature.entity.MysteriousseeliesoulsandEntity;
import net.mcreator.genshinnature.entity.MysteriousseelieEntity;
import net.mcreator.genshinnature.entity.MutantelectroslimeEntity;
import net.mcreator.genshinnature.entity.MoonfinspawningEntity;
import net.mcreator.genshinnature.entity.MoonfinEntity;
import net.mcreator.genshinnature.entity.MitachurlcracklingaxeEntity;
import net.mcreator.genshinnature.entity.MitachurlblazingaxeEntity;
import net.mcreator.genshinnature.entity.MitachurlEntity;
import net.mcreator.genshinnature.entity.MirrormaidenEntityProjectile;
import net.mcreator.genshinnature.entity.MirrormaidenEntity;
import net.mcreator.genshinnature.entity.MiniseelieviolaEntity;
import net.mcreator.genshinnature.entity.MiniseelieroseEntity;
import net.mcreator.genshinnature.entity.MiniseeliemossEntity;
import net.mcreator.genshinnature.entity.MiniseeliedayflowerEntity;
import net.mcreator.genshinnature.entity.MiniseeliecurcumaEntity;
import net.mcreator.genshinnature.entity.MiasmictumorEntity;
import net.mcreator.genshinnature.entity.MedakaspawningEntity;
import net.mcreator.genshinnature.entity.MedakaEntity;
import net.mcreator.genshinnature.entity.MaranasavatarEntity;
import net.mcreator.genshinnature.entity.MagatsumitakenarukaminomikotopuppetEntity;
import net.mcreator.genshinnature.entity.MagatsumitakenarukaminomikotofinalEntity;
import net.mcreator.genshinnature.entity.MagatsumitakenarukaminomikotoEntity;
import net.mcreator.genshinnature.entity.LungedsticklebackspawningEntity;
import net.mcreator.genshinnature.entity.LungedsticklebackEntity;
import net.mcreator.genshinnature.entity.LuminousseeliespawningEntity;
import net.mcreator.genshinnature.entity.LuminousseelieEntity;
import net.mcreator.genshinnature.entity.LucklightflyspawningEntity;
import net.mcreator.genshinnature.entity.LucklightflyEntity;
import net.mcreator.genshinnature.entity.LivingbubbleEntity;
import net.mcreator.genshinnature.entity.LightbluebutterflyEntity;
import net.mcreator.genshinnature.entity.LazuriteaxemarlinspawningEntity;
import net.mcreator.genshinnature.entity.LazuriteaxemarlinEntity;
import net.mcreator.genshinnature.entity.LargepyroslimeEntity;
import net.mcreator.genshinnature.entity.LargehydroslimeEntity;
import net.mcreator.genshinnature.entity.LargegeoslimenohelmetEntity;
import net.mcreator.genshinnature.entity.LargegeoslimeEntity;
import net.mcreator.genshinnature.entity.LargeelectroslimeEntity;
import net.mcreator.genshinnature.entity.LargedendroslimeEntity;
import net.mcreator.genshinnature.entity.LargecryoslimenohelmetEntity;
import net.mcreator.genshinnature.entity.LargecryoslimeEntity;
import net.mcreator.genshinnature.entity.LargeanemoslimeEntity;
import net.mcreator.genshinnature.entity.LapisgledeflyingEntity;
import net.mcreator.genshinnature.entity.LapisgledeEntity;
import net.mcreator.genshinnature.entity.KairagifierymightEntity;
import net.mcreator.genshinnature.entity.KairagidancingthunderEntity;
import net.mcreator.genshinnature.entity.IceshieldwallmitachurlEntity;
import net.mcreator.genshinnature.entity.IceshieldhilichurlguardEntity;
import net.mcreator.genshinnature.entity.HydrospecterEntity;
import net.mcreator.genshinnature.entity.HydroslimeEntity;
import net.mcreator.genshinnature.entity.HydrosamachurlEntity;
import net.mcreator.genshinnature.entity.Hydrohypostasisphase8Entity;
import net.mcreator.genshinnature.entity.Hydrohypostasisphase7Entity;
import net.mcreator.genshinnature.entity.Hydrohypostasisphase6Entity;
import net.mcreator.genshinnature.entity.Hydrohypostasisphase5Entity;
import net.mcreator.genshinnature.entity.Hydrohypostasisphase4Entity;
import net.mcreator.genshinnature.entity.Hydrohypostasisphase3Entity;
import net.mcreator.genshinnature.entity.Hydrohypostasisphase2Entity;
import net.mcreator.genshinnature.entity.HydrohypostasisEntity;
import net.mcreator.genshinnature.entity.HydrodiscEntity;
import net.mcreator.genshinnature.entity.HydrocicinEntity;
import net.mcreator.genshinnature.entity.HydroabyssmageEntity;
import net.mcreator.genshinnature.entity.HuntersbowascendedProjectileEntity;
import net.mcreator.genshinnature.entity.HuntersbowProjectileEntity;
import net.mcreator.genshinnature.entity.HoarderweaselthiefscaredEntity;
import net.mcreator.genshinnature.entity.HoarderweaselthiefEntity;
import net.mcreator.genshinnature.entity.HilichurlshooterEntityProjectile;
import net.mcreator.genshinnature.entity.HilichurlshooterEntity;
import net.mcreator.genshinnature.entity.HilichurlpyroshooterEntityProjectile;
import net.mcreator.genshinnature.entity.HilichurlpyroshooterEntity;
import net.mcreator.genshinnature.entity.HilichurlpyrogrenadierEntity;
import net.mcreator.genshinnature.entity.HilichurlfighterEntity;
import net.mcreator.genshinnature.entity.HilichurlelectroshooterEntityProjectile;
import net.mcreator.genshinnature.entity.HilichurlelectroshooterEntity;
import net.mcreator.genshinnature.entity.HilichurlelectrogrenadierEntity;
import net.mcreator.genshinnature.entity.HilichurlcryoshooterEntityProjectile;
import net.mcreator.genshinnature.entity.HilichurlcryoshooterEntity;
import net.mcreator.genshinnature.entity.HilichurlcryogrenadierEntity;
import net.mcreator.genshinnature.entity.HilichurlberserkerEntity;
import net.mcreator.genshinnature.entity.HilichurlEntity;
import net.mcreator.genshinnature.entity.HiddenlargedendroslimeEntity;
import net.mcreator.genshinnature.entity.HiddendendroslimeEntity;
import net.mcreator.genshinnature.entity.HatefuloceanidEntity;
import net.mcreator.genshinnature.entity.HalcyonjadeaxemarlinspawningEntity;
import net.mcreator.genshinnature.entity.HalcyonjadeaxemarlinEntity;
import net.mcreator.genshinnature.entity.GroundedhydroshroomEntity;
import net.mcreator.genshinnature.entity.GroundedgeoshroomEntity;
import net.mcreator.genshinnature.entity.GreenhornedlizardEntity;
import net.mcreator.genshinnature.entity.GreatsnowboarkingEntity;
import net.mcreator.genshinnature.entity.GraywingpigeonflyingEntity;
import net.mcreator.genshinnature.entity.GraywingpigeonEntity;
import net.mcreator.genshinnature.entity.GoldenwolflordbossEntity;
import net.mcreator.genshinnature.entity.GoldenwolflordEntity;
import net.mcreator.genshinnature.entity.GoldenweaselthiefscaredEntity;
import net.mcreator.genshinnature.entity.GoldenweaselthiefEntity;
import net.mcreator.genshinnature.entity.GoldenminionEntity;
import net.mcreator.genshinnature.entity.GoldenkoispawningEntity;
import net.mcreator.genshinnature.entity.GoldenkoiEntity;
import net.mcreator.genshinnature.entity.GoldenfinchflyingEntity;
import net.mcreator.genshinnature.entity.GoldenfinchEntity;
import net.mcreator.genshinnature.entity.GoldencrabEntity;
import net.mcreator.genshinnature.entity.GoldenattackerEntity;
import net.mcreator.genshinnature.entity.GlazemedakaspawningEntity;
import net.mcreator.genshinnature.entity.GlazemedakaEntity;
import net.mcreator.genshinnature.entity.GlacialmineEntity;
import net.mcreator.genshinnature.entity.GeovishaphatchlingEntity;
import net.mcreator.genshinnature.entity.GeovishapEntity;
import net.mcreator.genshinnature.entity.GeospecterEntity;
import net.mcreator.genshinnature.entity.GeoslimeEntity;
import net.mcreator.genshinnature.entity.GeosamachurlEntity;
import net.mcreator.genshinnature.entity.Geohypostasisphase8Entity;
import net.mcreator.genshinnature.entity.Geohypostasisphase7Entity;
import net.mcreator.genshinnature.entity.Geohypostasisphase6Entity;
import net.mcreator.genshinnature.entity.Geohypostasisphase5Entity;
import net.mcreator.genshinnature.entity.Geohypostasisphase4Entity;
import net.mcreator.genshinnature.entity.Geohypostasisphase3EntityProjectile;
import net.mcreator.genshinnature.entity.Geohypostasisphase3Entity;
import net.mcreator.genshinnature.entity.Geohypostasisphase2Entity;
import net.mcreator.genshinnature.entity.GeohypostasisEntity;
import net.mcreator.genshinnature.entity.GeocrystalflyEntity;
import net.mcreator.genshinnature.entity.GeneralcrabEntity;
import net.mcreator.genshinnature.entity.FrozensoulwitheredEntity;
import net.mcreator.genshinnature.entity.FrozensoulEntity;
import net.mcreator.genshinnature.entity.FrostarmlawachurlEntity;
import net.mcreator.genshinnature.entity.FriendlyelectrocicinEntity;
import net.mcreator.genshinnature.entity.FormalorayspawningEntity;
import net.mcreator.genshinnature.entity.FormalorayEntity;
import net.mcreator.genshinnature.entity.FloattybubbleEntity;
import net.mcreator.genshinnature.entity.FloatingrayEntity;
import net.mcreator.genshinnature.entity.FloatinglargeanemoslimeEntity;
import net.mcreator.genshinnature.entity.FloatinghydrofungiEntity;
import net.mcreator.genshinnature.entity.FloatingdendrofungusEntity;
import net.mcreator.genshinnature.entity.FloatinganemofungusEntity;
import net.mcreator.genshinnature.entity.FireflyEntity;
import net.mcreator.genshinnature.entity.FellflowerEntity;
import net.mcreator.genshinnature.entity.FatuiskirmishergeochanterbracerEntityProjectile;
import net.mcreator.genshinnature.entity.FatuiskirmishergeochanterbracerEntity;
import net.mcreator.genshinnature.entity.FatuipyroagentEntity;
import net.mcreator.genshinnature.entity.FatuielectrocicinmageEntity;
import net.mcreator.genshinnature.entity.FatuicryocicinmageEntity;
import net.mcreator.genshinnature.entity.EyeofthestormEntity;
import net.mcreator.genshinnature.entity.Eyeofstormphase2Entity;
import net.mcreator.genshinnature.entity.EremiteEntity;
import net.mcreator.genshinnature.entity.EndoraEntity;
import net.mcreator.genshinnature.entity.EmeraldfinchflyingEntity;
import net.mcreator.genshinnature.entity.EmeraldfinchEntity;
import net.mcreator.genshinnature.entity.EmeraldduckEntity;
import net.mcreator.genshinnature.entity.ElectrowhopperflowerEntity;
import net.mcreator.genshinnature.entity.ElectrospecterEntity;
import net.mcreator.genshinnature.entity.ElectroslimeEntity;
import net.mcreator.genshinnature.entity.ElectroseelieEntity;
import net.mcreator.genshinnature.entity.ElectrosamachurlEntity;
import net.mcreator.genshinnature.entity.ElectroregisvinehiddenEntity;
import net.mcreator.genshinnature.entity.ElectroregisvineEntity;
import net.mcreator.genshinnature.entity.Electrohypostasisphase8Entity;
import net.mcreator.genshinnature.entity.Electrohypostasisphase7Entity;
import net.mcreator.genshinnature.entity.Electrohypostasisphase6Entity;
import net.mcreator.genshinnature.entity.Electrohypostasisphase5Entity;
import net.mcreator.genshinnature.entity.Electrohypostasisphase4Entity;
import net.mcreator.genshinnature.entity.Electrohypostasisphase3Entity;
import net.mcreator.genshinnature.entity.Electrohypostasisphase2EntityProjectile;
import net.mcreator.genshinnature.entity.Electrohypostasisphase2Entity;
import net.mcreator.genshinnature.entity.ElectrohypostasisEntity;
import net.mcreator.genshinnature.entity.ElectrocrystalflyEntity;
import net.mcreator.genshinnature.entity.ElectrocicinEntity;
import net.mcreator.genshinnature.entity.ElectroabyssmageEntity;
import net.mcreator.genshinnature.entity.ElectricwallEntity;
import net.mcreator.genshinnature.entity.ElectrictntEntity;
import net.mcreator.genshinnature.entity.ElectricshooterEntityProjectile;
import net.mcreator.genshinnature.entity.ElectricshooterEntity;
import net.mcreator.genshinnature.entity.ElectricballEntity;
import net.mcreator.genshinnature.entity.DuskbirdflyingEntity;
import net.mcreator.genshinnature.entity.DuskbirdEntity;
import net.mcreator.genshinnature.entity.DivdarayspawningEntity;
import net.mcreator.genshinnature.entity.DivdarayEntity;
import net.mcreator.genshinnature.entity.DesertsumpterbeastspawningEntity;
import net.mcreator.genshinnature.entity.DesertsumpterbeastbabyEntity;
import net.mcreator.genshinnature.entity.DesertsumpterbeastadultEntity;
import net.mcreator.genshinnature.entity.DendrospecterEntity;
import net.mcreator.genshinnature.entity.DendroslimeEntity;
import net.mcreator.genshinnature.entity.DendrosamachurlEntity;
import net.mcreator.genshinnature.entity.DendrocrystalflyEntity;
import net.mcreator.genshinnature.entity.DendrobulletEntity;
import net.mcreator.genshinnature.entity.DefensemechanismEntityProjectile;
import net.mcreator.genshinnature.entity.DefensemechanismEntity;
import net.mcreator.genshinnature.entity.DeepseaunagiEntity;
import net.mcreator.genshinnature.entity.DawncatcherspawningEntity;
import net.mcreator.genshinnature.entity.DawncatcherEntity;
import net.mcreator.genshinnature.entity.CrystalfishspawningEntity;
import net.mcreator.genshinnature.entity.CrystalfishEntity;
import net.mcreator.genshinnature.entity.CryowhopperflowerEntity;
import net.mcreator.genshinnature.entity.CryospecterEntity;
import net.mcreator.genshinnature.entity.CryoslimeEntity;
import net.mcreator.genshinnature.entity.CryosamachurlEntity;
import net.mcreator.genshinnature.entity.CryoregisvineEntity;
import net.mcreator.genshinnature.entity.Cryohypostasisphase8Entity;
import net.mcreator.genshinnature.entity.Cryohypostasisphase7Entity;
import net.mcreator.genshinnature.entity.Cryohypostasisphase6Entity;
import net.mcreator.genshinnature.entity.Cryohypostasisphase5EntityProjectile;
import net.mcreator.genshinnature.entity.Cryohypostasisphase5Entity;
import net.mcreator.genshinnature.entity.Cryohypostasisphase4Entity;
import net.mcreator.genshinnature.entity.Cryohypostasisphase3Entity;
import net.mcreator.genshinnature.entity.Cryohypostasisphase2Entity;
import net.mcreator.genshinnature.entity.CryohypostasisEntity;
import net.mcreator.genshinnature.entity.CryocrystalflyEntity;
import net.mcreator.genshinnature.entity.CryocicinEntity;
import net.mcreator.genshinnature.entity.CryoabyssmageEntity;
import net.mcreator.genshinnature.entity.CrowEntity;
import net.mcreator.genshinnature.entity.CrimsonflankpigeonflyingEntity;
import net.mcreator.genshinnature.entity.CrimsonflankpigeonEntity;
import net.mcreator.genshinnature.entity.CrimsonfinchflyingEntity;
import net.mcreator.genshinnature.entity.CrimsonfinchEntity;
import net.mcreator.genshinnature.entity.CoralbutterflyEntity;
import net.mcreator.genshinnature.entity.Childephase2Entity;
import net.mcreator.genshinnature.entity.ChildeEntity;
import net.mcreator.genshinnature.entity.BrownwingfalconflyingEntity;
import net.mcreator.genshinnature.entity.BrownwingfalconEntity;
import net.mcreator.genshinnature.entity.BrownshirakodaispawningEntity;
import net.mcreator.genshinnature.entity.BrownshirakodaiEntity;
import net.mcreator.genshinnature.entity.BrightcrownpigeonflyingEntity;
import net.mcreator.genshinnature.entity.BrightcrownpigeonEntity;
import net.mcreator.genshinnature.entity.BootweaselEntity;
import net.mcreator.genshinnature.entity.BoarEntity;
import net.mcreator.genshinnature.entity.BluethunderweaselEntity;
import net.mcreator.genshinnature.entity.BluehornedlizardEntity;
import net.mcreator.genshinnature.entity.BluebutterflyEntity;
import net.mcreator.genshinnature.entity.BlackkingpigeonflyingEntity;
import net.mcreator.genshinnature.entity.BlackkingpigeonEntity;
import net.mcreator.genshinnature.entity.BettaspawningEntity;
import net.mcreator.genshinnature.entity.BettaEntity;
import net.mcreator.genshinnature.entity.BaalcloneEntity;
import net.mcreator.genshinnature.entity.AzurecraneEntity;
import net.mcreator.genshinnature.entity.AzhdahaEntity;
import net.mcreator.genshinnature.entity.AttackingminionEntity;
import net.mcreator.genshinnature.entity.AramaEntity;
import net.mcreator.genshinnature.entity.ApprenticesnotesascendedProjectileEntity;
import net.mcreator.genshinnature.entity.ApprenticesnotesProjectileEntity;
import net.mcreator.genshinnature.entity.AnemospecterEntity;
import net.mcreator.genshinnature.entity.AnemoslimeEntity;
import net.mcreator.genshinnature.entity.AnemosamachurlEntity;
import net.mcreator.genshinnature.entity.Anemohypostasisphase8Entity;
import net.mcreator.genshinnature.entity.Anemohypostasisphase7Entity;
import net.mcreator.genshinnature.entity.Anemohypostasisphase6Entity;
import net.mcreator.genshinnature.entity.Anemohypostasisphase5EntityProjectile;
import net.mcreator.genshinnature.entity.Anemohypostasisphase5Entity;
import net.mcreator.genshinnature.entity.Anemohypostasisphase4Entity;
import net.mcreator.genshinnature.entity.Anemohypostasisphase3Entity;
import net.mcreator.genshinnature.entity.Anemohypostasisphase2Entity;
import net.mcreator.genshinnature.entity.AnemohypostasisEntity;
import net.mcreator.genshinnature.entity.AnemocrystalflyEntity;
import net.mcreator.genshinnature.entity.AnemobulletEntity;
import net.mcreator.genshinnature.entity.AmateurweaselthiefscaredEntity;
import net.mcreator.genshinnature.entity.AmateurweaselthiefEntity;
import net.mcreator.genshinnature.entity.AlgorithmofsemiintransientmatrixofoverseernetworkEntity;
import net.mcreator.genshinnature.entity.AkaimaouspawningEntity;
import net.mcreator.genshinnature.entity.AkaimaouEntity;
import net.mcreator.genshinnature.entity.AizenmedakaspawningEntity;
import net.mcreator.genshinnature.entity.AizenmedakaEntity;
import net.mcreator.genshinnature.entity.AdornedunagiEntity;
import net.mcreator.genshinnature.entity.AbyssmagepyroEntity;
import net.mcreator.genshinnature.entity.AbyssmagehydroEntity;
import net.mcreator.genshinnature.entity.AbyssmageelectroEntity;
import net.mcreator.genshinnature.entity.AbyssmagecryoEntity;
import net.mcreator.genshinnature.entity.AbidingangelfishspawningEntity;
import net.mcreator.genshinnature.entity.AbidingangelfishEntity;
import net.mcreator.genshinnature.GenshinNatureMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GenshinNatureModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, GenshinNatureMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AnemoslimeEntity>> ANEMOSLIME = register("anemoslime",
			EntityType.Builder.<AnemoslimeEntity>of(AnemoslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryoslimeEntity>> CRYOSLIME = register("cryoslime",
			EntityType.Builder.<CryoslimeEntity>of(CryoslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DendroslimeEntity>> DENDROSLIME = register("dendroslime",
			EntityType.Builder.<DendroslimeEntity>of(DendroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HiddendendroslimeEntity>> HIDDENDENDROSLIME = register("hiddendendroslime",
			EntityType.Builder.<HiddendendroslimeEntity>of(HiddendendroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectroslimeEntity>> ELECTROSLIME = register("electroslime",
			EntityType.Builder.<ElectroslimeEntity>of(ElectroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeoslimeEntity>> GEOSLIME = register("geoslime",
			EntityType.Builder.<GeoslimeEntity>of(GeoslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HydroslimeEntity>> HYDROSLIME = register("hydroslime",
			EntityType.Builder.<HydroslimeEntity>of(HydroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PyroslimeEntity>> PYROSLIME = register("pyroslime",
			EntityType.Builder.<PyroslimeEntity>of(PyroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<UnlitpyroslimeEntity>> UNLITPYROSLIME = register("unlitpyroslime",
			EntityType.Builder.<UnlitpyroslimeEntity>of(UnlitpyroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargeanemoslimeEntity>> LARGEANEMOSLIME = register("largeanemoslime",
			EntityType.Builder.<LargeanemoslimeEntity>of(LargeanemoslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargecryoslimeEntity>> LARGECRYOSLIME = register("largecryoslime",
			EntityType.Builder.<LargecryoslimeEntity>of(LargecryoslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargecryoslimenohelmetEntity>> LARGECRYOSLIMENOHELMET = register("largecryoslimenohelmet",
			EntityType.Builder.<LargecryoslimenohelmetEntity>of(LargecryoslimenohelmetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<HiddenlargedendroslimeEntity>> HIDDENLARGEDENDROSLIME = register("hiddenlargedendroslime",
			EntityType.Builder.<HiddenlargedendroslimeEntity>of(HiddenlargedendroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargedendroslimeEntity>> LARGEDENDROSLIME = register("largedendroslime",
			EntityType.Builder.<LargedendroslimeEntity>of(LargedendroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargeelectroslimeEntity>> LARGEELECTROSLIME = register("largeelectroslime",
			EntityType.Builder.<LargeelectroslimeEntity>of(LargeelectroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MutantelectroslimeEntity>> MUTANTELECTROSLIME = register("mutantelectroslime",
			EntityType.Builder.<MutantelectroslimeEntity>of(MutantelectroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargegeoslimeEntity>> LARGEGEOSLIME = register("largegeoslime",
			EntityType.Builder.<LargegeoslimeEntity>of(LargegeoslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargegeoslimenohelmetEntity>> LARGEGEOSLIMENOHELMET = register("largegeoslimenohelmet",
			EntityType.Builder.<LargegeoslimenohelmetEntity>of(LargegeoslimenohelmetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargehydroslimeEntity>> LARGEHYDROSLIME = register("largehydroslime",
			EntityType.Builder.<LargehydroslimeEntity>of(LargehydroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LargepyroslimeEntity>> LARGEPYROSLIME = register("largepyroslime",
			EntityType.Builder.<LargepyroslimeEntity>of(LargepyroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<UnlitlargepyroslimeEntity>> UNLITLARGEPYROSLIME = register("unlitlargepyroslime",
			EntityType.Builder.<UnlitlargepyroslimeEntity>of(UnlitlargepyroslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhirlwindEntity>> WHIRLWIND = register("whirlwind",
			EntityType.Builder.<WhirlwindEntity>of(WhirlwindEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryowhopperflowerEntity>> CRYOWHOPPERFLOWER = register("cryowhopperflower",
			EntityType.Builder.<CryowhopperflowerEntity>of(CryowhopperflowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PyrowhopperflowerEntity>> PYROWHOPPERFLOWER = register("pyrowhopperflower",
			EntityType.Builder.<PyrowhopperflowerEntity>of(PyrowhopperflowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectrowhopperflowerEntity>> ELECTROWHOPPERFLOWER = register("electrowhopperflower",
			EntityType.Builder.<ElectrowhopperflowerEntity>of(ElectrowhopperflowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectricballEntity>> ELECTRICBALL = register("electricball",
			EntityType.Builder.<ElectricballEntity>of(ElectricballEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnemospecterEntity>> ANEMOSPECTER = register("anemospecter",
			EntityType.Builder.<AnemospecterEntity>of(AnemospecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeospecterEntity>> GEOSPECTER = register("geospecter",
			EntityType.Builder.<GeospecterEntity>of(GeospecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HydrospecterEntity>> HYDROSPECTER = register("hydrospecter",
			EntityType.Builder.<HydrospecterEntity>of(HydrospecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryocicinEntity>> CRYOCICIN = register("cryocicin",
			EntityType.Builder.<CryocicinEntity>of(CryocicinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectrocicinEntity>> ELECTROCICIN = register("electrocicin",
			EntityType.Builder.<ElectrocicinEntity>of(ElectrocicinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<HydrocicinEntity>> HYDROCICIN = register("hydrocicin",
			EntityType.Builder.<HydrocicinEntity>of(HydrocicinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<FatuicryocicinmageEntity>> FATUICRYOCICINMAGE = register("fatuicryocicinmage",
			EntityType.Builder.<FatuicryocicinmageEntity>of(FatuicryocicinmageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FatuielectrocicinmageEntity>> FATUIELECTROCICINMAGE = register("fatuielectrocicinmage",
			EntityType.Builder.<FatuielectrocicinmageEntity>of(FatuielectrocicinmageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlEntity>> HILICHURL = register("hilichurl",
			EntityType.Builder.<HilichurlEntity>of(HilichurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlfighterEntity>> HILICHURLFIGHTER = register("hilichurlfighter",
			EntityType.Builder.<HilichurlfighterEntity>of(HilichurlfighterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlshooterEntity>> HILICHURLSHOOTER = register("hilichurlshooter",
			EntityType.Builder.<HilichurlshooterEntity>of(HilichurlshooterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlshooterEntityProjectile>> HILICHURLSHOOTER_PROJECTILE = register("projectile_hilichurlshooter",
			EntityType.Builder.<HilichurlshooterEntityProjectile>of(HilichurlshooterEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<UnusualhilichurlEntity>> UNUSUALHILICHURL = register("unusualhilichurl",
			EntityType.Builder.<UnusualhilichurlEntity>of(UnusualhilichurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlcryogrenadierEntity>> HILICHURLCRYOGRENADIER = register("hilichurlcryogrenadier",
			EntityType.Builder.<HilichurlcryogrenadierEntity>of(HilichurlcryogrenadierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlcryoshooterEntity>> HILICHURLCRYOSHOOTER = register("hilichurlcryoshooter",
			EntityType.Builder.<HilichurlcryoshooterEntity>of(HilichurlcryoshooterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlcryoshooterEntityProjectile>> HILICHURLCRYOSHOOTER_PROJECTILE = register("projectile_hilichurlcryoshooter",
			EntityType.Builder.<HilichurlcryoshooterEntityProjectile>of(HilichurlcryoshooterEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<IceshieldhilichurlguardEntity>> ICESHIELDHILICHURLGUARD = register("iceshieldhilichurlguard",
			EntityType.Builder.<IceshieldhilichurlguardEntity>of(IceshieldhilichurlguardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WoodenshieldhilichurlguardEntity>> WOODENSHIELDHILICHURLGUARD = register("woodenshieldhilichurlguard",
			EntityType.Builder.<WoodenshieldhilichurlguardEntity>of(WoodenshieldhilichurlguardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlelectrogrenadierEntity>> HILICHURLELECTROGRENADIER = register("hilichurlelectrogrenadier",
			EntityType.Builder.<HilichurlelectrogrenadierEntity>of(HilichurlelectrogrenadierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlelectroshooterEntity>> HILICHURLELECTROSHOOTER = register("hilichurlelectroshooter",
			EntityType.Builder.<HilichurlelectroshooterEntity>of(HilichurlelectroshooterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlelectroshooterEntityProjectile>> HILICHURLELECTROSHOOTER_PROJECTILE = register("projectile_hilichurlelectroshooter",
			EntityType.Builder.<HilichurlelectroshooterEntityProjectile>of(HilichurlelectroshooterEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockshieldhilichurlguardEntity>> ROCKSHIELDHILICHURLGUARD = register("rockshieldhilichurlguard",
			EntityType.Builder.<RockshieldhilichurlguardEntity>of(RockshieldhilichurlguardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlberserkerEntity>> HILICHURLBERSERKER = register("hilichurlberserker",
			EntityType.Builder.<HilichurlberserkerEntity>of(HilichurlberserkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlpyrogrenadierEntity>> HILICHURLPYROGRENADIER = register("hilichurlpyrogrenadier",
			EntityType.Builder.<HilichurlpyrogrenadierEntity>of(HilichurlpyrogrenadierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlpyroshooterEntity>> HILICHURLPYROSHOOTER = register("hilichurlpyroshooter",
			EntityType.Builder.<HilichurlpyroshooterEntity>of(HilichurlpyroshooterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HilichurlpyroshooterEntityProjectile>> HILICHURLPYROSHOOTER_PROJECTILE = register("projectile_hilichurlpyroshooter",
			EntityType.Builder.<HilichurlpyroshooterEntityProjectile>of(HilichurlpyroshooterEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnemosamachurlEntity>> ANEMOSAMACHURL = register("anemosamachurl",
			EntityType.Builder.<AnemosamachurlEntity>of(AnemosamachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryosamachurlEntity>> CRYOSAMACHURL = register("cryosamachurl",
			EntityType.Builder.<CryosamachurlEntity>of(CryosamachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DendrosamachurlEntity>> DENDROSAMACHURL = register("dendrosamachurl",
			EntityType.Builder.<DendrosamachurlEntity>of(DendrosamachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectrosamachurlEntity>> ELECTROSAMACHURL = register("electrosamachurl",
			EntityType.Builder.<ElectrosamachurlEntity>of(ElectrosamachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeosamachurlEntity>> GEOSAMACHURL = register("geosamachurl",
			EntityType.Builder.<GeosamachurlEntity>of(GeosamachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HydrosamachurlEntity>> HYDROSAMACHURL = register("hydrosamachurl",
			EntityType.Builder.<HydrosamachurlEntity>of(HydrosamachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AbyssmagecryoEntity>> ABYSSMAGECRYO = register("abyssmagecryo",
			EntityType.Builder.<AbyssmagecryoEntity>of(AbyssmagecryoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryoabyssmageEntity>> CRYOABYSSMAGE = register("cryoabyssmage",
			EntityType.Builder.<CryoabyssmageEntity>of(CryoabyssmageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2.7f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<AbyssmageelectroEntity>> ABYSSMAGEELECTRO = register("abyssmageelectro",
			EntityType.Builder.<AbyssmageelectroEntity>of(AbyssmageelectroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectroabyssmageEntity>> ELECTROABYSSMAGE = register("electroabyssmage",
			EntityType.Builder.<ElectroabyssmageEntity>of(ElectroabyssmageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2.7f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<AbyssmagehydroEntity>> ABYSSMAGEHYDRO = register("abyssmagehydro",
			EntityType.Builder.<AbyssmagehydroEntity>of(AbyssmagehydroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HydroabyssmageEntity>> HYDROABYSSMAGE = register("hydroabyssmage",
			EntityType.Builder.<HydroabyssmageEntity>of(HydroabyssmageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2.7f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<AbyssmagepyroEntity>> ABYSSMAGEPYRO = register("abyssmagepyro",
			EntityType.Builder.<AbyssmagepyroEntity>of(AbyssmagepyroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PyroabyssmageEntity>> PYROABYSSMAGE = register("pyroabyssmage",
			EntityType.Builder.<PyroabyssmageEntity>of(PyroabyssmageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2.7f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<LivingbubbleEntity>> LIVINGBUBBLE = register("livingbubble",
			EntityType.Builder.<LivingbubbleEntity>of(LivingbubbleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<WispEntity>> WISP = register("wisp",
			EntityType.Builder.<WispEntity>of(WispEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MysteriousseelieEntity>> MYSTERIOUSSEELIE = register("mysteriousseelie",
			EntityType.Builder.<MysteriousseelieEntity>of(MysteriousseelieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarmseelieEntity>> WARMSEELIE = register("warmseelie",
			EntityType.Builder.<WarmseelieEntity>of(WarmseelieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectroseelieEntity>> ELECTROSEELIE = register("electroseelie",
			EntityType.Builder.<ElectroseelieEntity>of(ElectroseelieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FireflyEntity>> FIREFLY = register("firefly",
			EntityType.Builder.<FireflyEntity>of(FireflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScarletbeakduckEntity>> SCARLETBEAKDUCK = register("scarletbeakduck",
			EntityType.Builder.<ScarletbeakduckEntity>of(ScarletbeakduckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<EmeraldduckEntity>> EMERALDDUCK = register("emeraldduck",
			EntityType.Builder.<EmeraldduckEntity>of(EmeraldduckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<AzurecraneEntity>> AZURECRANE = register("azurecrane",
			EntityType.Builder.<AzurecraneEntity>of(AzurecraneEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<VioletibisEntity>> VIOLETIBIS = register("violetibis",
			EntityType.Builder.<VioletibisEntity>of(VioletibisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrowEntity>> CROW = register("crow",
			EntityType.Builder.<CrowEntity>of(CrowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryoregisvineEntity>> CRYOREGISVINE = register("cryoregisvine",
			EntityType.Builder.<CryoregisvineEntity>of(CryoregisvineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(4f, 6.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PyroregisvineEntity>> PYROREGISVINE = register("pyroregisvine",
			EntityType.Builder.<PyroregisvineEntity>of(PyroregisvineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(4f, 6.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<SquirrelEntity>> SQUIRREL = register("squirrel",
			EntityType.Builder.<SquirrelEntity>of(SquirrelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<BoarEntity>> BOAR = register("boar",
			EntityType.Builder.<BoarEntity>of(BoarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowboarEntity>> SNOWBOAR = register("snowboar",
			EntityType.Builder.<SnowboarEntity>of(SnowboarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowweaselEntity>> SNOWWEASEL = register("snowweasel",
			EntityType.Builder.<SnowweaselEntity>of(SnowweaselEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedtailedweaselEntity>> REDTAILEDWEASEL = register("redtailedweasel",
			EntityType.Builder.<RedtailedweaselEntity>of(RedtailedweaselEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BootweaselEntity>> BOOTWEASEL = register("bootweasel",
			EntityType.Builder.<BootweaselEntity>of(BootweaselEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BluebutterflyEntity>> BLUEBUTTERFLY = register("bluebutterfly",
			EntityType.Builder.<BluebutterflyEntity>of(BluebutterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightbluebutterflyEntity>> LIGHTBLUEBUTTERFLY = register("lightbluebutterfly",
			EntityType.Builder.<LightbluebutterflyEntity>of(LightbluebutterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PinkbutterflyEntity>> PINKBUTTERFLY = register("pinkbutterfly",
			EntityType.Builder.<PinkbutterflyEntity>of(PinkbutterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<YellowbutterflyEntity>> YELLOWBUTTERFLY = register("yellowbutterfly",
			EntityType.Builder.<YellowbutterflyEntity>of(YellowbutterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnemocrystalflyEntity>> ANEMOCRYSTALFLY = register("anemocrystalfly",
			EntityType.Builder.<AnemocrystalflyEntity>of(AnemocrystalflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryocrystalflyEntity>> CRYOCRYSTALFLY = register("cryocrystalfly",
			EntityType.Builder.<CryocrystalflyEntity>of(CryocrystalflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectrocrystalflyEntity>> ELECTROCRYSTALFLY = register("electrocrystalfly",
			EntityType.Builder.<ElectrocrystalflyEntity>of(ElectrocrystalflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeocrystalflyEntity>> GEOCRYSTALFLY = register("geocrystalfly",
			EntityType.Builder.<GeocrystalflyEntity>of(GeocrystalflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldencrabEntity>> GOLDENCRAB = register("goldencrab",
			EntityType.Builder.<GoldencrabEntity>of(GoldencrabEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SuncrabEntity>> SUNCRAB = register("suncrab",
			EntityType.Builder.<SuncrabEntity>of(SuncrabEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<OceancrabEntity>> OCEANCRAB = register("oceancrab",
			EntityType.Builder.<OceancrabEntity>of(OceancrabEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeneralcrabEntity>> GENERALCRAB = register("generalcrab",
			EntityType.Builder.<GeneralcrabEntity>of(GeneralcrabEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PaleredcrabEntity>> PALEREDCRAB = register("paleredcrab",
			EntityType.Builder.<PaleredcrabEntity>of(PaleredcrabEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BluehornedlizardEntity>> BLUEHORNEDLIZARD = register("bluehornedlizard",
			EntityType.Builder.<BluehornedlizardEntity>of(BluehornedlizardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<GreenhornedlizardEntity>> GREENHORNEDLIZARD = register("greenhornedlizard",
			EntityType.Builder.<GreenhornedlizardEntity>of(GreenhornedlizardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedhornedlizardEntity>> REDHORNEDLIZARD = register("redhornedlizard",
			EntityType.Builder.<RedhornedlizardEntity>of(RedhornedlizardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PithlizardEntity>> PITHLIZARD = register("pithlizard",
			EntityType.Builder.<PithlizardEntity>of(PithlizardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AdornedunagiEntity>> ADORNEDUNAGI = register("adornedunagi",
			EntityType.Builder.<AdornedunagiEntity>of(AdornedunagiEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedfinnedunagiEntity>> REDFINNEDUNAGI = register("redfinnedunagi",
			EntityType.Builder.<RedfinnedunagiEntity>of(RedfinnedunagiEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DeepseaunagiEntity>> DEEPSEAUNAGI = register("deepseaunagi",
			EntityType.Builder.<DeepseaunagiEntity>of(DeepseaunagiEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PyrospecterEntity>> PYROSPECTER = register("pyrospecter",
			EntityType.Builder.<PyrospecterEntity>of(PyrospecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryospecterEntity>> CRYOSPECTER = register("cryospecter",
			EntityType.Builder.<CryospecterEntity>of(CryospecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectrospecterEntity>> ELECTROSPECTER = register("electrospecter",
			EntityType.Builder.<ElectrospecterEntity>of(ElectrospecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DivdarayEntity>> DIVDARAY = register("divdaray",
			EntityType.Builder.<DivdarayEntity>of(DivdarayEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FormalorayEntity>> FORMALORAY = register("formaloray",
			EntityType.Builder.<FormalorayEntity>of(FormalorayEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FloatingrayEntity>> FLOATINGRAY = register("floatingray",
			EntityType.Builder.<FloatingrayEntity>of(FloatingrayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EyeofthestormEntity>> EYEOFTHESTORM = register("eyeofthestorm",
			EntityType.Builder.<EyeofthestormEntity>of(EyeofthestormEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Eyeofstormphase2Entity>> EYEOFSTORMPHASE_2 = register("eyeofstormphase_2",
			EntityType.Builder.<Eyeofstormphase2Entity>of(Eyeofstormphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThundermanifestationEntity>> THUNDERMANIFESTATION = register("thundermanifestation",
			EntityType.Builder.<ThundermanifestationEntity>of(ThundermanifestationEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.3f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectricwallEntity>> ELECTRICWALL = register("electricwall",
			EntityType.Builder.<ElectricwallEntity>of(ElectricwallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectrictntEntity>> ELECTRICTNT = register("electrictnt",
			EntityType.Builder.<ElectrictntEntity>of(ElectrictntEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FellflowerEntity>> FELLFLOWER = register("fellflower",
			EntityType.Builder.<FellflowerEntity>of(FellflowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 5.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HatefuloceanidEntity>> HATEFULOCEANID = register("hatefuloceanid",
			EntityType.Builder.<HatefuloceanidEntity>of(HatefuloceanidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.3f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<WaterminionboarEntity>> WATERMINIONBOAR = register("waterminionboar",
			EntityType.Builder.<WaterminionboarEntity>of(WaterminionboarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<WaterminionferretEntity>> WATERMINIONFERRET = register("waterminionferret",
			EntityType.Builder.<WaterminionferretEntity>of(WaterminionferretEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WaterminioncrabEntity>> WATERMINIONCRAB = register("waterminioncrab",
			EntityType.Builder.<WaterminioncrabEntity>of(WaterminioncrabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiniseeliecurcumaEntity>> MINISEELIECURCUMA = register("miniseeliecurcuma",
			EntityType.Builder.<MiniseeliecurcumaEntity>of(MiniseeliecurcumaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiniseeliedayflowerEntity>> MINISEELIEDAYFLOWER = register("miniseeliedayflower",
			EntityType.Builder.<MiniseeliedayflowerEntity>of(MiniseeliedayflowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiniseelieroseEntity>> MINISEELIEROSE = register("miniseelierose",
			EntityType.Builder.<MiniseelieroseEntity>of(MiniseelieroseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiniseelieviolaEntity>> MINISEELIEVIOLA = register("miniseelieviola",
			EntityType.Builder.<MiniseelieviolaEntity>of(MiniseelieviolaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AzhdahaEntity>> AZHDAHA = register("azhdaha",
			EntityType.Builder.<AzhdahaEntity>of(AzhdahaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(14f, 13f));
	public static final DeferredHolder<EntityType<?>, EntityType<MysteriousseeliesoulsandEntity>> MYSTERIOUSSEELIESOULSAND = register("mysteriousseeliesoulsand",
			EntityType.Builder.<MysteriousseeliesoulsandEntity>of(MysteriousseeliesoulsandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WarmseelieicespikesEntity>> WARMSEELIEICESPIKES = register("warmseelieicespikes",
			EntityType.Builder.<WarmseelieicespikesEntity>of(WarmseelieicespikesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<OnikabutoEntity>> ONIKABUTO = register("onikabuto",
			EntityType.Builder.<OnikabutoEntity>of(OnikabutoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AmateurweaselthiefEntity>> AMATEURWEASELTHIEF = register("amateurweaselthief",
			EntityType.Builder.<AmateurweaselthiefEntity>of(AmateurweaselthiefEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AmateurweaselthiefscaredEntity>> AMATEURWEASELTHIEFSCARED = register("amateurweaselthiefscared",
			EntityType.Builder.<AmateurweaselthiefscaredEntity>of(AmateurweaselthiefscaredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HoarderweaselthiefEntity>> HOARDERWEASELTHIEF = register("hoarderweaselthief",
			EntityType.Builder.<HoarderweaselthiefEntity>of(HoarderweaselthiefEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<HoarderweaselthiefscaredEntity>> HOARDERWEASELTHIEFSCARED = register("hoarderweaselthiefscared",
			EntityType.Builder.<HoarderweaselthiefscaredEntity>of(HoarderweaselthiefscaredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenweaselthiefEntity>> GOLDENWEASELTHIEF = register("goldenweaselthief",
			EntityType.Builder.<GoldenweaselthiefEntity>of(GoldenweaselthiefEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenweaselthiefscaredEntity>> GOLDENWEASELTHIEFSCARED = register("goldenweaselthiefscared",
			EntityType.Builder.<GoldenweaselthiefscaredEntity>of(GoldenweaselthiefscaredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeohypostasisEntity>> GEOHYPOSTASIS = register("geohypostasis",
			EntityType.Builder.<GeohypostasisEntity>of(GeohypostasisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase2Entity>> GEOHYPOSTASISPHASE_2 = register("geohypostasisphase_2",
			EntityType.Builder.<Geohypostasisphase2Entity>of(Geohypostasisphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase3Entity>> GEOHYPOSTASISPHASE_3 = register("geohypostasisphase_3",
			EntityType.Builder.<Geohypostasisphase3Entity>of(Geohypostasisphase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase3EntityProjectile>> GEOHYPOSTASISPHASE_3_PROJECTILE = register("projectile_geohypostasisphase_3",
			EntityType.Builder.<Geohypostasisphase3EntityProjectile>of(Geohypostasisphase3EntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShootingminionEntity>> SHOOTINGMINION = register("shootingminion",
			EntityType.Builder.<ShootingminionEntity>of(ShootingminionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShootingminionEntityProjectile>> SHOOTINGMINION_PROJECTILE = register("projectile_shootingminion",
			EntityType.Builder.<ShootingminionEntityProjectile>of(ShootingminionEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase4Entity>> GEOHYPOSTASISPHASE_4 = register("geohypostasisphase_4",
			EntityType.Builder.<Geohypostasisphase4Entity>of(Geohypostasisphase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase5Entity>> GEOHYPOSTASISPHASE_5 = register("geohypostasisphase_5",
			EntityType.Builder.<Geohypostasisphase5Entity>of(Geohypostasisphase5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.5f, 3.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase6Entity>> GEOHYPOSTASISPHASE_6 = register("geohypostasisphase_6",
			EntityType.Builder.<Geohypostasisphase6Entity>of(Geohypostasisphase6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase7Entity>> GEOHYPOSTASISPHASE_7 = register("geohypostasisphase_7",
			EntityType.Builder.<Geohypostasisphase7Entity>of(Geohypostasisphase7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Geohypostasisphase8Entity>> GEOHYPOSTASISPHASE_8 = register("geohypostasisphase_8",
			EntityType.Builder.<Geohypostasisphase8Entity>of(Geohypostasisphase8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThundercravenrifthoundwhelpEntity>> THUNDERCRAVENRIFTHOUNDWHELP = register("thundercravenrifthoundwhelp",
			EntityType.Builder.<ThundercravenrifthoundwhelpEntity>of(ThundercravenrifthoundwhelpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockfondrifthoundwhelpEntity>> ROCKFONDRIFTHOUNDWHELP = register("rockfondrifthoundwhelp",
			EntityType.Builder.<RockfondrifthoundwhelpEntity>of(RockfondrifthoundwhelpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockfondrifthoundEntity>> ROCKFONDRIFTHOUND = register("rockfondrifthound",
			EntityType.Builder.<RockfondrifthoundEntity>of(RockfondrifthoundEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThundercravenrifthoundEntity>> THUNDERCRAVENRIFTHOUND = register("thundercravenrifthound",
			EntityType.Builder.<ThundercravenrifthoundEntity>of(ThundercravenrifthoundEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TreasurehoarderEntity>> TREASUREHOARDER = register("treasurehoarder",
			EntityType.Builder.<TreasurehoarderEntity>of(TreasurehoarderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StonehidelawachurlEntity>> STONEHIDELAWACHURL = register("stonehidelawachurl",
			EntityType.Builder.<StonehidelawachurlEntity>of(StonehidelawachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnemohypostasisEntity>> ANEMOHYPOSTASIS = register("anemohypostasis",
			EntityType.Builder.<AnemohypostasisEntity>of(AnemohypostasisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase2Entity>> ANEMOHYPOSTASISPHASE_2 = register("anemohypostasisphase_2",
			EntityType.Builder.<Anemohypostasisphase2Entity>of(Anemohypostasisphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(3f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase3Entity>> ANEMOHYPOSTASISPHASE_3 = register("anemohypostasisphase_3",
			EntityType.Builder.<Anemohypostasisphase3Entity>of(Anemohypostasisphase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase4Entity>> ANEMOHYPOSTASISPHASE_4 = register("anemohypostasisphase_4",
			EntityType.Builder.<Anemohypostasisphase4Entity>of(Anemohypostasisphase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase5Entity>> ANEMOHYPOSTASISPHASE_5 = register("anemohypostasisphase_5",
			EntityType.Builder.<Anemohypostasisphase5Entity>of(Anemohypostasisphase5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase5EntityProjectile>> ANEMOHYPOSTASISPHASE_5_PROJECTILE = register("projectile_anemohypostasisphase_5",
			EntityType.Builder.<Anemohypostasisphase5EntityProjectile>of(Anemohypostasisphase5EntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase6Entity>> ANEMOHYPOSTASISPHASE_6 = register("anemohypostasisphase_6",
			EntityType.Builder.<Anemohypostasisphase6Entity>of(Anemohypostasisphase6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase7Entity>> ANEMOHYPOSTASISPHASE_7 = register("anemohypostasisphase_7",
			EntityType.Builder.<Anemohypostasisphase7Entity>of(Anemohypostasisphase7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.6f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<Anemohypostasisphase8Entity>> ANEMOHYPOSTASISPHASE_8 = register("anemohypostasisphase_8",
			EntityType.Builder.<Anemohypostasisphase8Entity>of(Anemohypostasisphase8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenwolflordEntity>> GOLDENWOLFLORD = register("goldenwolflord",
			EntityType.Builder.<GoldenwolflordEntity>of(GoldenwolflordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(5f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenattackerEntity>> GOLDENATTACKER = register("goldenattacker",
			EntityType.Builder.<GoldenattackerEntity>of(GoldenattackerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenwolflordbossEntity>> GOLDENWOLFLORDBOSS = register("goldenwolflordboss",
			EntityType.Builder.<GoldenwolflordbossEntity>of(GoldenwolflordbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(5f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenminionEntity>> GOLDENMINION = register("goldenminion",
			EntityType.Builder.<GoldenminionEntity>of(GoldenminionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<AttackingminionEntity>> ATTACKINGMINION = register("attackingminion",
			EntityType.Builder.<AttackingminionEntity>of(AttackingminionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<CoralbutterflyEntity>> CORALBUTTERFLY = register("coralbutterfly",
			EntityType.Builder.<CoralbutterflyEntity>of(CoralbutterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PyrohypostasisEntity>> PYROHYPOSTASIS = register("pyrohypostasis",
			EntityType.Builder.<PyrohypostasisEntity>of(PyrohypostasisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<FloatinglargeanemoslimeEntity>> FLOATINGLARGEANEMOSLIME = register("floatinglargeanemoslime",
			EntityType.Builder.<FloatinglargeanemoslimeEntity>of(FloatinglargeanemoslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowyhuskstandardbearerEntity>> SHADOWYHUSKSTANDARDBEARER = register("shadowyhuskstandardbearer",
			EntityType.Builder.<ShadowyhuskstandardbearerEntity>of(ShadowyhuskstandardbearerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.2f, 4f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowyhusklinebreakerEntity>> SHADOWYHUSKLINEBREAKER = register("shadowyhusklinebreaker",
			EntityType.Builder.<ShadowyhusklinebreakerEntity>of(ShadowyhusklinebreakerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 4f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowyhuskdefenderEntity>> SHADOWYHUSKDEFENDER = register("shadowyhuskdefender",
			EntityType.Builder.<ShadowyhuskdefenderEntity>of(ShadowyhuskdefenderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Pyrohypostasisphase2Entity>> PYROHYPOSTASISPHASE_2 = register("pyrohypostasisphase_2",
			EntityType.Builder.<Pyrohypostasisphase2Entity>of(Pyrohypostasisphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.3f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Pyrohypostasisphase3Entity>> PYROHYPOSTASISPHASE_3 = register("pyrohypostasisphase_3",
			EntityType.Builder.<Pyrohypostasisphase3Entity>of(Pyrohypostasisphase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2.5f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<Pyrohypostasisphase4Entity>> PYROHYPOSTASISPHASE_4 = register("pyrohypostasisphase_4",
			EntityType.Builder.<Pyrohypostasisphase4Entity>of(Pyrohypostasisphase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Pyrohypostasisphase5Entity>> PYROHYPOSTASISPHASE_5 = register("pyrohypostasisphase_5",
			EntityType.Builder.<Pyrohypostasisphase5Entity>of(Pyrohypostasisphase5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Pyrohypostasisphase6Entity>> PYROHYPOSTASISPHASE_6 = register("pyrohypostasisphase_6",
			EntityType.Builder.<Pyrohypostasisphase6Entity>of(Pyrohypostasisphase6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.5f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Pyrohypostasisphase7Entity>> PYROHYPOSTASISPHASE_7 = register("pyrohypostasisphase_7",
			EntityType.Builder.<Pyrohypostasisphase7Entity>of(Pyrohypostasisphase7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Pyrohypostasisphase8Entity>> PYROHYPOSTASISPHASE_8 = register("pyrohypostasisphase_8",
			EntityType.Builder.<Pyrohypostasisphase8Entity>of(Pyrohypostasisphase8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectrohypostasisEntity>> ELECTROHYPOSTASIS = register("electrohypostasis",
			EntityType.Builder.<ElectrohypostasisEntity>of(ElectrohypostasisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<FloatinghydrofungiEntity>> FLOATINGHYDROFUNGI = register("floatinghydrofungi",
			EntityType.Builder.<FloatinghydrofungiEntity>of(FloatinghydrofungiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase2Entity>> ELECTROHYPOSTASISPHASE_2 = register("electrohypostasisphase_2",
			EntityType.Builder.<Electrohypostasisphase2Entity>of(Electrohypostasisphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase2EntityProjectile>> ELECTROHYPOSTASISPHASE_2_PROJECTILE = register("projectile_electrohypostasisphase_2",
			EntityType.Builder.<Electrohypostasisphase2EntityProjectile>of(Electrohypostasisphase2EntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BluethunderweaselEntity>> BLUETHUNDERWEASEL = register("bluethunderweasel",
			EntityType.Builder.<BluethunderweaselEntity>of(BluethunderweaselEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase3Entity>> ELECTROHYPOSTASISPHASE_3 = register("electrohypostasisphase_3",
			EntityType.Builder.<Electrohypostasisphase3Entity>of(Electrohypostasisphase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase4Entity>> ELECTROHYPOSTASISPHASE_4 = register("electrohypostasisphase_4",
			EntityType.Builder.<Electrohypostasisphase4Entity>of(Electrohypostasisphase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase5Entity>> ELECTROHYPOSTASISPHASE_5 = register("electrohypostasisphase_5",
			EntityType.Builder.<Electrohypostasisphase5Entity>of(Electrohypostasisphase5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase6Entity>> ELECTROHYPOSTASISPHASE_6 = register("electrohypostasisphase_6",
			EntityType.Builder.<Electrohypostasisphase6Entity>of(Electrohypostasisphase6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase7Entity>> ELECTROHYPOSTASISPHASE_7 = register("electrohypostasisphase_7",
			EntityType.Builder.<Electrohypostasisphase7Entity>of(Electrohypostasisphase7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Electrohypostasisphase8Entity>> ELECTROHYPOSTASISPHASE_8 = register("electrohypostasisphase_8",
			EntityType.Builder.<Electrohypostasisphase8Entity>of(Electrohypostasisphase8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<FriendlyelectrocicinEntity>> FRIENDLYELECTROCICIN = register("friendlyelectrocicin",
			EntityType.Builder.<FriendlyelectrocicinEntity>of(FriendlyelectrocicinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrostarmlawachurlEntity>> FROSTARMLAWACHURL = register("frostarmlawachurl",
			EntityType.Builder.<FrostarmlawachurlEntity>of(FrostarmlawachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LucklightflyEntity>> LUCKLIGHTFLY = register("lucklightfly",
			EntityType.Builder.<LucklightflyEntity>of(LucklightflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LucklightflyspawningEntity>> LUCKLIGHTFLYSPAWNING = register("lucklightflyspawning",
			EntityType.Builder.<LucklightflyspawningEntity>of(LucklightflyspawningEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LuminousseelieEntity>> LUMINOUSSEELIE = register("luminousseelie",
			EntityType.Builder.<LuminousseelieEntity>of(LuminousseelieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LuminousseeliespawningEntity>> LUMINOUSSEELIESPAWNING = register("luminousseeliespawning",
			EntityType.Builder.<LuminousseeliespawningEntity>of(LuminousseeliespawningEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MitachurlblazingaxeEntity>> MITACHURLBLAZINGAXE = register("mitachurlblazingaxe",
			EntityType.Builder.<MitachurlblazingaxeEntity>of(MitachurlblazingaxeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MitachurlcracklingaxeEntity>> MITACHURLCRACKLINGAXE = register("mitachurlcracklingaxe",
			EntityType.Builder.<MitachurlcracklingaxeEntity>of(MitachurlcracklingaxeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<KairagifierymightEntity>> KAIRAGIFIERYMIGHT = register("kairagifierymight",
			EntityType.Builder.<KairagifierymightEntity>of(KairagifierymightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KairagidancingthunderEntity>> KAIRAGIDANCINGTHUNDER = register("kairagidancingthunder",
			EntityType.Builder.<KairagidancingthunderEntity>of(KairagidancingthunderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiasmictumorEntity>> MIASMICTUMOR = register("miasmictumor",
			EntityType.Builder.<MiasmictumorEntity>of(MiasmictumorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3.4f, 3.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<OchimusacankeredflameEntity>> OCHIMUSACANKEREDFLAME = register("ochimusacankeredflame",
			EntityType.Builder.<OchimusacankeredflameEntity>of(OchimusacankeredflameEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OchimusaensorcelledthunderEntity>> OCHIMUSAENSORCELLEDTHUNDER = register("ochimusaensorcelledthunder",
			EntityType.Builder.<OchimusaensorcelledthunderEntity>of(OchimusaensorcelledthunderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MirrormaidenEntity>> MIRRORMAIDEN = register("mirrormaiden",
			EntityType.Builder.<MirrormaidenEntity>of(MirrormaidenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MirrormaidenEntityProjectile>> MIRRORMAIDEN_PROJECTILE = register("projectile_mirrormaiden",
			EntityType.Builder.<MirrormaidenEntityProjectile>of(MirrormaidenEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FloattybubbleEntity>> FLOATTYBUBBLE = register("floattybubble",
			EntityType.Builder.<FloattybubbleEntity>of(FloattybubbleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThunderhelmlawachurlEntity>> THUNDERHELMLAWACHURL = register("thunderhelmlawachurl",
			EntityType.Builder.<ThunderhelmlawachurlEntity>of(ThunderhelmlawachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CryohypostasisEntity>> CRYOHYPOSTASIS = register("cryohypostasis",
			EntityType.Builder.<CryohypostasisEntity>of(CryohypostasisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase2Entity>> CRYOHYPOSTASISPHASE_2 = register("cryohypostasisphase_2",
			EntityType.Builder.<Cryohypostasisphase2Entity>of(Cryohypostasisphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GreatsnowboarkingEntity>> GREATSNOWBOARKING = register("greatsnowboarking",
			EntityType.Builder.<GreatsnowboarkingEntity>of(GreatsnowboarkingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.7f, 2.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<WoodenshieldwallmitachurlEntity>> WOODENSHIELDWALLMITACHURL = register("woodenshieldwallmitachurl",
			EntityType.Builder.<WoodenshieldwallmitachurlEntity>of(WoodenshieldwallmitachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MitachurlEntity>> MITACHURL = register("mitachurl",
			EntityType.Builder.<MitachurlEntity>of(MitachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<EndoraEntity>> ENDORA = register("endora",
			EntityType.Builder.<EndoraEntity>of(EndoraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MagatsumitakenarukaminomikotoEntity>> MAGATSUMITAKENARUKAMINOMIKOTO = register("magatsumitakenarukaminomikoto",
			EntityType.Builder.<MagatsumitakenarukaminomikotoEntity>of(MagatsumitakenarukaminomikotoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BaalcloneEntity>> BAALCLONE = register("baalclone",
			EntityType.Builder.<BaalcloneEntity>of(BaalcloneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MagatsumitakenarukaminomikotopuppetEntity>> MAGATSUMITAKENARUKAMINOMIKOTOPUPPET = register("magatsumitakenarukaminomikotopuppet", EntityType.Builder
			.<MagatsumitakenarukaminomikotopuppetEntity>of(MagatsumitakenarukaminomikotopuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2.7f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MagatsumitakenarukaminomikotofinalEntity>> MAGATSUMITAKENARUKAMINOMIKOTOFINAL = register("magatsumitakenarukaminomikotofinal", EntityType.Builder
			.<MagatsumitakenarukaminomikotofinalEntity>of(MagatsumitakenarukaminomikotofinalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectricshooterEntity>> ELECTRICSHOOTER = register("electricshooter",
			EntityType.Builder.<ElectricshooterEntity>of(ElectricshooterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectricshooterEntityProjectile>> ELECTRICSHOOTER_PROJECTILE = register("projectile_electricshooter",
			EntityType.Builder.<ElectricshooterEntityProjectile>of(ElectricshooterEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase3Entity>> CRYOHYPOSTASISPHASE_3 = register("cryohypostasisphase_3",
			EntityType.Builder.<Cryohypostasisphase3Entity>of(Cryohypostasisphase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase4Entity>> CRYOHYPOSTASISPHASE_4 = register("cryohypostasisphase_4",
			EntityType.Builder.<Cryohypostasisphase4Entity>of(Cryohypostasisphase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase5Entity>> CRYOHYPOSTASISPHASE_5 = register("cryohypostasisphase_5",
			EntityType.Builder.<Cryohypostasisphase5Entity>of(Cryohypostasisphase5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.8f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase5EntityProjectile>> CRYOHYPOSTASISPHASE_5_PROJECTILE = register("projectile_cryohypostasisphase_5",
			EntityType.Builder.<Cryohypostasisphase5EntityProjectile>of(Cryohypostasisphase5EntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase6Entity>> CRYOHYPOSTASISPHASE_6 = register("cryohypostasisphase_6",
			EntityType.Builder.<Cryohypostasisphase6Entity>of(Cryohypostasisphase6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinscoutEntity>> RUINSCOUT = register("ruinscout",
			EntityType.Builder.<RuinscoutEntity>of(RuinscoutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinscoutEntityProjectile>> RUINSCOUT_PROJECTILE = register("projectile_ruinscout",
			EntityType.Builder.<RuinscoutEntityProjectile>of(RuinscoutEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GlacialmineEntity>> GLACIALMINE = register("glacialmine",
			EntityType.Builder.<GlacialmineEntity>of(GlacialmineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase7Entity>> CRYOHYPOSTASISPHASE_7 = register("cryohypostasisphase_7",
			EntityType.Builder.<Cryohypostasisphase7Entity>of(Cryohypostasisphase7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.5f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cryohypostasisphase8Entity>> CRYOHYPOSTASISPHASE_8 = register("cryohypostasisphase_8",
			EntityType.Builder.<Cryohypostasisphase8Entity>of(Cryohypostasisphase8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<HydrohypostasisEntity>> HYDROHYPOSTASIS = register("hydrohypostasis",
			EntityType.Builder.<HydrohypostasisEntity>of(HydrohypostasisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeovishaphatchlingEntity>> GEOVISHAPHATCHLING = register("geovishaphatchling",
			EntityType.Builder.<GeovishaphatchlingEntity>of(GeovishaphatchlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<Hydrohypostasisphase2Entity>> HYDROHYPOSTASISPHASE_2 = register("hydrohypostasisphase_2",
			EntityType.Builder.<Hydrohypostasisphase2Entity>of(Hydrohypostasisphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.9f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<Hydrohypostasisphase3Entity>> HYDROHYPOSTASISPHASE_3 = register("hydrohypostasisphase_3",
			EntityType.Builder.<Hydrohypostasisphase3Entity>of(Hydrohypostasisphase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Hydrohypostasisphase4Entity>> HYDROHYPOSTASISPHASE_4 = register("hydrohypostasisphase_4",
			EntityType.Builder.<Hydrohypostasisphase4Entity>of(Hydrohypostasisphase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Hydrohypostasisphase5Entity>> HYDROHYPOSTASISPHASE_5 = register("hydrohypostasisphase_5",
			EntityType.Builder.<Hydrohypostasisphase5Entity>of(Hydrohypostasisphase5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Hydrohypostasisphase6Entity>> HYDROHYPOSTASISPHASE_6 = register("hydrohypostasisphase_6",
			EntityType.Builder.<Hydrohypostasisphase6Entity>of(Hydrohypostasisphase6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Hydrohypostasisphase7Entity>> HYDROHYPOSTASISPHASE_7 = register("hydrohypostasisphase_7",
			EntityType.Builder.<Hydrohypostasisphase7Entity>of(Hydrohypostasisphase7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Hydrohypostasisphase8Entity>> HYDROHYPOSTASISPHASE_8 = register("hydrohypostasisphase_8",
			EntityType.Builder.<Hydrohypostasisphase8Entity>of(Hydrohypostasisphase8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuindefenderEntity>> RUINDEFENDER = register("ruindefender",
			EntityType.Builder.<RuindefenderEntity>of(RuindefenderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.9f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuindestroyerEntity>> RUINDESTROYER = register("ruindestroyer",
			EntityType.Builder.<RuindestroyerEntity>of(RuindestroyerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.1f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuindestroyerEntityProjectile>> RUINDESTROYER_PROJECTILE = register("projectile_ruindestroyer",
			EntityType.Builder.<RuindestroyerEntityProjectile>of(RuindestroyerEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuincruiserEntity>> RUINCRUISER = register("ruincruiser",
			EntityType.Builder.<RuincruiserEntity>of(RuincruiserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuincruiserEntityProjectile>> RUINCRUISER_PROJECTILE = register("projectile_ruincruiser",
			EntityType.Builder.<RuincruiserEntityProjectile>of(RuincruiserEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinserpentEntity>> RUINSERPENT = register("ruinserpent",
			EntityType.Builder.<RuinserpentEntity>of(RuinserpentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PerpetualmechanicalarrayEntity>> PERPETUALMECHANICALARRAY = register("perpetualmechanicalarray",
			EntityType.Builder.<PerpetualmechanicalarrayEntity>of(PerpetualmechanicalarrayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<PerpetualmechanicalarrayEntityProjectile>> PERPETUALMECHANICALARRAY_PROJECTILE = register("projectile_perpetualmechanicalarray",
			EntityType.Builder.<PerpetualmechanicalarrayEntityProjectile>of(PerpetualmechanicalarrayEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Perpetualmechanicalarrayphase2Entity>> PERPETUALMECHANICALARRAYPHASE_2 = register("perpetualmechanicalarrayphase_2",
			EntityType.Builder.<Perpetualmechanicalarrayphase2Entity>of(Perpetualmechanicalarrayphase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Perpetualmechanicalarrayphase3Entity>> PERPETUALMECHANICALARRAYPHASE_3 = register("perpetualmechanicalarrayphase_3",
			EntityType.Builder.<Perpetualmechanicalarrayphase3Entity>of(Perpetualmechanicalarrayphase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<Perpetualmechanicalarrayphase4Entity>> PERPETUALMECHANICALARRAYPHASE_4 = register("perpetualmechanicalarrayphase_4",
			EntityType.Builder.<Perpetualmechanicalarrayphase4Entity>of(Perpetualmechanicalarrayphase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(1.4f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinhunterEntity>> RUINHUNTER = register("ruinhunter",
			EntityType.Builder.<RuinhunterEntity>of(RuinhunterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 3.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinhunterEntityProjectile>> RUINHUNTER_PROJECTILE = register("projectile_ruinhunter",
			EntityType.Builder.<RuinhunterEntityProjectile>of(RuinhunterEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinhunterarmlessEntity>> RUINHUNTERARMLESS = register("ruinhunterarmless",
			EntityType.Builder.<RuinhunterarmlessEntity>of(RuinhunterarmlessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 3.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinhunterarmlessEntityProjectile>> RUINHUNTERARMLESS_PROJECTILE = register("projectile_ruinhunterarmless",
			EntityType.Builder.<RuinhunterarmlessEntityProjectile>of(RuinhunterarmlessEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinhunterarmEntity>> RUINHUNTERARM = register("ruinhunterarm",
			EntityType.Builder.<RuinhunterarmEntity>of(RuinhunterarmEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinguardEntity>> RUINGUARD = register("ruinguard",
			EntityType.Builder.<RuinguardEntity>of(RuinguardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(3f, 5.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuinguardinactiveEntity>> RUINGUARDINACTIVE = register("ruinguardinactive",
			EntityType.Builder.<RuinguardinactiveEntity>of(RuinguardinactiveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(3f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<RimebiterbathysmalvishaphatchlingEntity>> RIMEBITERBATHYSMALVISHAPHATCHLING = register("rimebiterbathysmalvishaphatchling",
			EntityType.Builder.<RimebiterbathysmalvishaphatchlingEntity>of(RimebiterbathysmalvishaphatchlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.5f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<TatarigamiEntity>> TATARIGAMI = register("tatarigami",
			EntityType.Builder.<TatarigamiEntity>of(TatarigamiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhitepigeonEntity>> WHITEPIGEON = register("whitepigeon",
			EntityType.Builder.<WhitepigeonEntity>of(WhitepigeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhitepigeonflyingEntity>> WHITEPIGEONFLYING = register("whitepigeonflying",
			EntityType.Builder.<WhitepigeonflyingEntity>of(WhitepigeonflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrightcrownpigeonEntity>> BRIGHTCROWNPIGEON = register("brightcrownpigeon",
			EntityType.Builder.<BrightcrownpigeonEntity>of(BrightcrownpigeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrightcrownpigeonflyingEntity>> BRIGHTCROWNPIGEONFLYING = register("brightcrownpigeonflying",
			EntityType.Builder.<BrightcrownpigeonflyingEntity>of(BrightcrownpigeonflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<IceshieldwallmitachurlEntity>> ICESHIELDWALLMITACHURL = register("iceshieldwallmitachurl",
			EntityType.Builder.<IceshieldwallmitachurlEntity>of(IceshieldwallmitachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectroregisvineEntity>> ELECTROREGISVINE = register("electroregisvine",
			EntityType.Builder.<ElectroregisvineEntity>of(ElectroregisvineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3.5f, 6.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElectroregisvinehiddenEntity>> ELECTROREGISVINEHIDDEN = register("electroregisvinehidden",
			EntityType.Builder.<ElectroregisvinehiddenEntity>of(ElectroregisvinehiddenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockshieldwallmitachurlEntity>> ROCKSHIELDWALLMITACHURL = register("rockshieldwallmitachurl",
			EntityType.Builder.<RockshieldwallmitachurlEntity>of(RockshieldwallmitachurlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<DendrospecterEntity>> DENDROSPECTER = register("dendrospecter",
			EntityType.Builder.<DendrospecterEntity>of(DendrospecterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DendrobulletEntity>> DENDROBULLET = register("dendrobullet",
			EntityType.Builder.<DendrobulletEntity>of(DendrobulletEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FloatingdendrofungusEntity>> FLOATINGDENDROFUNGUS = register("floatingdendrofungus",
			EntityType.Builder.<FloatingdendrofungusEntity>of(FloatingdendrofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiniseeliemossEntity>> MINISEELIEMOSS = register("miniseeliemoss",
			EntityType.Builder.<MiniseeliemossEntity>of(MiniseeliemossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<DendrocrystalflyEntity>> DENDROCRYSTALFLY = register("dendrocrystalfly",
			EntityType.Builder.<DendrocrystalflyEntity>of(DendrocrystalflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlackkingpigeonEntity>> BLACKKINGPIGEON = register("blackkingpigeon",
			EntityType.Builder.<BlackkingpigeonEntity>of(BlackkingpigeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlackkingpigeonflyingEntity>> BLACKKINGPIGEONFLYING = register("blackkingpigeonflying",
			EntityType.Builder.<BlackkingpigeonflyingEntity>of(BlackkingpigeonflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrimsonflankpigeonEntity>> CRIMSONFLANKPIGEON = register("crimsonflankpigeon",
			EntityType.Builder.<CrimsonflankpigeonEntity>of(CrimsonflankpigeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrimsonflankpigeonflyingEntity>> CRIMSONFLANKPIGEONFLYING = register("crimsonflankpigeonflying",
			EntityType.Builder.<CrimsonflankpigeonflyingEntity>of(CrimsonflankpigeonflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<GraywingpigeonEntity>> GRAYWINGPIGEON = register("graywingpigeon",
			EntityType.Builder.<GraywingpigeonEntity>of(GraywingpigeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<GraywingpigeonflyingEntity>> GRAYWINGPIGEONFLYING = register("graywingpigeonflying",
			EntityType.Builder.<GraywingpigeonflyingEntity>of(GraywingpigeonflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LapisgledeEntity>> LAPISGLEDE = register("lapisglede",
			EntityType.Builder.<LapisgledeEntity>of(LapisgledeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<LapisgledeflyingEntity>> LAPISGLEDEFLYING = register("lapisgledeflying",
			EntityType.Builder.<LapisgledeflyingEntity>of(LapisgledeflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrownwingfalconEntity>> BROWNWINGFALCON = register("brownwingfalcon",
			EntityType.Builder.<BrownwingfalconEntity>of(BrownwingfalconEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrownwingfalconflyingEntity>> BROWNWINGFALCONFLYING = register("brownwingfalconflying",
			EntityType.Builder.<BrownwingfalconflyingEntity>of(BrownwingfalconflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<UmbertailfalconEntity>> UMBERTAILFALCON = register("umbertailfalcon",
			EntityType.Builder.<UmbertailfalconEntity>of(UmbertailfalconEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<UmbertailfalconflyingEntity>> UMBERTAILFALCONFLYING = register("umbertailfalconflying",
			EntityType.Builder.<UmbertailfalconflyingEntity>of(UmbertailfalconflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<SilkwhitefalconEntity>> SILKWHITEFALCON = register("silkwhitefalcon",
			EntityType.Builder.<SilkwhitefalconEntity>of(SilkwhitefalconEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<SilkwhitefalconflyingEntity>> SILKWHITEFALCONFLYING = register("silkwhitefalconflying",
			EntityType.Builder.<SilkwhitefalconflyingEntity>of(SilkwhitefalconflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrimsonfinchEntity>> CRIMSONFINCH = register("crimsonfinch",
			EntityType.Builder.<CrimsonfinchEntity>of(CrimsonfinchEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrimsonfinchflyingEntity>> CRIMSONFINCHFLYING = register("crimsonfinchflying",
			EntityType.Builder.<CrimsonfinchflyingEntity>of(CrimsonfinchflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EmeraldfinchEntity>> EMERALDFINCH = register("emeraldfinch",
			EntityType.Builder.<EmeraldfinchEntity>of(EmeraldfinchEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EmeraldfinchflyingEntity>> EMERALDFINCHFLYING = register("emeraldfinchflying",
			EntityType.Builder.<EmeraldfinchflyingEntity>of(EmeraldfinchflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenfinchEntity>> GOLDENFINCH = register("goldenfinch",
			EntityType.Builder.<GoldenfinchEntity>of(GoldenfinchEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenfinchflyingEntity>> GOLDENFINCHFLYING = register("goldenfinchflying",
			EntityType.Builder.<GoldenfinchflyingEntity>of(GoldenfinchflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowfinchEntity>> SNOWFINCH = register("snowfinch",
			EntityType.Builder.<SnowfinchEntity>of(SnowfinchEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowfinchflyingEntity>> SNOWFINCHFLYING = register("snowfinchflying",
			EntityType.Builder.<SnowfinchflyingEntity>of(SnowfinchflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DivdarayspawningEntity>> DIVDARAYSPAWNING = register("divdarayspawning",
			EntityType.Builder.<DivdarayspawningEntity>of(DivdarayspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<FormalorayspawningEntity>> FORMALORAYSPAWNING = register("formalorayspawning",
			EntityType.Builder.<FormalorayspawningEntity>of(FormalorayspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MedakaEntity>> MEDAKA = register("medaka",
			EntityType.Builder.<MedakaEntity>of(MedakaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MedakaspawningEntity>> MEDAKASPAWNING = register("medakaspawning",
			EntityType.Builder.<MedakaspawningEntity>of(MedakaspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GlazemedakaEntity>> GLAZEMEDAKA = register("glazemedaka",
			EntityType.Builder.<GlazemedakaEntity>of(GlazemedakaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GlazemedakaspawningEntity>> GLAZEMEDAKASPAWNING = register("glazemedakaspawning",
			EntityType.Builder.<GlazemedakaspawningEntity>of(GlazemedakaspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SweetflowermedakaEntity>> SWEETFLOWERMEDAKA = register("sweetflowermedaka",
			EntityType.Builder.<SweetflowermedakaEntity>of(SweetflowermedakaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SweetflowermedakaspawningEntity>> SWEETFLOWERMEDAKASPAWNING = register("sweetflowermedakaspawning",
			EntityType.Builder.<SweetflowermedakaspawningEntity>of(SweetflowermedakaspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AizenmedakaEntity>> AIZENMEDAKA = register("aizenmedaka",
			EntityType.Builder.<AizenmedakaEntity>of(AizenmedakaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AizenmedakaspawningEntity>> AIZENMEDAKASPAWNING = register("aizenmedakaspawning",
			EntityType.Builder.<AizenmedakaspawningEntity>of(AizenmedakaspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DawncatcherEntity>> DAWNCATCHER = register("dawncatcher",
			EntityType.Builder.<DawncatcherEntity>of(DawncatcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DawncatcherspawningEntity>> DAWNCATCHERSPAWNING = register("dawncatcherspawning",
			EntityType.Builder.<DawncatcherspawningEntity>of(DawncatcherspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrystalfishEntity>> CRYSTALFISH = register("crystalfish",
			EntityType.Builder.<CrystalfishEntity>of(CrystalfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrystalfishspawningEntity>> CRYSTALFISHSPAWNING = register("crystalfishspawning",
			EntityType.Builder.<CrystalfishspawningEntity>of(CrystalfishspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimordialbathysmalvishapEntity>> PRIMORDIALBATHYSMALVISHAP = register("primordialbathysmalvishap",
			EntityType.Builder.<PrimordialbathysmalvishapEntity>of(PrimordialbathysmalvishapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.5f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<HydrodiscEntity>> HYDRODISC = register("hydrodisc",
			EntityType.Builder.<HydrodiscEntity>of(HydrodiscEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.3f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LungedsticklebackEntity>> LUNGEDSTICKLEBACK = register("lungedstickleback",
			EntityType.Builder.<LungedsticklebackEntity>of(LungedsticklebackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LungedsticklebackspawningEntity>> LUNGEDSTICKLEBACKSPAWNING = register("lungedsticklebackspawning",
			EntityType.Builder.<LungedsticklebackspawningEntity>of(LungedsticklebackspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BettaEntity>> BETTA = register("betta",
			EntityType.Builder.<BettaEntity>of(BettaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BettaspawningEntity>> BETTASPAWNING = register("bettaspawning",
			EntityType.Builder.<BettaspawningEntity>of(BettaspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<VenomspinefishEntity>> VENOMSPINEFISH = register("venomspinefish",
			EntityType.Builder.<VenomspinefishEntity>of(VenomspinefishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<VenomspinefishspawningEntity>> VENOMSPINEFISHSPAWNING = register("venomspinefishspawning",
			EntityType.Builder.<VenomspinefishspawningEntity>of(VenomspinefishspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AkaimaouEntity>> AKAIMAOU = register("akaimaou",
			EntityType.Builder.<AkaimaouEntity>of(AkaimaouEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AkaimaouspawningEntity>> AKAIMAOUSPAWNING = register("akaimaouspawning",
			EntityType.Builder.<AkaimaouspawningEntity>of(AkaimaouspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowstriderEntity>> SNOWSTRIDER = register("snowstrider",
			EntityType.Builder.<SnowstriderEntity>of(SnowstriderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowstriderspawningEntity>> SNOWSTRIDERSPAWNING = register("snowstriderspawning",
			EntityType.Builder.<SnowstriderspawningEntity>of(SnowstriderspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenkoiEntity>> GOLDENKOI = register("goldenkoi",
			EntityType.Builder.<GoldenkoiEntity>of(GoldenkoiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenkoispawningEntity>> GOLDENKOISPAWNING = register("goldenkoispawning",
			EntityType.Builder.<GoldenkoispawningEntity>of(GoldenkoispawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<RustykoiEntity>> RUSTYKOI = register("rustykoi",
			EntityType.Builder.<RustykoiEntity>of(RustykoiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<RustykoispawningEntity>> RUSTYKOISPAWNING = register("rustykoispawning",
			EntityType.Builder.<RustykoispawningEntity>of(RustykoispawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrownshirakodaiEntity>> BROWNSHIRAKODAI = register("brownshirakodai",
			EntityType.Builder.<BrownshirakodaiEntity>of(BrownshirakodaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrownshirakodaispawningEntity>> BROWNSHIRAKODAISPAWNING = register("brownshirakodaispawning",
			EntityType.Builder.<BrownshirakodaispawningEntity>of(BrownshirakodaispawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PurpleshirakodaiEntity>> PURPLESHIRAKODAI = register("purpleshirakodai",
			EntityType.Builder.<PurpleshirakodaiEntity>of(PurpleshirakodaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PurpleshirakodaispawningEntity>> PURPLESHIRAKODAISPAWNING = register("purpleshirakodaispawning",
			EntityType.Builder.<PurpleshirakodaispawningEntity>of(PurpleshirakodaispawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TeacoloredshirakodaiEntity>> TEACOLOREDSHIRAKODAI = register("teacoloredshirakodai",
			EntityType.Builder.<TeacoloredshirakodaiEntity>of(TeacoloredshirakodaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TeacoloredshirakodaispawningEntity>> TEACOLOREDSHIRAKODAISPAWNING = register("teacoloredshirakodaispawning",
			EntityType.Builder.<TeacoloredshirakodaispawningEntity>of(TeacoloredshirakodaispawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AbidingangelfishEntity>> ABIDINGANGELFISH = register("abidingangelfish",
			EntityType.Builder.<AbidingangelfishEntity>of(AbidingangelfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<AbidingangelfishspawningEntity>> ABIDINGANGELFISHSPAWNING = register("abidingangelfishspawning",
			EntityType.Builder.<AbidingangelfishspawningEntity>of(AbidingangelfishspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RaimeiangelfishEntity>> RAIMEIANGELFISH = register("raimeiangelfish",
			EntityType.Builder.<RaimeiangelfishEntity>of(RaimeiangelfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RaimeiangelfishspawningEntity>> RAIMEIANGELFISHSPAWNING = register("raimeiangelfishspawning",
			EntityType.Builder.<RaimeiangelfishspawningEntity>of(RaimeiangelfishspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MoonfinEntity>> MOONFIN = register("moonfin",
			EntityType.Builder.<MoonfinEntity>of(MoonfinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MoonfinspawningEntity>> MOONFINSPAWNING = register("moonfinspawning",
			EntityType.Builder.<MoonfinspawningEntity>of(MoonfinspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuingraderEntity>> RUINGRADER = register("ruingrader",
			EntityType.Builder.<RuingraderEntity>of(RuingraderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(3f, 5.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrozensoulwitheredEntity>> FROZENSOULWITHERED = register("frozensoulwithered",
			EntityType.Builder.<FrozensoulwitheredEntity>of(FrozensoulwitheredEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FrozensoulEntity>> FROZENSOUL = register("frozensoul",
			EntityType.Builder.<FrozensoulEntity>of(FrozensoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FatuipyroagentEntity>> FATUIPYROAGENT = register("fatuipyroagent",
			EntityType.Builder.<FatuipyroagentEntity>of(FatuipyroagentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnemobulletEntity>> ANEMOBULLET = register("anemobullet",
			EntityType.Builder.<AnemobulletEntity>of(AnemobulletEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<StretchyanemofungusEntity>> STRETCHYANEMOFUNGUS = register("stretchyanemofungus",
			EntityType.Builder.<StretchyanemofungusEntity>of(StretchyanemofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhirlingelectrofungusEntity>> WHIRLINGELECTROFUNGUS = register("whirlingelectrofungus",
			EntityType.Builder.<WhirlingelectrofungusEntity>of(WhirlingelectrofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WitheringtumorEntity>> WITHERINGTUMOR = register("witheringtumor",
			EntityType.Builder.<WitheringtumorEntity>of(WitheringtumorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DefensemechanismEntity>> DEFENSEMECHANISM = register("defensemechanism",
			EntityType.Builder.<DefensemechanismEntity>of(DefensemechanismEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<DefensemechanismEntityProjectile>> DEFENSEMECHANISM_PROJECTILE = register("projectile_defensemechanism",
			EntityType.Builder.<DefensemechanismEntityProjectile>of(DefensemechanismEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShaggysumpterbeastbabyEntity>> SHAGGYSUMPTERBEASTBABY = register("shaggysumpterbeastbaby",
			EntityType.Builder.<ShaggysumpterbeastbabyEntity>of(ShaggysumpterbeastbabyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.3f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShaggysumpterbeastadultEntity>> SHAGGYSUMPTERBEASTADULT = register("shaggysumpterbeastadult",
			EntityType.Builder.<ShaggysumpterbeastadultEntity>of(ShaggysumpterbeastadultEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.3f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShaggysumpterbeastspawningEntity>> SHAGGYSUMPTERBEASTSPAWNING = register("shaggysumpterbeastspawning",
			EntityType.Builder.<ShaggysumpterbeastspawningEntity>of(ShaggysumpterbeastspawningEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpinocrocodileEntity>> SPINOCROCODILE = register("spinocrocodile",
			EntityType.Builder.<SpinocrocodileEntity>of(SpinocrocodileEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShroomboarEntity>> SHROOMBOAR = register("shroomboar",
			EntityType.Builder.<ShroomboarEntity>of(ShroomboarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RishbolandtigerEntity>> RISHBOLANDTIGER = register("rishbolandtiger",
			EntityType.Builder.<RishbolandtigerEntity>of(RishbolandtigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.2f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<StretchygeofungusEntity>> STRETCHYGEOFUNGUS = register("stretchygeofungus",
			EntityType.Builder.<StretchygeofungusEntity>of(StretchygeofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<StretchypyrofungusEntity>> STRETCHYPYROFUNGUS = register("stretchypyrofungus",
			EntityType.Builder.<StretchypyrofungusEntity>of(StretchypyrofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuindrakeskywatchEntity>> RUINDRAKESKYWATCH = register("ruindrakeskywatch",
			EntityType.Builder.<RuindrakeskywatchEntity>of(RuindrakeskywatchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.5f, 4.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RuindrakeearthwatchEntity>> RUINDRAKEEARTHWATCH = register("ruindrakeearthwatch",
			EntityType.Builder.<RuindrakeearthwatchEntity>of(RuindrakeearthwatchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.5f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DuskbirdEntity>> DUSKBIRD = register("duskbird",
			EntityType.Builder.<DuskbirdEntity>of(DuskbirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<DuskbirdflyingEntity>> DUSKBIRDFLYING = register("duskbirdflying",
			EntityType.Builder.<DuskbirdflyingEntity>of(DuskbirdflyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhirlingcryofungusEntity>> WHIRLINGCRYOFUNGUS = register("whirlingcryofungus",
			EntityType.Builder.<WhirlingcryofungusEntity>of(WhirlingcryofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EremiteEntity>> EREMITE = register("eremite",
			EntityType.Builder.<EremiteEntity>of(EremiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SunsetcloudanglerEntity>> SUNSETCLOUDANGLER = register("sunsetcloudangler",
			EntityType.Builder.<SunsetcloudanglerEntity>of(SunsetcloudanglerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<SunsetcloudanglerspawningEntity>> SUNSETCLOUDANGLERSPAWNING = register("sunsetcloudanglerspawning",
			EntityType.Builder.<SunsetcloudanglerspawningEntity>of(SunsetcloudanglerspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<TruefruitanglerEntity>> TRUEFRUITANGLER = register("truefruitangler",
			EntityType.Builder.<TruefruitanglerEntity>of(TruefruitanglerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<TruefruitanglerspawningEntity>> TRUEFRUITANGLERSPAWNING = register("truefruitanglerspawning",
			EntityType.Builder.<TruefruitanglerspawningEntity>of(TruefruitanglerspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<SandstormanglerEntity>> SANDSTORMANGLER = register("sandstormangler",
			EntityType.Builder.<SandstormanglerEntity>of(SandstormanglerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<SandstormanglerspawningEntity>> SANDSTORMANGLERSPAWNING = register("sandstormanglerspawning",
			EntityType.Builder.<SandstormanglerspawningEntity>of(SandstormanglerspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeachofthedeepwavesEntity>> PEACHOFTHEDEEPWAVES = register("peachofthedeepwaves",
			EntityType.Builder.<PeachofthedeepwavesEntity>of(PeachofthedeepwavesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeachofthedeepwavesspawningEntity>> PEACHOFTHEDEEPWAVESSPAWNING = register("peachofthedeepwavesspawning",
			EntityType.Builder.<PeachofthedeepwavesspawningEntity>of(PeachofthedeepwavesspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<GroundedhydroshroomEntity>> GROUNDEDHYDROSHROOM = register("groundedhydroshroom",
			EntityType.Builder.<GroundedhydroshroomEntity>of(GroundedhydroshroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WingeddendroshroomEntity>> WINGEDDENDROSHROOM = register("wingeddendroshroom",
			EntityType.Builder.<WingeddendroshroomEntity>of(WingeddendroshroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HalcyonjadeaxemarlinEntity>> HALCYONJADEAXEMARLIN = register("halcyonjadeaxemarlin",
			EntityType.Builder.<HalcyonjadeaxemarlinEntity>of(HalcyonjadeaxemarlinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<HalcyonjadeaxemarlinspawningEntity>> HALCYONJADEAXEMARLINSPAWNING = register("halcyonjadeaxemarlinspawning",
			EntityType.Builder.<HalcyonjadeaxemarlinspawningEntity>of(HalcyonjadeaxemarlinspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LazuriteaxemarlinEntity>> LAZURITEAXEMARLIN = register("lazuriteaxemarlin",
			EntityType.Builder.<LazuriteaxemarlinEntity>of(LazuriteaxemarlinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<LazuriteaxemarlinspawningEntity>> LAZURITEAXEMARLINSPAWNING = register("lazuriteaxemarlinspawning",
			EntityType.Builder.<LazuriteaxemarlinspawningEntity>of(LazuriteaxemarlinspawningEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<WingedcryoshroomEntity>> WINGEDCRYOSHROOM = register("wingedcryoshroom",
			EntityType.Builder.<WingedcryoshroomEntity>of(WingedcryoshroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedtailedlizardEntity>> REDTAILEDLIZARD = register("redtailedlizard",
			EntityType.Builder.<RedtailedlizardEntity>of(RedtailedlizardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<OnikabutoridingEntity>> ONIKABUTORIDING = register("onikabutoriding",
			EntityType.Builder.<OnikabutoridingEntity>of(OnikabutoridingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<OsialEntity>> OSIAL = register("osial",
			EntityType.Builder.<OsialEntity>of(OsialEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(5f, 8.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuicksandunagiEntity>> QUICKSANDUNAGI = register("quicksandunagi",
			EntityType.Builder.<QuicksandunagiEntity>of(QuicksandunagiEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AramaEntity>> ARAMA = register("arama",
			EntityType.Builder.<AramaEntity>of(AramaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc1Entity>> QUESTNPC_1 = register("questnpc_1",
			EntityType.Builder.<Questnpc1Entity>of(Questnpc1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc2Entity>> QUESTNPC_2 = register("questnpc_2",
			EntityType.Builder.<Questnpc2Entity>of(Questnpc2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MaranasavatarEntity>> MARANASAVATAR = register("maranasavatar",
			EntityType.Builder.<MaranasavatarEntity>of(MaranasavatarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc3Entity>> QUESTNPC_3 = register("questnpc_3",
			EntityType.Builder.<Questnpc3Entity>of(Questnpc3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc4Entity>> QUESTNPC_4 = register("questnpc_4",
			EntityType.Builder.<Questnpc4Entity>of(Questnpc4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc5Entity>> QUESTNPC_5 = register("questnpc_5",
			EntityType.Builder.<Questnpc5Entity>of(Questnpc5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc6Entity>> QUESTNPC_6 = register("questnpc_6",
			EntityType.Builder.<Questnpc6Entity>of(Questnpc6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc7Entity>> QUESTNPC_7 = register("questnpc_7",
			EntityType.Builder.<Questnpc7Entity>of(Questnpc7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc8Entity>> QUESTNPC_8 = register("questnpc_8",
			EntityType.Builder.<Questnpc8Entity>of(Questnpc8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuestnpcsspawnerEntity>> QUESTNPCSSPAWNER = register("questnpcsspawner",
			EntityType.Builder.<QuestnpcsspawnerEntity>of(QuestnpcsspawnerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc9Entity>> QUESTNPC_9 = register("questnpc_9",
			EntityType.Builder.<Questnpc9Entity>of(Questnpc9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc10Entity>> QUESTNPC_10 = register("questnpc_10",
			EntityType.Builder.<Questnpc10Entity>of(Questnpc10Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc11Entity>> QUESTNPC_11 = register("questnpc_11",
			EntityType.Builder.<Questnpc11Entity>of(Questnpc11Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc12Entity>> QUESTNPC_12 = register("questnpc_12",
			EntityType.Builder.<Questnpc12Entity>of(Questnpc12Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc13Entity>> QUESTNPC_13 = register("questnpc_13",
			EntityType.Builder.<Questnpc13Entity>of(Questnpc13Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc14Entity>> QUESTNPC_14 = register("questnpc_14",
			EntityType.Builder.<Questnpc14Entity>of(Questnpc14Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc15Entity>> QUESTNPC_15 = register("questnpc_15",
			EntityType.Builder.<Questnpc15Entity>of(Questnpc15Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc16Entity>> QUESTNPC_16 = register("questnpc_16",
			EntityType.Builder.<Questnpc16Entity>of(Questnpc16Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc17Entity>> QUESTNPC_17 = register("questnpc_17",
			EntityType.Builder.<Questnpc17Entity>of(Questnpc17Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FatuiskirmishergeochanterbracerEntity>> FATUISKIRMISHERGEOCHANTERBRACER = register("fatuiskirmishergeochanterbracer",
			EntityType.Builder.<FatuiskirmishergeochanterbracerEntity>of(FatuiskirmishergeochanterbracerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FatuiskirmishergeochanterbracerEntityProjectile>> FATUISKIRMISHERGEOCHANTERBRACER_PROJECTILE = register("projectile_fatuiskirmishergeochanterbracer", EntityType.Builder
			.<FatuiskirmishergeochanterbracerEntityProjectile>of(FatuiskirmishergeochanterbracerEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScarabEntity>> SCARAB = register("scarab",
			EntityType.Builder.<ScarabEntity>of(ScarabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScarabballEntity>> SCARABBALL = register("scarabball",
			EntityType.Builder.<ScarabballEntity>of(ScarabballEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimalconstructprospectorEntity>> PRIMALCONSTRUCTPROSPECTOR = register("primalconstructprospector",
			EntityType.Builder.<PrimalconstructprospectorEntity>of(PrimalconstructprospectorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimalconstructrepulsorEntity>> PRIMALCONSTRUCTREPULSOR = register("primalconstructrepulsor",
			EntityType.Builder.<PrimalconstructrepulsorEntity>of(PrimalconstructrepulsorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrimalconstructreshaperEntity>> PRIMALCONSTRUCTRESHAPER = register("primalconstructreshaper",
			EntityType.Builder.<PrimalconstructreshaperEntity>of(PrimalconstructreshaperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlgorithmofsemiintransientmatrixofoverseernetworkEntity>> ALGORITHMOFSEMIINTRANSIENTMATRIXOFOVERSEERNETWORK = register("algorithmofsemiintransientmatrixofoverseernetwork",
			EntityType.Builder.<AlgorithmofsemiintransientmatrixofoverseernetworkEntity>of(AlgorithmofsemiintransientmatrixofoverseernetworkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3)

					.sized(2.9f, 4.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FloatinganemofungusEntity>> FLOATINGANEMOFUNGUS = register("floatinganemofungus",
			EntityType.Builder.<FloatinganemofungusEntity>of(FloatinganemofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WhirlingpyrofungusEntity>> WHIRLINGPYROFUNGUS = register("whirlingpyrofungus",
			EntityType.Builder.<WhirlingpyrofungusEntity>of(WhirlingpyrofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.7f, 1.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WeaponprospectorEntity>> WEAPONPROSPECTOR = register("weaponprospector",
			EntityType.Builder.<WeaponprospectorEntity>of(WeaponprospectorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<WeaponrepulsorEntity>> WEAPONREPULSOR = register("weaponrepulsor",
			EntityType.Builder.<WeaponrepulsorEntity>of(WeaponrepulsorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<WeaponreshaperEntity>> WEAPONRESHAPER = register("weaponreshaper",
			EntityType.Builder.<WeaponreshaperEntity>of(WeaponreshaperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<ChildeEntity>> CHILDE = register("childe",
			EntityType.Builder.<ChildeEntity>of(ChildeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Childephase2Entity>> CHILDEPHASE_2 = register("childephase_2",
			EntityType.Builder.<Childephase2Entity>of(Childephase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StretchyelectrofungusEntity>> STRETCHYELECTROFUNGUS = register("stretchyelectrofungus",
			EntityType.Builder.<StretchyelectrofungusEntity>of(StretchyelectrofungusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<GroundedgeoshroomEntity>> GROUNDEDGEOSHROOM = register("groundedgeoshroom",
			EntityType.Builder.<GroundedgeoshroomEntity>of(GroundedgeoshroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScorpionEntity>> SCORPION = register("scorpion",
			EntityType.Builder.<ScorpionEntity>of(ScorpionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DesertsumpterbeastbabyEntity>> DESERTSUMPTERBEASTBABY = register("desertsumpterbeastbaby",
			EntityType.Builder.<DesertsumpterbeastbabyEntity>of(DesertsumpterbeastbabyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.3f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<DesertsumpterbeastadultEntity>> DESERTSUMPTERBEASTADULT = register("desertsumpterbeastadult",
			EntityType.Builder.<DesertsumpterbeastadultEntity>of(DesertsumpterbeastadultEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.3f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<DesertsumpterbeastspawningEntity>> DESERTSUMPTERBEASTSPAWNING = register("desertsumpterbeastspawning",
			EntityType.Builder.<DesertsumpterbeastspawningEntity>of(DesertsumpterbeastspawningEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SacredibisEntity>> SACREDIBIS = register("sacredibis",
			EntityType.Builder.<SacredibisEntity>of(SacredibisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc18Entity>> QUESTNPC_18 = register("questnpc_18",
			EntityType.Builder.<Questnpc18Entity>of(Questnpc18Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc19Entity>> QUESTNPC_19 = register("questnpc_19",
			EntityType.Builder.<Questnpc19Entity>of(Questnpc19Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GeovishapEntity>> GEOVISHAP = register("geovishap",
			EntityType.Builder.<GeovishapEntity>of(GeovishapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShikikoshouEntity>> SHIKIKOSHOU = register("shikikoshou",
			EntityType.Builder.<ShikikoshouEntity>of(ShikikoshouEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<Questnpc20Entity>> QUESTNPC_20 = register("questnpc_20",
			EntityType.Builder.<Questnpc20Entity>of(Questnpc20Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HuntersbowProjectileEntity>> HUNTERSBOW_PROJECTILE = register("huntersbow_projectile",
			EntityType.Builder.<HuntersbowProjectileEntity>of(HuntersbowProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HuntersbowascendedProjectileEntity>> HUNTERSBOWASCENDED_PROJECTILE = register("huntersbowascended_projectile",
			EntityType.Builder.<HuntersbowascendedProjectileEntity>of(HuntersbowascendedProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkywardatlasProjectileEntity>> SKYWARDATLAS_PROJECTILE = register("skywardatlas_projectile",
			EntityType.Builder.<SkywardatlasProjectileEntity>of(SkywardatlasProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkywardatlasascendedProjectileEntity>> SKYWARDATLASASCENDED_PROJECTILE = register("skywardatlasascended_projectile",
			EntityType.Builder.<SkywardatlasascendedProjectileEntity>of(SkywardatlasascendedProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkywardharpProjectileEntity>> SKYWARDHARP_PROJECTILE = register("skywardharp_projectile",
			EntityType.Builder.<SkywardharpProjectileEntity>of(SkywardharpProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkywardharpascendedProjectileEntity>> SKYWARDHARPASCENDED_PROJECTILE = register("skywardharpascended_projectile",
			EntityType.Builder.<SkywardharpascendedProjectileEntity>of(SkywardharpascendedProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApprenticesnotesProjectileEntity>> APPRENTICESNOTES_PROJECTILE = register("apprenticesnotes_projectile",
			EntityType.Builder.<ApprenticesnotesProjectileEntity>of(ApprenticesnotesProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ApprenticesnotesascendedProjectileEntity>> APPRENTICESNOTESASCENDED_PROJECTILE = register("apprenticesnotesascended_projectile",
			EntityType.Builder.<ApprenticesnotesascendedProjectileEntity>of(ApprenticesnotesascendedProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PocketgrimoireProjectileEntity>> POCKETGRIMOIRE_PROJECTILE = register("pocketgrimoire_projectile",
			EntityType.Builder.<PocketgrimoireProjectileEntity>of(PocketgrimoireProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PocketgrimoireascendedProjectileEntity>> POCKETGRIMOIREASCENDED_PROJECTILE = register("pocketgrimoireascended_projectile",
			EntityType.Builder.<PocketgrimoireascendedProjectileEntity>of(PocketgrimoireascendedProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, ARAMA.get(), (living, context) -> living.getCombinedInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		AnemoslimeEntity.init(event);
		CryoslimeEntity.init(event);
		DendroslimeEntity.init(event);
		HiddendendroslimeEntity.init(event);
		ElectroslimeEntity.init(event);
		GeoslimeEntity.init(event);
		HydroslimeEntity.init(event);
		PyroslimeEntity.init(event);
		UnlitpyroslimeEntity.init(event);
		LargeanemoslimeEntity.init(event);
		LargecryoslimeEntity.init(event);
		LargecryoslimenohelmetEntity.init(event);
		HiddenlargedendroslimeEntity.init(event);
		LargedendroslimeEntity.init(event);
		LargeelectroslimeEntity.init(event);
		MutantelectroslimeEntity.init(event);
		LargegeoslimeEntity.init(event);
		LargegeoslimenohelmetEntity.init(event);
		LargehydroslimeEntity.init(event);
		LargepyroslimeEntity.init(event);
		UnlitlargepyroslimeEntity.init(event);
		WhirlwindEntity.init(event);
		CryowhopperflowerEntity.init(event);
		PyrowhopperflowerEntity.init(event);
		ElectrowhopperflowerEntity.init(event);
		ElectricballEntity.init(event);
		AnemospecterEntity.init(event);
		GeospecterEntity.init(event);
		HydrospecterEntity.init(event);
		CryocicinEntity.init(event);
		ElectrocicinEntity.init(event);
		HydrocicinEntity.init(event);
		FatuicryocicinmageEntity.init(event);
		FatuielectrocicinmageEntity.init(event);
		HilichurlEntity.init(event);
		HilichurlfighterEntity.init(event);
		HilichurlshooterEntity.init(event);
		UnusualhilichurlEntity.init(event);
		HilichurlcryogrenadierEntity.init(event);
		HilichurlcryoshooterEntity.init(event);
		IceshieldhilichurlguardEntity.init(event);
		WoodenshieldhilichurlguardEntity.init(event);
		HilichurlelectrogrenadierEntity.init(event);
		HilichurlelectroshooterEntity.init(event);
		RockshieldhilichurlguardEntity.init(event);
		HilichurlberserkerEntity.init(event);
		HilichurlpyrogrenadierEntity.init(event);
		HilichurlpyroshooterEntity.init(event);
		AnemosamachurlEntity.init(event);
		CryosamachurlEntity.init(event);
		DendrosamachurlEntity.init(event);
		ElectrosamachurlEntity.init(event);
		GeosamachurlEntity.init(event);
		HydrosamachurlEntity.init(event);
		AbyssmagecryoEntity.init(event);
		CryoabyssmageEntity.init(event);
		AbyssmageelectroEntity.init(event);
		ElectroabyssmageEntity.init(event);
		AbyssmagehydroEntity.init(event);
		HydroabyssmageEntity.init(event);
		AbyssmagepyroEntity.init(event);
		PyroabyssmageEntity.init(event);
		LivingbubbleEntity.init(event);
		WispEntity.init(event);
		MysteriousseelieEntity.init(event);
		WarmseelieEntity.init(event);
		ElectroseelieEntity.init(event);
		FireflyEntity.init(event);
		ScarletbeakduckEntity.init(event);
		EmeraldduckEntity.init(event);
		AzurecraneEntity.init(event);
		VioletibisEntity.init(event);
		CrowEntity.init(event);
		CryoregisvineEntity.init(event);
		PyroregisvineEntity.init(event);
		SquirrelEntity.init(event);
		BoarEntity.init(event);
		SnowboarEntity.init(event);
		SnowweaselEntity.init(event);
		RedtailedweaselEntity.init(event);
		BootweaselEntity.init(event);
		BluebutterflyEntity.init(event);
		LightbluebutterflyEntity.init(event);
		PinkbutterflyEntity.init(event);
		YellowbutterflyEntity.init(event);
		AnemocrystalflyEntity.init(event);
		CryocrystalflyEntity.init(event);
		ElectrocrystalflyEntity.init(event);
		GeocrystalflyEntity.init(event);
		GoldencrabEntity.init(event);
		SuncrabEntity.init(event);
		OceancrabEntity.init(event);
		GeneralcrabEntity.init(event);
		PaleredcrabEntity.init(event);
		BluehornedlizardEntity.init(event);
		GreenhornedlizardEntity.init(event);
		RedhornedlizardEntity.init(event);
		PithlizardEntity.init(event);
		AdornedunagiEntity.init(event);
		RedfinnedunagiEntity.init(event);
		DeepseaunagiEntity.init(event);
		PyrospecterEntity.init(event);
		CryospecterEntity.init(event);
		ElectrospecterEntity.init(event);
		DivdarayEntity.init(event);
		FormalorayEntity.init(event);
		FloatingrayEntity.init(event);
		EyeofthestormEntity.init(event);
		Eyeofstormphase2Entity.init(event);
		ThundermanifestationEntity.init(event);
		ElectricwallEntity.init(event);
		ElectrictntEntity.init(event);
		FellflowerEntity.init(event);
		HatefuloceanidEntity.init(event);
		WaterminionboarEntity.init(event);
		WaterminionferretEntity.init(event);
		WaterminioncrabEntity.init(event);
		MiniseeliecurcumaEntity.init(event);
		MiniseeliedayflowerEntity.init(event);
		MiniseelieroseEntity.init(event);
		MiniseelieviolaEntity.init(event);
		AzhdahaEntity.init(event);
		MysteriousseeliesoulsandEntity.init(event);
		WarmseelieicespikesEntity.init(event);
		OnikabutoEntity.init(event);
		AmateurweaselthiefEntity.init(event);
		AmateurweaselthiefscaredEntity.init(event);
		HoarderweaselthiefEntity.init(event);
		HoarderweaselthiefscaredEntity.init(event);
		GoldenweaselthiefEntity.init(event);
		GoldenweaselthiefscaredEntity.init(event);
		GeohypostasisEntity.init(event);
		Geohypostasisphase2Entity.init(event);
		Geohypostasisphase3Entity.init(event);
		ShootingminionEntity.init(event);
		Geohypostasisphase4Entity.init(event);
		Geohypostasisphase5Entity.init(event);
		Geohypostasisphase6Entity.init(event);
		Geohypostasisphase7Entity.init(event);
		Geohypostasisphase8Entity.init(event);
		ThundercravenrifthoundwhelpEntity.init(event);
		RockfondrifthoundwhelpEntity.init(event);
		RockfondrifthoundEntity.init(event);
		ThundercravenrifthoundEntity.init(event);
		TreasurehoarderEntity.init(event);
		StonehidelawachurlEntity.init(event);
		AnemohypostasisEntity.init(event);
		Anemohypostasisphase2Entity.init(event);
		Anemohypostasisphase3Entity.init(event);
		Anemohypostasisphase4Entity.init(event);
		Anemohypostasisphase5Entity.init(event);
		Anemohypostasisphase6Entity.init(event);
		Anemohypostasisphase7Entity.init(event);
		Anemohypostasisphase8Entity.init(event);
		GoldenwolflordEntity.init(event);
		GoldenattackerEntity.init(event);
		GoldenwolflordbossEntity.init(event);
		GoldenminionEntity.init(event);
		AttackingminionEntity.init(event);
		CoralbutterflyEntity.init(event);
		PyrohypostasisEntity.init(event);
		FloatinglargeanemoslimeEntity.init(event);
		ShadowyhuskstandardbearerEntity.init(event);
		ShadowyhusklinebreakerEntity.init(event);
		ShadowyhuskdefenderEntity.init(event);
		Pyrohypostasisphase2Entity.init(event);
		Pyrohypostasisphase3Entity.init(event);
		Pyrohypostasisphase4Entity.init(event);
		Pyrohypostasisphase5Entity.init(event);
		Pyrohypostasisphase6Entity.init(event);
		Pyrohypostasisphase7Entity.init(event);
		Pyrohypostasisphase8Entity.init(event);
		ElectrohypostasisEntity.init(event);
		FloatinghydrofungiEntity.init(event);
		Electrohypostasisphase2Entity.init(event);
		BluethunderweaselEntity.init(event);
		Electrohypostasisphase3Entity.init(event);
		Electrohypostasisphase4Entity.init(event);
		Electrohypostasisphase5Entity.init(event);
		Electrohypostasisphase6Entity.init(event);
		Electrohypostasisphase7Entity.init(event);
		Electrohypostasisphase8Entity.init(event);
		FriendlyelectrocicinEntity.init(event);
		FrostarmlawachurlEntity.init(event);
		LucklightflyEntity.init(event);
		LucklightflyspawningEntity.init(event);
		LuminousseelieEntity.init(event);
		LuminousseeliespawningEntity.init(event);
		MitachurlblazingaxeEntity.init(event);
		MitachurlcracklingaxeEntity.init(event);
		KairagifierymightEntity.init(event);
		KairagidancingthunderEntity.init(event);
		MiasmictumorEntity.init(event);
		OchimusacankeredflameEntity.init(event);
		OchimusaensorcelledthunderEntity.init(event);
		MirrormaidenEntity.init(event);
		FloattybubbleEntity.init(event);
		ThunderhelmlawachurlEntity.init(event);
		CryohypostasisEntity.init(event);
		Cryohypostasisphase2Entity.init(event);
		GreatsnowboarkingEntity.init(event);
		WoodenshieldwallmitachurlEntity.init(event);
		MitachurlEntity.init(event);
		EndoraEntity.init(event);
		MagatsumitakenarukaminomikotoEntity.init(event);
		BaalcloneEntity.init(event);
		MagatsumitakenarukaminomikotopuppetEntity.init(event);
		MagatsumitakenarukaminomikotofinalEntity.init(event);
		ElectricshooterEntity.init(event);
		Cryohypostasisphase3Entity.init(event);
		Cryohypostasisphase4Entity.init(event);
		Cryohypostasisphase5Entity.init(event);
		Cryohypostasisphase6Entity.init(event);
		RuinscoutEntity.init(event);
		GlacialmineEntity.init(event);
		Cryohypostasisphase7Entity.init(event);
		Cryohypostasisphase8Entity.init(event);
		HydrohypostasisEntity.init(event);
		GeovishaphatchlingEntity.init(event);
		Hydrohypostasisphase2Entity.init(event);
		Hydrohypostasisphase3Entity.init(event);
		Hydrohypostasisphase4Entity.init(event);
		Hydrohypostasisphase5Entity.init(event);
		Hydrohypostasisphase6Entity.init(event);
		Hydrohypostasisphase7Entity.init(event);
		Hydrohypostasisphase8Entity.init(event);
		RuindefenderEntity.init(event);
		RuindestroyerEntity.init(event);
		RuincruiserEntity.init(event);
		RuinserpentEntity.init(event);
		PerpetualmechanicalarrayEntity.init(event);
		Perpetualmechanicalarrayphase2Entity.init(event);
		Perpetualmechanicalarrayphase3Entity.init(event);
		Perpetualmechanicalarrayphase4Entity.init(event);
		RuinhunterEntity.init(event);
		RuinhunterarmlessEntity.init(event);
		RuinhunterarmEntity.init(event);
		RuinguardEntity.init(event);
		RuinguardinactiveEntity.init(event);
		RimebiterbathysmalvishaphatchlingEntity.init(event);
		TatarigamiEntity.init(event);
		WhitepigeonEntity.init(event);
		WhitepigeonflyingEntity.init(event);
		BrightcrownpigeonEntity.init(event);
		BrightcrownpigeonflyingEntity.init(event);
		IceshieldwallmitachurlEntity.init(event);
		ElectroregisvineEntity.init(event);
		ElectroregisvinehiddenEntity.init(event);
		RockshieldwallmitachurlEntity.init(event);
		DendrospecterEntity.init(event);
		DendrobulletEntity.init(event);
		FloatingdendrofungusEntity.init(event);
		MiniseeliemossEntity.init(event);
		DendrocrystalflyEntity.init(event);
		BlackkingpigeonEntity.init(event);
		BlackkingpigeonflyingEntity.init(event);
		CrimsonflankpigeonEntity.init(event);
		CrimsonflankpigeonflyingEntity.init(event);
		GraywingpigeonEntity.init(event);
		GraywingpigeonflyingEntity.init(event);
		LapisgledeEntity.init(event);
		LapisgledeflyingEntity.init(event);
		BrownwingfalconEntity.init(event);
		BrownwingfalconflyingEntity.init(event);
		UmbertailfalconEntity.init(event);
		UmbertailfalconflyingEntity.init(event);
		SilkwhitefalconEntity.init(event);
		SilkwhitefalconflyingEntity.init(event);
		CrimsonfinchEntity.init(event);
		CrimsonfinchflyingEntity.init(event);
		EmeraldfinchEntity.init(event);
		EmeraldfinchflyingEntity.init(event);
		GoldenfinchEntity.init(event);
		GoldenfinchflyingEntity.init(event);
		SnowfinchEntity.init(event);
		SnowfinchflyingEntity.init(event);
		DivdarayspawningEntity.init(event);
		FormalorayspawningEntity.init(event);
		MedakaEntity.init(event);
		MedakaspawningEntity.init(event);
		GlazemedakaEntity.init(event);
		GlazemedakaspawningEntity.init(event);
		SweetflowermedakaEntity.init(event);
		SweetflowermedakaspawningEntity.init(event);
		AizenmedakaEntity.init(event);
		AizenmedakaspawningEntity.init(event);
		DawncatcherEntity.init(event);
		DawncatcherspawningEntity.init(event);
		CrystalfishEntity.init(event);
		CrystalfishspawningEntity.init(event);
		PrimordialbathysmalvishapEntity.init(event);
		HydrodiscEntity.init(event);
		LungedsticklebackEntity.init(event);
		LungedsticklebackspawningEntity.init(event);
		BettaEntity.init(event);
		BettaspawningEntity.init(event);
		VenomspinefishEntity.init(event);
		VenomspinefishspawningEntity.init(event);
		AkaimaouEntity.init(event);
		AkaimaouspawningEntity.init(event);
		SnowstriderEntity.init(event);
		SnowstriderspawningEntity.init(event);
		GoldenkoiEntity.init(event);
		GoldenkoispawningEntity.init(event);
		RustykoiEntity.init(event);
		RustykoispawningEntity.init(event);
		BrownshirakodaiEntity.init(event);
		BrownshirakodaispawningEntity.init(event);
		PurpleshirakodaiEntity.init(event);
		PurpleshirakodaispawningEntity.init(event);
		TeacoloredshirakodaiEntity.init(event);
		TeacoloredshirakodaispawningEntity.init(event);
		AbidingangelfishEntity.init(event);
		AbidingangelfishspawningEntity.init(event);
		RaimeiangelfishEntity.init(event);
		RaimeiangelfishspawningEntity.init(event);
		MoonfinEntity.init(event);
		MoonfinspawningEntity.init(event);
		RuingraderEntity.init(event);
		FrozensoulwitheredEntity.init(event);
		FrozensoulEntity.init(event);
		FatuipyroagentEntity.init(event);
		AnemobulletEntity.init(event);
		StretchyanemofungusEntity.init(event);
		WhirlingelectrofungusEntity.init(event);
		WitheringtumorEntity.init(event);
		DefensemechanismEntity.init(event);
		ShaggysumpterbeastbabyEntity.init(event);
		ShaggysumpterbeastadultEntity.init(event);
		ShaggysumpterbeastspawningEntity.init(event);
		SpinocrocodileEntity.init(event);
		ShroomboarEntity.init(event);
		RishbolandtigerEntity.init(event);
		StretchygeofungusEntity.init(event);
		StretchypyrofungusEntity.init(event);
		RuindrakeskywatchEntity.init(event);
		RuindrakeearthwatchEntity.init(event);
		DuskbirdEntity.init(event);
		DuskbirdflyingEntity.init(event);
		WhirlingcryofungusEntity.init(event);
		EremiteEntity.init(event);
		SunsetcloudanglerEntity.init(event);
		SunsetcloudanglerspawningEntity.init(event);
		TruefruitanglerEntity.init(event);
		TruefruitanglerspawningEntity.init(event);
		SandstormanglerEntity.init(event);
		SandstormanglerspawningEntity.init(event);
		PeachofthedeepwavesEntity.init(event);
		PeachofthedeepwavesspawningEntity.init(event);
		GroundedhydroshroomEntity.init(event);
		WingeddendroshroomEntity.init(event);
		HalcyonjadeaxemarlinEntity.init(event);
		HalcyonjadeaxemarlinspawningEntity.init(event);
		LazuriteaxemarlinEntity.init(event);
		LazuriteaxemarlinspawningEntity.init(event);
		WingedcryoshroomEntity.init(event);
		RedtailedlizardEntity.init(event);
		OnikabutoridingEntity.init(event);
		OsialEntity.init(event);
		QuicksandunagiEntity.init(event);
		AramaEntity.init(event);
		Questnpc1Entity.init(event);
		Questnpc2Entity.init(event);
		MaranasavatarEntity.init(event);
		Questnpc3Entity.init(event);
		Questnpc4Entity.init(event);
		Questnpc5Entity.init(event);
		Questnpc6Entity.init(event);
		Questnpc7Entity.init(event);
		Questnpc8Entity.init(event);
		QuestnpcsspawnerEntity.init(event);
		Questnpc9Entity.init(event);
		Questnpc10Entity.init(event);
		Questnpc11Entity.init(event);
		Questnpc12Entity.init(event);
		Questnpc13Entity.init(event);
		Questnpc14Entity.init(event);
		Questnpc15Entity.init(event);
		Questnpc16Entity.init(event);
		Questnpc17Entity.init(event);
		FatuiskirmishergeochanterbracerEntity.init(event);
		ScarabEntity.init(event);
		ScarabballEntity.init(event);
		PrimalconstructprospectorEntity.init(event);
		PrimalconstructrepulsorEntity.init(event);
		PrimalconstructreshaperEntity.init(event);
		AlgorithmofsemiintransientmatrixofoverseernetworkEntity.init(event);
		FloatinganemofungusEntity.init(event);
		WhirlingpyrofungusEntity.init(event);
		WeaponprospectorEntity.init(event);
		WeaponrepulsorEntity.init(event);
		WeaponreshaperEntity.init(event);
		ChildeEntity.init(event);
		Childephase2Entity.init(event);
		StretchyelectrofungusEntity.init(event);
		GroundedgeoshroomEntity.init(event);
		ScorpionEntity.init(event);
		DesertsumpterbeastbabyEntity.init(event);
		DesertsumpterbeastadultEntity.init(event);
		DesertsumpterbeastspawningEntity.init(event);
		SacredibisEntity.init(event);
		Questnpc18Entity.init(event);
		Questnpc19Entity.init(event);
		GeovishapEntity.init(event);
		ShikikoshouEntity.init(event);
		Questnpc20Entity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ANEMOSLIME.get(), AnemoslimeEntity.createAttributes().build());
		event.put(CRYOSLIME.get(), CryoslimeEntity.createAttributes().build());
		event.put(DENDROSLIME.get(), DendroslimeEntity.createAttributes().build());
		event.put(HIDDENDENDROSLIME.get(), HiddendendroslimeEntity.createAttributes().build());
		event.put(ELECTROSLIME.get(), ElectroslimeEntity.createAttributes().build());
		event.put(GEOSLIME.get(), GeoslimeEntity.createAttributes().build());
		event.put(HYDROSLIME.get(), HydroslimeEntity.createAttributes().build());
		event.put(PYROSLIME.get(), PyroslimeEntity.createAttributes().build());
		event.put(UNLITPYROSLIME.get(), UnlitpyroslimeEntity.createAttributes().build());
		event.put(LARGEANEMOSLIME.get(), LargeanemoslimeEntity.createAttributes().build());
		event.put(LARGECRYOSLIME.get(), LargecryoslimeEntity.createAttributes().build());
		event.put(LARGECRYOSLIMENOHELMET.get(), LargecryoslimenohelmetEntity.createAttributes().build());
		event.put(HIDDENLARGEDENDROSLIME.get(), HiddenlargedendroslimeEntity.createAttributes().build());
		event.put(LARGEDENDROSLIME.get(), LargedendroslimeEntity.createAttributes().build());
		event.put(LARGEELECTROSLIME.get(), LargeelectroslimeEntity.createAttributes().build());
		event.put(MUTANTELECTROSLIME.get(), MutantelectroslimeEntity.createAttributes().build());
		event.put(LARGEGEOSLIME.get(), LargegeoslimeEntity.createAttributes().build());
		event.put(LARGEGEOSLIMENOHELMET.get(), LargegeoslimenohelmetEntity.createAttributes().build());
		event.put(LARGEHYDROSLIME.get(), LargehydroslimeEntity.createAttributes().build());
		event.put(LARGEPYROSLIME.get(), LargepyroslimeEntity.createAttributes().build());
		event.put(UNLITLARGEPYROSLIME.get(), UnlitlargepyroslimeEntity.createAttributes().build());
		event.put(WHIRLWIND.get(), WhirlwindEntity.createAttributes().build());
		event.put(CRYOWHOPPERFLOWER.get(), CryowhopperflowerEntity.createAttributes().build());
		event.put(PYROWHOPPERFLOWER.get(), PyrowhopperflowerEntity.createAttributes().build());
		event.put(ELECTROWHOPPERFLOWER.get(), ElectrowhopperflowerEntity.createAttributes().build());
		event.put(ELECTRICBALL.get(), ElectricballEntity.createAttributes().build());
		event.put(ANEMOSPECTER.get(), AnemospecterEntity.createAttributes().build());
		event.put(GEOSPECTER.get(), GeospecterEntity.createAttributes().build());
		event.put(HYDROSPECTER.get(), HydrospecterEntity.createAttributes().build());
		event.put(CRYOCICIN.get(), CryocicinEntity.createAttributes().build());
		event.put(ELECTROCICIN.get(), ElectrocicinEntity.createAttributes().build());
		event.put(HYDROCICIN.get(), HydrocicinEntity.createAttributes().build());
		event.put(FATUICRYOCICINMAGE.get(), FatuicryocicinmageEntity.createAttributes().build());
		event.put(FATUIELECTROCICINMAGE.get(), FatuielectrocicinmageEntity.createAttributes().build());
		event.put(HILICHURL.get(), HilichurlEntity.createAttributes().build());
		event.put(HILICHURLFIGHTER.get(), HilichurlfighterEntity.createAttributes().build());
		event.put(HILICHURLSHOOTER.get(), HilichurlshooterEntity.createAttributes().build());
		event.put(UNUSUALHILICHURL.get(), UnusualhilichurlEntity.createAttributes().build());
		event.put(HILICHURLCRYOGRENADIER.get(), HilichurlcryogrenadierEntity.createAttributes().build());
		event.put(HILICHURLCRYOSHOOTER.get(), HilichurlcryoshooterEntity.createAttributes().build());
		event.put(ICESHIELDHILICHURLGUARD.get(), IceshieldhilichurlguardEntity.createAttributes().build());
		event.put(WOODENSHIELDHILICHURLGUARD.get(), WoodenshieldhilichurlguardEntity.createAttributes().build());
		event.put(HILICHURLELECTROGRENADIER.get(), HilichurlelectrogrenadierEntity.createAttributes().build());
		event.put(HILICHURLELECTROSHOOTER.get(), HilichurlelectroshooterEntity.createAttributes().build());
		event.put(ROCKSHIELDHILICHURLGUARD.get(), RockshieldhilichurlguardEntity.createAttributes().build());
		event.put(HILICHURLBERSERKER.get(), HilichurlberserkerEntity.createAttributes().build());
		event.put(HILICHURLPYROGRENADIER.get(), HilichurlpyrogrenadierEntity.createAttributes().build());
		event.put(HILICHURLPYROSHOOTER.get(), HilichurlpyroshooterEntity.createAttributes().build());
		event.put(ANEMOSAMACHURL.get(), AnemosamachurlEntity.createAttributes().build());
		event.put(CRYOSAMACHURL.get(), CryosamachurlEntity.createAttributes().build());
		event.put(DENDROSAMACHURL.get(), DendrosamachurlEntity.createAttributes().build());
		event.put(ELECTROSAMACHURL.get(), ElectrosamachurlEntity.createAttributes().build());
		event.put(GEOSAMACHURL.get(), GeosamachurlEntity.createAttributes().build());
		event.put(HYDROSAMACHURL.get(), HydrosamachurlEntity.createAttributes().build());
		event.put(ABYSSMAGECRYO.get(), AbyssmagecryoEntity.createAttributes().build());
		event.put(CRYOABYSSMAGE.get(), CryoabyssmageEntity.createAttributes().build());
		event.put(ABYSSMAGEELECTRO.get(), AbyssmageelectroEntity.createAttributes().build());
		event.put(ELECTROABYSSMAGE.get(), ElectroabyssmageEntity.createAttributes().build());
		event.put(ABYSSMAGEHYDRO.get(), AbyssmagehydroEntity.createAttributes().build());
		event.put(HYDROABYSSMAGE.get(), HydroabyssmageEntity.createAttributes().build());
		event.put(ABYSSMAGEPYRO.get(), AbyssmagepyroEntity.createAttributes().build());
		event.put(PYROABYSSMAGE.get(), PyroabyssmageEntity.createAttributes().build());
		event.put(LIVINGBUBBLE.get(), LivingbubbleEntity.createAttributes().build());
		event.put(WISP.get(), WispEntity.createAttributes().build());
		event.put(MYSTERIOUSSEELIE.get(), MysteriousseelieEntity.createAttributes().build());
		event.put(WARMSEELIE.get(), WarmseelieEntity.createAttributes().build());
		event.put(ELECTROSEELIE.get(), ElectroseelieEntity.createAttributes().build());
		event.put(FIREFLY.get(), FireflyEntity.createAttributes().build());
		event.put(SCARLETBEAKDUCK.get(), ScarletbeakduckEntity.createAttributes().build());
		event.put(EMERALDDUCK.get(), EmeraldduckEntity.createAttributes().build());
		event.put(AZURECRANE.get(), AzurecraneEntity.createAttributes().build());
		event.put(VIOLETIBIS.get(), VioletibisEntity.createAttributes().build());
		event.put(CROW.get(), CrowEntity.createAttributes().build());
		event.put(CRYOREGISVINE.get(), CryoregisvineEntity.createAttributes().build());
		event.put(PYROREGISVINE.get(), PyroregisvineEntity.createAttributes().build());
		event.put(SQUIRREL.get(), SquirrelEntity.createAttributes().build());
		event.put(BOAR.get(), BoarEntity.createAttributes().build());
		event.put(SNOWBOAR.get(), SnowboarEntity.createAttributes().build());
		event.put(SNOWWEASEL.get(), SnowweaselEntity.createAttributes().build());
		event.put(REDTAILEDWEASEL.get(), RedtailedweaselEntity.createAttributes().build());
		event.put(BOOTWEASEL.get(), BootweaselEntity.createAttributes().build());
		event.put(BLUEBUTTERFLY.get(), BluebutterflyEntity.createAttributes().build());
		event.put(LIGHTBLUEBUTTERFLY.get(), LightbluebutterflyEntity.createAttributes().build());
		event.put(PINKBUTTERFLY.get(), PinkbutterflyEntity.createAttributes().build());
		event.put(YELLOWBUTTERFLY.get(), YellowbutterflyEntity.createAttributes().build());
		event.put(ANEMOCRYSTALFLY.get(), AnemocrystalflyEntity.createAttributes().build());
		event.put(CRYOCRYSTALFLY.get(), CryocrystalflyEntity.createAttributes().build());
		event.put(ELECTROCRYSTALFLY.get(), ElectrocrystalflyEntity.createAttributes().build());
		event.put(GEOCRYSTALFLY.get(), GeocrystalflyEntity.createAttributes().build());
		event.put(GOLDENCRAB.get(), GoldencrabEntity.createAttributes().build());
		event.put(SUNCRAB.get(), SuncrabEntity.createAttributes().build());
		event.put(OCEANCRAB.get(), OceancrabEntity.createAttributes().build());
		event.put(GENERALCRAB.get(), GeneralcrabEntity.createAttributes().build());
		event.put(PALEREDCRAB.get(), PaleredcrabEntity.createAttributes().build());
		event.put(BLUEHORNEDLIZARD.get(), BluehornedlizardEntity.createAttributes().build());
		event.put(GREENHORNEDLIZARD.get(), GreenhornedlizardEntity.createAttributes().build());
		event.put(REDHORNEDLIZARD.get(), RedhornedlizardEntity.createAttributes().build());
		event.put(PITHLIZARD.get(), PithlizardEntity.createAttributes().build());
		event.put(ADORNEDUNAGI.get(), AdornedunagiEntity.createAttributes().build());
		event.put(REDFINNEDUNAGI.get(), RedfinnedunagiEntity.createAttributes().build());
		event.put(DEEPSEAUNAGI.get(), DeepseaunagiEntity.createAttributes().build());
		event.put(PYROSPECTER.get(), PyrospecterEntity.createAttributes().build());
		event.put(CRYOSPECTER.get(), CryospecterEntity.createAttributes().build());
		event.put(ELECTROSPECTER.get(), ElectrospecterEntity.createAttributes().build());
		event.put(DIVDARAY.get(), DivdarayEntity.createAttributes().build());
		event.put(FORMALORAY.get(), FormalorayEntity.createAttributes().build());
		event.put(FLOATINGRAY.get(), FloatingrayEntity.createAttributes().build());
		event.put(EYEOFTHESTORM.get(), EyeofthestormEntity.createAttributes().build());
		event.put(EYEOFSTORMPHASE_2.get(), Eyeofstormphase2Entity.createAttributes().build());
		event.put(THUNDERMANIFESTATION.get(), ThundermanifestationEntity.createAttributes().build());
		event.put(ELECTRICWALL.get(), ElectricwallEntity.createAttributes().build());
		event.put(ELECTRICTNT.get(), ElectrictntEntity.createAttributes().build());
		event.put(FELLFLOWER.get(), FellflowerEntity.createAttributes().build());
		event.put(HATEFULOCEANID.get(), HatefuloceanidEntity.createAttributes().build());
		event.put(WATERMINIONBOAR.get(), WaterminionboarEntity.createAttributes().build());
		event.put(WATERMINIONFERRET.get(), WaterminionferretEntity.createAttributes().build());
		event.put(WATERMINIONCRAB.get(), WaterminioncrabEntity.createAttributes().build());
		event.put(MINISEELIECURCUMA.get(), MiniseeliecurcumaEntity.createAttributes().build());
		event.put(MINISEELIEDAYFLOWER.get(), MiniseeliedayflowerEntity.createAttributes().build());
		event.put(MINISEELIEROSE.get(), MiniseelieroseEntity.createAttributes().build());
		event.put(MINISEELIEVIOLA.get(), MiniseelieviolaEntity.createAttributes().build());
		event.put(AZHDAHA.get(), AzhdahaEntity.createAttributes().build());
		event.put(MYSTERIOUSSEELIESOULSAND.get(), MysteriousseeliesoulsandEntity.createAttributes().build());
		event.put(WARMSEELIEICESPIKES.get(), WarmseelieicespikesEntity.createAttributes().build());
		event.put(ONIKABUTO.get(), OnikabutoEntity.createAttributes().build());
		event.put(AMATEURWEASELTHIEF.get(), AmateurweaselthiefEntity.createAttributes().build());
		event.put(AMATEURWEASELTHIEFSCARED.get(), AmateurweaselthiefscaredEntity.createAttributes().build());
		event.put(HOARDERWEASELTHIEF.get(), HoarderweaselthiefEntity.createAttributes().build());
		event.put(HOARDERWEASELTHIEFSCARED.get(), HoarderweaselthiefscaredEntity.createAttributes().build());
		event.put(GOLDENWEASELTHIEF.get(), GoldenweaselthiefEntity.createAttributes().build());
		event.put(GOLDENWEASELTHIEFSCARED.get(), GoldenweaselthiefscaredEntity.createAttributes().build());
		event.put(GEOHYPOSTASIS.get(), GeohypostasisEntity.createAttributes().build());
		event.put(GEOHYPOSTASISPHASE_2.get(), Geohypostasisphase2Entity.createAttributes().build());
		event.put(GEOHYPOSTASISPHASE_3.get(), Geohypostasisphase3Entity.createAttributes().build());
		event.put(SHOOTINGMINION.get(), ShootingminionEntity.createAttributes().build());
		event.put(GEOHYPOSTASISPHASE_4.get(), Geohypostasisphase4Entity.createAttributes().build());
		event.put(GEOHYPOSTASISPHASE_5.get(), Geohypostasisphase5Entity.createAttributes().build());
		event.put(GEOHYPOSTASISPHASE_6.get(), Geohypostasisphase6Entity.createAttributes().build());
		event.put(GEOHYPOSTASISPHASE_7.get(), Geohypostasisphase7Entity.createAttributes().build());
		event.put(GEOHYPOSTASISPHASE_8.get(), Geohypostasisphase8Entity.createAttributes().build());
		event.put(THUNDERCRAVENRIFTHOUNDWHELP.get(), ThundercravenrifthoundwhelpEntity.createAttributes().build());
		event.put(ROCKFONDRIFTHOUNDWHELP.get(), RockfondrifthoundwhelpEntity.createAttributes().build());
		event.put(ROCKFONDRIFTHOUND.get(), RockfondrifthoundEntity.createAttributes().build());
		event.put(THUNDERCRAVENRIFTHOUND.get(), ThundercravenrifthoundEntity.createAttributes().build());
		event.put(TREASUREHOARDER.get(), TreasurehoarderEntity.createAttributes().build());
		event.put(STONEHIDELAWACHURL.get(), StonehidelawachurlEntity.createAttributes().build());
		event.put(ANEMOHYPOSTASIS.get(), AnemohypostasisEntity.createAttributes().build());
		event.put(ANEMOHYPOSTASISPHASE_2.get(), Anemohypostasisphase2Entity.createAttributes().build());
		event.put(ANEMOHYPOSTASISPHASE_3.get(), Anemohypostasisphase3Entity.createAttributes().build());
		event.put(ANEMOHYPOSTASISPHASE_4.get(), Anemohypostasisphase4Entity.createAttributes().build());
		event.put(ANEMOHYPOSTASISPHASE_5.get(), Anemohypostasisphase5Entity.createAttributes().build());
		event.put(ANEMOHYPOSTASISPHASE_6.get(), Anemohypostasisphase6Entity.createAttributes().build());
		event.put(ANEMOHYPOSTASISPHASE_7.get(), Anemohypostasisphase7Entity.createAttributes().build());
		event.put(ANEMOHYPOSTASISPHASE_8.get(), Anemohypostasisphase8Entity.createAttributes().build());
		event.put(GOLDENWOLFLORD.get(), GoldenwolflordEntity.createAttributes().build());
		event.put(GOLDENATTACKER.get(), GoldenattackerEntity.createAttributes().build());
		event.put(GOLDENWOLFLORDBOSS.get(), GoldenwolflordbossEntity.createAttributes().build());
		event.put(GOLDENMINION.get(), GoldenminionEntity.createAttributes().build());
		event.put(ATTACKINGMINION.get(), AttackingminionEntity.createAttributes().build());
		event.put(CORALBUTTERFLY.get(), CoralbutterflyEntity.createAttributes().build());
		event.put(PYROHYPOSTASIS.get(), PyrohypostasisEntity.createAttributes().build());
		event.put(FLOATINGLARGEANEMOSLIME.get(), FloatinglargeanemoslimeEntity.createAttributes().build());
		event.put(SHADOWYHUSKSTANDARDBEARER.get(), ShadowyhuskstandardbearerEntity.createAttributes().build());
		event.put(SHADOWYHUSKLINEBREAKER.get(), ShadowyhusklinebreakerEntity.createAttributes().build());
		event.put(SHADOWYHUSKDEFENDER.get(), ShadowyhuskdefenderEntity.createAttributes().build());
		event.put(PYROHYPOSTASISPHASE_2.get(), Pyrohypostasisphase2Entity.createAttributes().build());
		event.put(PYROHYPOSTASISPHASE_3.get(), Pyrohypostasisphase3Entity.createAttributes().build());
		event.put(PYROHYPOSTASISPHASE_4.get(), Pyrohypostasisphase4Entity.createAttributes().build());
		event.put(PYROHYPOSTASISPHASE_5.get(), Pyrohypostasisphase5Entity.createAttributes().build());
		event.put(PYROHYPOSTASISPHASE_6.get(), Pyrohypostasisphase6Entity.createAttributes().build());
		event.put(PYROHYPOSTASISPHASE_7.get(), Pyrohypostasisphase7Entity.createAttributes().build());
		event.put(PYROHYPOSTASISPHASE_8.get(), Pyrohypostasisphase8Entity.createAttributes().build());
		event.put(ELECTROHYPOSTASIS.get(), ElectrohypostasisEntity.createAttributes().build());
		event.put(FLOATINGHYDROFUNGI.get(), FloatinghydrofungiEntity.createAttributes().build());
		event.put(ELECTROHYPOSTASISPHASE_2.get(), Electrohypostasisphase2Entity.createAttributes().build());
		event.put(BLUETHUNDERWEASEL.get(), BluethunderweaselEntity.createAttributes().build());
		event.put(ELECTROHYPOSTASISPHASE_3.get(), Electrohypostasisphase3Entity.createAttributes().build());
		event.put(ELECTROHYPOSTASISPHASE_4.get(), Electrohypostasisphase4Entity.createAttributes().build());
		event.put(ELECTROHYPOSTASISPHASE_5.get(), Electrohypostasisphase5Entity.createAttributes().build());
		event.put(ELECTROHYPOSTASISPHASE_6.get(), Electrohypostasisphase6Entity.createAttributes().build());
		event.put(ELECTROHYPOSTASISPHASE_7.get(), Electrohypostasisphase7Entity.createAttributes().build());
		event.put(ELECTROHYPOSTASISPHASE_8.get(), Electrohypostasisphase8Entity.createAttributes().build());
		event.put(FRIENDLYELECTROCICIN.get(), FriendlyelectrocicinEntity.createAttributes().build());
		event.put(FROSTARMLAWACHURL.get(), FrostarmlawachurlEntity.createAttributes().build());
		event.put(LUCKLIGHTFLY.get(), LucklightflyEntity.createAttributes().build());
		event.put(LUCKLIGHTFLYSPAWNING.get(), LucklightflyspawningEntity.createAttributes().build());
		event.put(LUMINOUSSEELIE.get(), LuminousseelieEntity.createAttributes().build());
		event.put(LUMINOUSSEELIESPAWNING.get(), LuminousseeliespawningEntity.createAttributes().build());
		event.put(MITACHURLBLAZINGAXE.get(), MitachurlblazingaxeEntity.createAttributes().build());
		event.put(MITACHURLCRACKLINGAXE.get(), MitachurlcracklingaxeEntity.createAttributes().build());
		event.put(KAIRAGIFIERYMIGHT.get(), KairagifierymightEntity.createAttributes().build());
		event.put(KAIRAGIDANCINGTHUNDER.get(), KairagidancingthunderEntity.createAttributes().build());
		event.put(MIASMICTUMOR.get(), MiasmictumorEntity.createAttributes().build());
		event.put(OCHIMUSACANKEREDFLAME.get(), OchimusacankeredflameEntity.createAttributes().build());
		event.put(OCHIMUSAENSORCELLEDTHUNDER.get(), OchimusaensorcelledthunderEntity.createAttributes().build());
		event.put(MIRRORMAIDEN.get(), MirrormaidenEntity.createAttributes().build());
		event.put(FLOATTYBUBBLE.get(), FloattybubbleEntity.createAttributes().build());
		event.put(THUNDERHELMLAWACHURL.get(), ThunderhelmlawachurlEntity.createAttributes().build());
		event.put(CRYOHYPOSTASIS.get(), CryohypostasisEntity.createAttributes().build());
		event.put(CRYOHYPOSTASISPHASE_2.get(), Cryohypostasisphase2Entity.createAttributes().build());
		event.put(GREATSNOWBOARKING.get(), GreatsnowboarkingEntity.createAttributes().build());
		event.put(WOODENSHIELDWALLMITACHURL.get(), WoodenshieldwallmitachurlEntity.createAttributes().build());
		event.put(MITACHURL.get(), MitachurlEntity.createAttributes().build());
		event.put(ENDORA.get(), EndoraEntity.createAttributes().build());
		event.put(MAGATSUMITAKENARUKAMINOMIKOTO.get(), MagatsumitakenarukaminomikotoEntity.createAttributes().build());
		event.put(BAALCLONE.get(), BaalcloneEntity.createAttributes().build());
		event.put(MAGATSUMITAKENARUKAMINOMIKOTOPUPPET.get(), MagatsumitakenarukaminomikotopuppetEntity.createAttributes().build());
		event.put(MAGATSUMITAKENARUKAMINOMIKOTOFINAL.get(), MagatsumitakenarukaminomikotofinalEntity.createAttributes().build());
		event.put(ELECTRICSHOOTER.get(), ElectricshooterEntity.createAttributes().build());
		event.put(CRYOHYPOSTASISPHASE_3.get(), Cryohypostasisphase3Entity.createAttributes().build());
		event.put(CRYOHYPOSTASISPHASE_4.get(), Cryohypostasisphase4Entity.createAttributes().build());
		event.put(CRYOHYPOSTASISPHASE_5.get(), Cryohypostasisphase5Entity.createAttributes().build());
		event.put(CRYOHYPOSTASISPHASE_6.get(), Cryohypostasisphase6Entity.createAttributes().build());
		event.put(RUINSCOUT.get(), RuinscoutEntity.createAttributes().build());
		event.put(GLACIALMINE.get(), GlacialmineEntity.createAttributes().build());
		event.put(CRYOHYPOSTASISPHASE_7.get(), Cryohypostasisphase7Entity.createAttributes().build());
		event.put(CRYOHYPOSTASISPHASE_8.get(), Cryohypostasisphase8Entity.createAttributes().build());
		event.put(HYDROHYPOSTASIS.get(), HydrohypostasisEntity.createAttributes().build());
		event.put(GEOVISHAPHATCHLING.get(), GeovishaphatchlingEntity.createAttributes().build());
		event.put(HYDROHYPOSTASISPHASE_2.get(), Hydrohypostasisphase2Entity.createAttributes().build());
		event.put(HYDROHYPOSTASISPHASE_3.get(), Hydrohypostasisphase3Entity.createAttributes().build());
		event.put(HYDROHYPOSTASISPHASE_4.get(), Hydrohypostasisphase4Entity.createAttributes().build());
		event.put(HYDROHYPOSTASISPHASE_5.get(), Hydrohypostasisphase5Entity.createAttributes().build());
		event.put(HYDROHYPOSTASISPHASE_6.get(), Hydrohypostasisphase6Entity.createAttributes().build());
		event.put(HYDROHYPOSTASISPHASE_7.get(), Hydrohypostasisphase7Entity.createAttributes().build());
		event.put(HYDROHYPOSTASISPHASE_8.get(), Hydrohypostasisphase8Entity.createAttributes().build());
		event.put(RUINDEFENDER.get(), RuindefenderEntity.createAttributes().build());
		event.put(RUINDESTROYER.get(), RuindestroyerEntity.createAttributes().build());
		event.put(RUINCRUISER.get(), RuincruiserEntity.createAttributes().build());
		event.put(RUINSERPENT.get(), RuinserpentEntity.createAttributes().build());
		event.put(PERPETUALMECHANICALARRAY.get(), PerpetualmechanicalarrayEntity.createAttributes().build());
		event.put(PERPETUALMECHANICALARRAYPHASE_2.get(), Perpetualmechanicalarrayphase2Entity.createAttributes().build());
		event.put(PERPETUALMECHANICALARRAYPHASE_3.get(), Perpetualmechanicalarrayphase3Entity.createAttributes().build());
		event.put(PERPETUALMECHANICALARRAYPHASE_4.get(), Perpetualmechanicalarrayphase4Entity.createAttributes().build());
		event.put(RUINHUNTER.get(), RuinhunterEntity.createAttributes().build());
		event.put(RUINHUNTERARMLESS.get(), RuinhunterarmlessEntity.createAttributes().build());
		event.put(RUINHUNTERARM.get(), RuinhunterarmEntity.createAttributes().build());
		event.put(RUINGUARD.get(), RuinguardEntity.createAttributes().build());
		event.put(RUINGUARDINACTIVE.get(), RuinguardinactiveEntity.createAttributes().build());
		event.put(RIMEBITERBATHYSMALVISHAPHATCHLING.get(), RimebiterbathysmalvishaphatchlingEntity.createAttributes().build());
		event.put(TATARIGAMI.get(), TatarigamiEntity.createAttributes().build());
		event.put(WHITEPIGEON.get(), WhitepigeonEntity.createAttributes().build());
		event.put(WHITEPIGEONFLYING.get(), WhitepigeonflyingEntity.createAttributes().build());
		event.put(BRIGHTCROWNPIGEON.get(), BrightcrownpigeonEntity.createAttributes().build());
		event.put(BRIGHTCROWNPIGEONFLYING.get(), BrightcrownpigeonflyingEntity.createAttributes().build());
		event.put(ICESHIELDWALLMITACHURL.get(), IceshieldwallmitachurlEntity.createAttributes().build());
		event.put(ELECTROREGISVINE.get(), ElectroregisvineEntity.createAttributes().build());
		event.put(ELECTROREGISVINEHIDDEN.get(), ElectroregisvinehiddenEntity.createAttributes().build());
		event.put(ROCKSHIELDWALLMITACHURL.get(), RockshieldwallmitachurlEntity.createAttributes().build());
		event.put(DENDROSPECTER.get(), DendrospecterEntity.createAttributes().build());
		event.put(DENDROBULLET.get(), DendrobulletEntity.createAttributes().build());
		event.put(FLOATINGDENDROFUNGUS.get(), FloatingdendrofungusEntity.createAttributes().build());
		event.put(MINISEELIEMOSS.get(), MiniseeliemossEntity.createAttributes().build());
		event.put(DENDROCRYSTALFLY.get(), DendrocrystalflyEntity.createAttributes().build());
		event.put(BLACKKINGPIGEON.get(), BlackkingpigeonEntity.createAttributes().build());
		event.put(BLACKKINGPIGEONFLYING.get(), BlackkingpigeonflyingEntity.createAttributes().build());
		event.put(CRIMSONFLANKPIGEON.get(), CrimsonflankpigeonEntity.createAttributes().build());
		event.put(CRIMSONFLANKPIGEONFLYING.get(), CrimsonflankpigeonflyingEntity.createAttributes().build());
		event.put(GRAYWINGPIGEON.get(), GraywingpigeonEntity.createAttributes().build());
		event.put(GRAYWINGPIGEONFLYING.get(), GraywingpigeonflyingEntity.createAttributes().build());
		event.put(LAPISGLEDE.get(), LapisgledeEntity.createAttributes().build());
		event.put(LAPISGLEDEFLYING.get(), LapisgledeflyingEntity.createAttributes().build());
		event.put(BROWNWINGFALCON.get(), BrownwingfalconEntity.createAttributes().build());
		event.put(BROWNWINGFALCONFLYING.get(), BrownwingfalconflyingEntity.createAttributes().build());
		event.put(UMBERTAILFALCON.get(), UmbertailfalconEntity.createAttributes().build());
		event.put(UMBERTAILFALCONFLYING.get(), UmbertailfalconflyingEntity.createAttributes().build());
		event.put(SILKWHITEFALCON.get(), SilkwhitefalconEntity.createAttributes().build());
		event.put(SILKWHITEFALCONFLYING.get(), SilkwhitefalconflyingEntity.createAttributes().build());
		event.put(CRIMSONFINCH.get(), CrimsonfinchEntity.createAttributes().build());
		event.put(CRIMSONFINCHFLYING.get(), CrimsonfinchflyingEntity.createAttributes().build());
		event.put(EMERALDFINCH.get(), EmeraldfinchEntity.createAttributes().build());
		event.put(EMERALDFINCHFLYING.get(), EmeraldfinchflyingEntity.createAttributes().build());
		event.put(GOLDENFINCH.get(), GoldenfinchEntity.createAttributes().build());
		event.put(GOLDENFINCHFLYING.get(), GoldenfinchflyingEntity.createAttributes().build());
		event.put(SNOWFINCH.get(), SnowfinchEntity.createAttributes().build());
		event.put(SNOWFINCHFLYING.get(), SnowfinchflyingEntity.createAttributes().build());
		event.put(DIVDARAYSPAWNING.get(), DivdarayspawningEntity.createAttributes().build());
		event.put(FORMALORAYSPAWNING.get(), FormalorayspawningEntity.createAttributes().build());
		event.put(MEDAKA.get(), MedakaEntity.createAttributes().build());
		event.put(MEDAKASPAWNING.get(), MedakaspawningEntity.createAttributes().build());
		event.put(GLAZEMEDAKA.get(), GlazemedakaEntity.createAttributes().build());
		event.put(GLAZEMEDAKASPAWNING.get(), GlazemedakaspawningEntity.createAttributes().build());
		event.put(SWEETFLOWERMEDAKA.get(), SweetflowermedakaEntity.createAttributes().build());
		event.put(SWEETFLOWERMEDAKASPAWNING.get(), SweetflowermedakaspawningEntity.createAttributes().build());
		event.put(AIZENMEDAKA.get(), AizenmedakaEntity.createAttributes().build());
		event.put(AIZENMEDAKASPAWNING.get(), AizenmedakaspawningEntity.createAttributes().build());
		event.put(DAWNCATCHER.get(), DawncatcherEntity.createAttributes().build());
		event.put(DAWNCATCHERSPAWNING.get(), DawncatcherspawningEntity.createAttributes().build());
		event.put(CRYSTALFISH.get(), CrystalfishEntity.createAttributes().build());
		event.put(CRYSTALFISHSPAWNING.get(), CrystalfishspawningEntity.createAttributes().build());
		event.put(PRIMORDIALBATHYSMALVISHAP.get(), PrimordialbathysmalvishapEntity.createAttributes().build());
		event.put(HYDRODISC.get(), HydrodiscEntity.createAttributes().build());
		event.put(LUNGEDSTICKLEBACK.get(), LungedsticklebackEntity.createAttributes().build());
		event.put(LUNGEDSTICKLEBACKSPAWNING.get(), LungedsticklebackspawningEntity.createAttributes().build());
		event.put(BETTA.get(), BettaEntity.createAttributes().build());
		event.put(BETTASPAWNING.get(), BettaspawningEntity.createAttributes().build());
		event.put(VENOMSPINEFISH.get(), VenomspinefishEntity.createAttributes().build());
		event.put(VENOMSPINEFISHSPAWNING.get(), VenomspinefishspawningEntity.createAttributes().build());
		event.put(AKAIMAOU.get(), AkaimaouEntity.createAttributes().build());
		event.put(AKAIMAOUSPAWNING.get(), AkaimaouspawningEntity.createAttributes().build());
		event.put(SNOWSTRIDER.get(), SnowstriderEntity.createAttributes().build());
		event.put(SNOWSTRIDERSPAWNING.get(), SnowstriderspawningEntity.createAttributes().build());
		event.put(GOLDENKOI.get(), GoldenkoiEntity.createAttributes().build());
		event.put(GOLDENKOISPAWNING.get(), GoldenkoispawningEntity.createAttributes().build());
		event.put(RUSTYKOI.get(), RustykoiEntity.createAttributes().build());
		event.put(RUSTYKOISPAWNING.get(), RustykoispawningEntity.createAttributes().build());
		event.put(BROWNSHIRAKODAI.get(), BrownshirakodaiEntity.createAttributes().build());
		event.put(BROWNSHIRAKODAISPAWNING.get(), BrownshirakodaispawningEntity.createAttributes().build());
		event.put(PURPLESHIRAKODAI.get(), PurpleshirakodaiEntity.createAttributes().build());
		event.put(PURPLESHIRAKODAISPAWNING.get(), PurpleshirakodaispawningEntity.createAttributes().build());
		event.put(TEACOLOREDSHIRAKODAI.get(), TeacoloredshirakodaiEntity.createAttributes().build());
		event.put(TEACOLOREDSHIRAKODAISPAWNING.get(), TeacoloredshirakodaispawningEntity.createAttributes().build());
		event.put(ABIDINGANGELFISH.get(), AbidingangelfishEntity.createAttributes().build());
		event.put(ABIDINGANGELFISHSPAWNING.get(), AbidingangelfishspawningEntity.createAttributes().build());
		event.put(RAIMEIANGELFISH.get(), RaimeiangelfishEntity.createAttributes().build());
		event.put(RAIMEIANGELFISHSPAWNING.get(), RaimeiangelfishspawningEntity.createAttributes().build());
		event.put(MOONFIN.get(), MoonfinEntity.createAttributes().build());
		event.put(MOONFINSPAWNING.get(), MoonfinspawningEntity.createAttributes().build());
		event.put(RUINGRADER.get(), RuingraderEntity.createAttributes().build());
		event.put(FROZENSOULWITHERED.get(), FrozensoulwitheredEntity.createAttributes().build());
		event.put(FROZENSOUL.get(), FrozensoulEntity.createAttributes().build());
		event.put(FATUIPYROAGENT.get(), FatuipyroagentEntity.createAttributes().build());
		event.put(ANEMOBULLET.get(), AnemobulletEntity.createAttributes().build());
		event.put(STRETCHYANEMOFUNGUS.get(), StretchyanemofungusEntity.createAttributes().build());
		event.put(WHIRLINGELECTROFUNGUS.get(), WhirlingelectrofungusEntity.createAttributes().build());
		event.put(WITHERINGTUMOR.get(), WitheringtumorEntity.createAttributes().build());
		event.put(DEFENSEMECHANISM.get(), DefensemechanismEntity.createAttributes().build());
		event.put(SHAGGYSUMPTERBEASTBABY.get(), ShaggysumpterbeastbabyEntity.createAttributes().build());
		event.put(SHAGGYSUMPTERBEASTADULT.get(), ShaggysumpterbeastadultEntity.createAttributes().build());
		event.put(SHAGGYSUMPTERBEASTSPAWNING.get(), ShaggysumpterbeastspawningEntity.createAttributes().build());
		event.put(SPINOCROCODILE.get(), SpinocrocodileEntity.createAttributes().build());
		event.put(SHROOMBOAR.get(), ShroomboarEntity.createAttributes().build());
		event.put(RISHBOLANDTIGER.get(), RishbolandtigerEntity.createAttributes().build());
		event.put(STRETCHYGEOFUNGUS.get(), StretchygeofungusEntity.createAttributes().build());
		event.put(STRETCHYPYROFUNGUS.get(), StretchypyrofungusEntity.createAttributes().build());
		event.put(RUINDRAKESKYWATCH.get(), RuindrakeskywatchEntity.createAttributes().build());
		event.put(RUINDRAKEEARTHWATCH.get(), RuindrakeearthwatchEntity.createAttributes().build());
		event.put(DUSKBIRD.get(), DuskbirdEntity.createAttributes().build());
		event.put(DUSKBIRDFLYING.get(), DuskbirdflyingEntity.createAttributes().build());
		event.put(WHIRLINGCRYOFUNGUS.get(), WhirlingcryofungusEntity.createAttributes().build());
		event.put(EREMITE.get(), EremiteEntity.createAttributes().build());
		event.put(SUNSETCLOUDANGLER.get(), SunsetcloudanglerEntity.createAttributes().build());
		event.put(SUNSETCLOUDANGLERSPAWNING.get(), SunsetcloudanglerspawningEntity.createAttributes().build());
		event.put(TRUEFRUITANGLER.get(), TruefruitanglerEntity.createAttributes().build());
		event.put(TRUEFRUITANGLERSPAWNING.get(), TruefruitanglerspawningEntity.createAttributes().build());
		event.put(SANDSTORMANGLER.get(), SandstormanglerEntity.createAttributes().build());
		event.put(SANDSTORMANGLERSPAWNING.get(), SandstormanglerspawningEntity.createAttributes().build());
		event.put(PEACHOFTHEDEEPWAVES.get(), PeachofthedeepwavesEntity.createAttributes().build());
		event.put(PEACHOFTHEDEEPWAVESSPAWNING.get(), PeachofthedeepwavesspawningEntity.createAttributes().build());
		event.put(GROUNDEDHYDROSHROOM.get(), GroundedhydroshroomEntity.createAttributes().build());
		event.put(WINGEDDENDROSHROOM.get(), WingeddendroshroomEntity.createAttributes().build());
		event.put(HALCYONJADEAXEMARLIN.get(), HalcyonjadeaxemarlinEntity.createAttributes().build());
		event.put(HALCYONJADEAXEMARLINSPAWNING.get(), HalcyonjadeaxemarlinspawningEntity.createAttributes().build());
		event.put(LAZURITEAXEMARLIN.get(), LazuriteaxemarlinEntity.createAttributes().build());
		event.put(LAZURITEAXEMARLINSPAWNING.get(), LazuriteaxemarlinspawningEntity.createAttributes().build());
		event.put(WINGEDCRYOSHROOM.get(), WingedcryoshroomEntity.createAttributes().build());
		event.put(REDTAILEDLIZARD.get(), RedtailedlizardEntity.createAttributes().build());
		event.put(ONIKABUTORIDING.get(), OnikabutoridingEntity.createAttributes().build());
		event.put(OSIAL.get(), OsialEntity.createAttributes().build());
		event.put(QUICKSANDUNAGI.get(), QuicksandunagiEntity.createAttributes().build());
		event.put(ARAMA.get(), AramaEntity.createAttributes().build());
		event.put(QUESTNPC_1.get(), Questnpc1Entity.createAttributes().build());
		event.put(QUESTNPC_2.get(), Questnpc2Entity.createAttributes().build());
		event.put(MARANASAVATAR.get(), MaranasavatarEntity.createAttributes().build());
		event.put(QUESTNPC_3.get(), Questnpc3Entity.createAttributes().build());
		event.put(QUESTNPC_4.get(), Questnpc4Entity.createAttributes().build());
		event.put(QUESTNPC_5.get(), Questnpc5Entity.createAttributes().build());
		event.put(QUESTNPC_6.get(), Questnpc6Entity.createAttributes().build());
		event.put(QUESTNPC_7.get(), Questnpc7Entity.createAttributes().build());
		event.put(QUESTNPC_8.get(), Questnpc8Entity.createAttributes().build());
		event.put(QUESTNPCSSPAWNER.get(), QuestnpcsspawnerEntity.createAttributes().build());
		event.put(QUESTNPC_9.get(), Questnpc9Entity.createAttributes().build());
		event.put(QUESTNPC_10.get(), Questnpc10Entity.createAttributes().build());
		event.put(QUESTNPC_11.get(), Questnpc11Entity.createAttributes().build());
		event.put(QUESTNPC_12.get(), Questnpc12Entity.createAttributes().build());
		event.put(QUESTNPC_13.get(), Questnpc13Entity.createAttributes().build());
		event.put(QUESTNPC_14.get(), Questnpc14Entity.createAttributes().build());
		event.put(QUESTNPC_15.get(), Questnpc15Entity.createAttributes().build());
		event.put(QUESTNPC_16.get(), Questnpc16Entity.createAttributes().build());
		event.put(QUESTNPC_17.get(), Questnpc17Entity.createAttributes().build());
		event.put(FATUISKIRMISHERGEOCHANTERBRACER.get(), FatuiskirmishergeochanterbracerEntity.createAttributes().build());
		event.put(SCARAB.get(), ScarabEntity.createAttributes().build());
		event.put(SCARABBALL.get(), ScarabballEntity.createAttributes().build());
		event.put(PRIMALCONSTRUCTPROSPECTOR.get(), PrimalconstructprospectorEntity.createAttributes().build());
		event.put(PRIMALCONSTRUCTREPULSOR.get(), PrimalconstructrepulsorEntity.createAttributes().build());
		event.put(PRIMALCONSTRUCTRESHAPER.get(), PrimalconstructreshaperEntity.createAttributes().build());
		event.put(ALGORITHMOFSEMIINTRANSIENTMATRIXOFOVERSEERNETWORK.get(), AlgorithmofsemiintransientmatrixofoverseernetworkEntity.createAttributes().build());
		event.put(FLOATINGANEMOFUNGUS.get(), FloatinganemofungusEntity.createAttributes().build());
		event.put(WHIRLINGPYROFUNGUS.get(), WhirlingpyrofungusEntity.createAttributes().build());
		event.put(WEAPONPROSPECTOR.get(), WeaponprospectorEntity.createAttributes().build());
		event.put(WEAPONREPULSOR.get(), WeaponrepulsorEntity.createAttributes().build());
		event.put(WEAPONRESHAPER.get(), WeaponreshaperEntity.createAttributes().build());
		event.put(CHILDE.get(), ChildeEntity.createAttributes().build());
		event.put(CHILDEPHASE_2.get(), Childephase2Entity.createAttributes().build());
		event.put(STRETCHYELECTROFUNGUS.get(), StretchyelectrofungusEntity.createAttributes().build());
		event.put(GROUNDEDGEOSHROOM.get(), GroundedgeoshroomEntity.createAttributes().build());
		event.put(SCORPION.get(), ScorpionEntity.createAttributes().build());
		event.put(DESERTSUMPTERBEASTBABY.get(), DesertsumpterbeastbabyEntity.createAttributes().build());
		event.put(DESERTSUMPTERBEASTADULT.get(), DesertsumpterbeastadultEntity.createAttributes().build());
		event.put(DESERTSUMPTERBEASTSPAWNING.get(), DesertsumpterbeastspawningEntity.createAttributes().build());
		event.put(SACREDIBIS.get(), SacredibisEntity.createAttributes().build());
		event.put(QUESTNPC_18.get(), Questnpc18Entity.createAttributes().build());
		event.put(QUESTNPC_19.get(), Questnpc19Entity.createAttributes().build());
		event.put(GEOVISHAP.get(), GeovishapEntity.createAttributes().build());
		event.put(SHIKIKOSHOU.get(), ShikikoshouEntity.createAttributes().build());
		event.put(QUESTNPC_20.get(), Questnpc20Entity.createAttributes().build());
	}
}
