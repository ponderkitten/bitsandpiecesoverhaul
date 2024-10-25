package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredFoxytorsoDisplayItem;

public class UnwitheredFoxytorsoDisplayModel extends AnimatedGeoModel<UnwitheredFoxytorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFoxytorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFoxytorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFoxytorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxytorso.png");
	}
}
