package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledRatShowtimeATileEntity;

public class AngledRatShowtimeABlockModel extends AnimatedGeoModel<AngledRatShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledRatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledRatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledRatShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtimeangled.png");
	}
}
