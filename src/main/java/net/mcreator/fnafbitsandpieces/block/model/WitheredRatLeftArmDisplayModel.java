package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredRatLeftArmDisplayItem;

public class WitheredRatLeftArmDisplayModel extends AnimatedGeoModel<WitheredRatLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredRatLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredRatLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredRatLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredratleftarm.png");
	}
}