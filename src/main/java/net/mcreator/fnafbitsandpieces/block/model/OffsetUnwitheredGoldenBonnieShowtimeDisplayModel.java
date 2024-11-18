package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredGoldenBonnieShowtimeDisplayItem;

public class OffsetUnwitheredGoldenBonnieShowtimeDisplayModel extends AnimatedGeoModel<OffsetUnwitheredGoldenBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredGoldenBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieshowtimeoffset.png");
	}
}
