package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredFoxyLeftLegDisplayItem;

public class UnwitheredFoxyLeftLegDisplayModel extends AnimatedGeoModel<UnwitheredFoxyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFoxyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyleftleg.png");
	}
}
