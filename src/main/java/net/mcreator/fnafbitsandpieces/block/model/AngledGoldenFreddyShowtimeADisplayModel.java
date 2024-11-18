package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledGoldenFreddyShowtimeADisplayItem;

public class AngledGoldenFreddyShowtimeADisplayModel extends AnimatedGeoModel<AngledGoldenFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldenfreddyshowtimeangled.png");
	}
}
