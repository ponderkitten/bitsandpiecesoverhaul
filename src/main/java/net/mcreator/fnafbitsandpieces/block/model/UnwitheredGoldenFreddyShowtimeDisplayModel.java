package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenFreddyShowtimeDisplayItem;

public class UnwitheredGoldenFreddyShowtimeDisplayModel extends AnimatedGeoModel<UnwitheredGoldenFreddyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenFreddyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenFreddyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddytexture.png");
	}
}
