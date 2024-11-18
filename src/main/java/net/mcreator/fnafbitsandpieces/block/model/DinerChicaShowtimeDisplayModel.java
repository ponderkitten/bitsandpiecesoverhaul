package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerChicaShowtimeDisplayItem;

public class DinerChicaShowtimeDisplayModel extends AnimatedGeoModel<DinerChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtime.png");
	}
}
