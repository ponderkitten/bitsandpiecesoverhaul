package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenFreddyShowtimeADisplayItem;

public class UnwitheredGoldenFreddyShowtimeADisplayModel extends AnimatedGeoModel<UnwitheredGoldenFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddytexture.png");
	}
}
