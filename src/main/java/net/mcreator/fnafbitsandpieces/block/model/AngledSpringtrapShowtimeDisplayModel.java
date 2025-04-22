package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledSpringtrapShowtimeDisplayItem;

public class AngledSpringtrapShowtimeDisplayModel extends AnimatedGeoModel<AngledSpringtrapShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledSpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledSpringtrapShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledSpringtrapShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeangled.png");
	}
}
