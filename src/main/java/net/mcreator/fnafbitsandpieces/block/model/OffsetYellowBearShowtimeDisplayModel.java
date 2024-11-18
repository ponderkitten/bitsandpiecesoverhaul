package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetYellowBearShowtimeDisplayItem;

public class OffsetYellowBearShowtimeDisplayModel extends AnimatedGeoModel<OffsetYellowBearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetYellowBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetYellowBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetYellowBearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowbearshowtimeoffset.png");
	}
}
