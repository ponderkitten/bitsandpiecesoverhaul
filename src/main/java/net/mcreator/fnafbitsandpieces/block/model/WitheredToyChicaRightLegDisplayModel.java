package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredToyChicaRightLegDisplayItem;

public class WitheredToyChicaRightLegDisplayModel extends AnimatedGeoModel<WitheredToyChicaRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyChicaRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoychicarightleg.png");
	}
}
