package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenBonnieShowtimeDisplayItem;

public class UnwitheredGoldenBonnieShowtimeDisplayModel extends AnimatedGeoModel<UnwitheredGoldenBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieshowtime.png");
	}
}
