package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetFreddyFazbearShowtimeDisplayItem;

public class OffsetFreddyFazbearShowtimeDisplayModel extends AnimatedGeoModel<OffsetFreddyFazbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyFazbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddyfazbearshowtimeoffset.png");
	}
}
