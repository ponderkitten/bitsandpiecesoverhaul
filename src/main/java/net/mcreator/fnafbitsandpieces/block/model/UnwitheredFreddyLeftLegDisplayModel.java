package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredFreddyLeftLegDisplayItem;

public class UnwitheredFreddyLeftLegDisplayModel extends AnimatedGeoModel<UnwitheredFreddyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFreddyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfreddyleftleg.png");
	}
}
