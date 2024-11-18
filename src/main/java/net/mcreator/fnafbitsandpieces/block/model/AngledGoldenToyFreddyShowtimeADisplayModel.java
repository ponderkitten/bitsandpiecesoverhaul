package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledGoldenToyFreddyShowtimeADisplayItem;

public class AngledGoldenToyFreddyShowtimeADisplayModel extends AnimatedGeoModel<AngledGoldenToyFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledGoldenToyFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledGoldenToyFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledGoldenToyFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtimeangled.png");
	}
}
