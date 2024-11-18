package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledDinerGoldenBonnieShowtimeDisplayItem;

public class AngledDinerGoldenBonnieShowtimeDisplayModel extends AnimatedGeoModel<AngledDinerGoldenBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerGoldenBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnieangled.png");
	}
}
