package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyChicaLeftLegDisplayItem;

public class WitheredToyChicaLeftLegDisplayModel extends AnimatedGeoModel<WitheredToyChicaLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyChicaLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoychicaleftleg.png");
	}
}
