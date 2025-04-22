package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyChicaTorsoDisplayItem;

public class WitheredToyChicaTorsoDisplayModel extends AnimatedGeoModel<WitheredToyChicaTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyChicaTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoychicatorso.png");
	}
}
