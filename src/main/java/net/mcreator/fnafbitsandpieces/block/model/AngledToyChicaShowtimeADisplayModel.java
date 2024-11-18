package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledToyChicaShowtimeADisplayItem;

public class AngledToyChicaShowtimeADisplayModel extends AnimatedGeoModel<AngledToyChicaShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toychicashowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toychicashowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyChicaShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeangled.png");
	}
}
