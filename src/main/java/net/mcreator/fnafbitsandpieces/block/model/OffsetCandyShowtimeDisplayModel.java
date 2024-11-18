package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetCandyShowtimeDisplayItem;

public class OffsetCandyShowtimeDisplayModel extends AnimatedGeoModel<OffsetCandyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCandyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCandyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCandyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtimeoffset.png");
	}
}
