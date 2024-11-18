package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledToyChicaShowtimeATileEntity;

public class AngledToyChicaShowtimeABlockModel extends AnimatedGeoModel<AngledToyChicaShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyChicaShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyChicaShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeangled.png");
	}
}
