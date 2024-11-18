package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyChicaShowtimeATileEntity;

public class ToyChicaShowtimeABlockModel extends AnimatedGeoModel<ToyChicaShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtime.png");
	}
}
