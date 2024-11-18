package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ToyChicaShowtimeADisplayItem;

public class ToyChicaShowtimeADisplayModel extends AnimatedGeoModel<ToyChicaShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtime.png");
	}
}
