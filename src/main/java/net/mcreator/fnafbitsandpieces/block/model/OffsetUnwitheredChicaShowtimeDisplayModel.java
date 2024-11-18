package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredChicaShowtimeDisplayItem;

public class OffsetUnwitheredChicaShowtimeDisplayModel extends AnimatedGeoModel<OffsetUnwitheredChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicashowtimeoffset.png");
	}
}
