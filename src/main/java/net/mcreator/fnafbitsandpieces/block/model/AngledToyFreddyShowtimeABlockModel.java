package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledToyFreddyShowtimeATileEntity;

public class AngledToyFreddyShowtimeABlockModel extends AnimatedGeoModel<AngledToyFreddyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyFreddyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyFreddyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toyfreddyshowtimeangled.png");
	}
}
