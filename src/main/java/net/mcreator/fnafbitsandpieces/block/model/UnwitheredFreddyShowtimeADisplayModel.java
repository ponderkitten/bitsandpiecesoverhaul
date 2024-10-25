package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredFreddyShowtimeADisplayItem;

public class UnwitheredFreddyShowtimeADisplayModel extends AnimatedGeoModel<UnwitheredFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwithered_freddy.png");
	}
}
