
package net.mcreator.genshinnature.entity;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.genshinnature.procedures.UnderwaterswampsProcedure;
import net.mcreator.genshinnature.procedures.SpawnteacoloredshirakodaiProcedure;
import net.mcreator.genshinnature.init.GenshinNatureModEntities;

import javax.annotation.Nullable;

public class TeacoloredshirakodaispawningEntity extends PathfinderMob {
	public TeacoloredshirakodaispawningEntity(EntityType<TeacoloredshirakodaispawningEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (TeacoloredshirakodaispawningEntity.this.isInWater())
					TeacoloredshirakodaispawningEntity.this.setDeltaMovement(TeacoloredshirakodaispawningEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !TeacoloredshirakodaispawningEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - TeacoloredshirakodaispawningEntity.this.getX();
					double dy = this.wantedY - TeacoloredshirakodaispawningEntity.this.getY();
					double dz = this.wantedZ - TeacoloredshirakodaispawningEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * TeacoloredshirakodaispawningEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					TeacoloredshirakodaispawningEntity.this.setYRot(this.rotlerp(TeacoloredshirakodaispawningEntity.this.getYRot(), f, 10));
					TeacoloredshirakodaispawningEntity.this.yBodyRot = TeacoloredshirakodaispawningEntity.this.getYRot();
					TeacoloredshirakodaispawningEntity.this.yHeadRot = TeacoloredshirakodaispawningEntity.this.getYRot();
					if (TeacoloredshirakodaispawningEntity.this.isInWater()) {
						TeacoloredshirakodaispawningEntity.this.setSpeed((float) TeacoloredshirakodaispawningEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						TeacoloredshirakodaispawningEntity.this.setXRot(this.rotlerp(TeacoloredshirakodaispawningEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(TeacoloredshirakodaispawningEntity.this.getXRot() * (float) (Math.PI / 180.0));
						TeacoloredshirakodaispawningEntity.this.setZza(f3 * f1);
						TeacoloredshirakodaispawningEntity.this.setYya((float) (f1 * dy));
					} else {
						TeacoloredshirakodaispawningEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					TeacoloredshirakodaispawningEntity.this.setSpeed(0);
					TeacoloredshirakodaispawningEntity.this.setYya(0);
					TeacoloredshirakodaispawningEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 1, 40));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		SpawnteacoloredshirakodaiProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
		return retval;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(GenshinNatureModEntities.TEACOLOREDSHIRAKODAISPAWNING.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return UnderwaterswampsProcedure.execute(world, x, y, z);
		}, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);
		return builder;
	}
}