package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledPenguinShowtimeADisplayItem;

public class AngledPenguinShowtimeADisplayModel extends AnimatedGeoModel<AngledPenguinShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledPenguinShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledPenguinShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledPenguinShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinshowtimeangled.png");
	}
}
