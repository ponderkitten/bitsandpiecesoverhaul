package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledUnwitheredBonnieShowtimeDisplayItem;

public class AngledUnwitheredBonnieShowtimeDisplayModel extends AnimatedGeoModel<AngledUnwitheredBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonnieshowtimeangled.png");
	}
}
