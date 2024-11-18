package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetFredbearShowtimeDisplayItem;

public class OffsetFredbearShowtimeDisplayModel extends AnimatedGeoModel<OffsetFredbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFredbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearshowtimeoffset.png");
	}
}
