package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledDinerGoldenFreddyShowtimeDisplayItem;

public class AngledDinerGoldenFreddyShowtimeDisplayModel extends AnimatedGeoModel<AngledDinerGoldenFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerGoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerGoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerGoldenFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyshowtimeangled.png");
	}
}
