package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledUnwitheredChicaShowtimeDisplayItem;

public class AngledUnwitheredChicaShowtimeDisplayModel extends AnimatedGeoModel<AngledUnwitheredChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicashowtimeangled.png");
	}
}
