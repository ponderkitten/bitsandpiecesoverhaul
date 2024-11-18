package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledUnwitheredFreddyShowtimeADisplayItem;

public class AngledUnwitheredFreddyShowtimeADisplayModel extends AnimatedGeoModel<AngledUnwitheredFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfreddyshowtimeangled.png");
	}
}
