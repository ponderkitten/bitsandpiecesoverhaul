package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledCandyShowtimeDisplayItem;

public class AngledCandyShowtimeDisplayModel extends AnimatedGeoModel<AngledCandyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledCandyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCandyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCandyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtimeangled.png");
	}
}
