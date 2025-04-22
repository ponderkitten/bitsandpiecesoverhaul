package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledCatShowtimeDisplayItem;

public class AngledCatShowtimeDisplayModel extends AnimatedGeoModel<AngledCatShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledCatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCatShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCatShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtimeangled.png");
	}
}
