package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledUnwitheredGoldenBonnieShowtimeDisplayItem;

public class AngledUnwitheredGoldenBonnieShowtimeDisplayModel extends AnimatedGeoModel<AngledUnwitheredGoldenBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredGoldenBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredGoldenBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieshowtimeangled.png");
	}
}
