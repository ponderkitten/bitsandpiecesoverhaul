package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PenguinShowtimeADisplayItem;

public class PenguinShowtimeADisplayModel extends AnimatedGeoModel<PenguinShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PenguinShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtime.png");
	}
}
