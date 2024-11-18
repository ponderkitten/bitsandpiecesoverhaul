package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledChesterShowtimeATileEntity;

public class AngledChesterShowtimeABlockModel extends AnimatedGeoModel<AngledChesterShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledChesterShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledChesterShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledChesterShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtimeangled.png");
	}
}
