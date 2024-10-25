package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFoxyLeftLegDisplayItem;

public class DinerFoxyLeftLegDisplayModel extends AnimatedGeoModel<DinerFoxyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyleftleg.png");
	}
}
