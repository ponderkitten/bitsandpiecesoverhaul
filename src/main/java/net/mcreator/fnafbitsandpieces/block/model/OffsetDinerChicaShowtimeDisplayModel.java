package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerChicaShowtimeDisplayItem;

public class OffsetDinerChicaShowtimeDisplayModel extends AnimatedGeoModel<OffsetDinerChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicashowtimeoffset.png");
	}
}
