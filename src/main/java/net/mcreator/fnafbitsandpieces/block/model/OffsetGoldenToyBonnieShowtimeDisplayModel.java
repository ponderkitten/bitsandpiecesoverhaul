package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetGoldenToyBonnieShowtimeDisplayItem;

public class OffsetGoldenToyBonnieShowtimeDisplayModel extends AnimatedGeoModel<OffsetGoldenToyBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenToyBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeoffset.png");
	}
}
