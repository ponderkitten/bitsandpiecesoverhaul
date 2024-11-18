package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetToyChicaShowtimeADisplayItem;

public class OffsetToyChicaShowtimeADisplayModel extends AnimatedGeoModel<OffsetToyChicaShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyChicaShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeoffset.png");
	}
}
