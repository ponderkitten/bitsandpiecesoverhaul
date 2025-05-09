package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerGoldenBonnieShowtimeDisplayItem;

public class OffsetDinerGoldenBonnieShowtimeDisplayModel extends AnimatedGeoModel<OffsetDinerGoldenBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerGoldenBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnieoffset.png");
	}
}
