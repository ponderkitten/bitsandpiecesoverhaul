package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredFreddyShowtimeADisplayItem;

public class OffsetUnwitheredFreddyShowtimeADisplayModel extends AnimatedGeoModel<OffsetUnwitheredFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfreddyshowtimeoffset.png");
	}
}
