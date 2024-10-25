package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredBonnieLeftLegDisplayItem;

public class UnwitheredBonnieLeftLegDisplayModel extends AnimatedGeoModel<UnwitheredBonnieLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredBonnieLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonnieleftleg.png");
	}
}
