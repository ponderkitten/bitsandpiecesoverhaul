package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredGoldenFreddyShowtimeDisplayItem;

public class OffsetUnwitheredGoldenFreddyShowtimeDisplayModel extends AnimatedGeoModel<OffsetUnwitheredGoldenFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredGoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredGoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredGoldenFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddyshowtimeoffset.png");
	}
}
