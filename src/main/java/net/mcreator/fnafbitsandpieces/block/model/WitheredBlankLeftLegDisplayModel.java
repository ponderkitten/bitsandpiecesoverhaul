package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredBlankLeftLegDisplayItem;

public class WitheredBlankLeftLegDisplayModel extends AnimatedGeoModel<WitheredBlankLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBlankLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/blankparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBlankLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/blankparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBlankLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredblankleftleg.png");
	}
}
