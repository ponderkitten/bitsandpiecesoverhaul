package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredBonnieShowtimeDisplayItem;

public class OffsetUnwitheredBonnieShowtimeDisplayModel extends AnimatedGeoModel<OffsetUnwitheredBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonnieshowtimeoffset.png");
	}
}
