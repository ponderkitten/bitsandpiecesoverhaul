package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetCindyShowtimeDisplayItem;

public class OffsetCindyShowtimeDisplayModel extends AnimatedGeoModel<OffsetCindyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCindyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCindyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCindyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtimeoffset.png");
	}
}
