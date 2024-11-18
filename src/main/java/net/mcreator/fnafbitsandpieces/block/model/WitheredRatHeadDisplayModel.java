package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredRatHeadDisplayItem;

public class WitheredRatHeadDisplayModel extends AnimatedGeoModel<WitheredRatHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredRatHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredRatHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredRatHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredrathead.png");
	}
}
