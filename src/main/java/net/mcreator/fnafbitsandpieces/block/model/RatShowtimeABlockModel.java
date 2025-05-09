package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.RatShowtimeATileEntity;

public class RatShowtimeABlockModel extends AnimatedGeoModel<RatShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtime.png");
	}
}
