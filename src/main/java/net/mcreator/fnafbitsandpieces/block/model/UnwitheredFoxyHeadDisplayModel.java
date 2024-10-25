package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredFoxyHeadDisplayItem;

public class UnwitheredFoxyHeadDisplayModel extends AnimatedGeoModel<UnwitheredFoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyhead.png");
	}
}
