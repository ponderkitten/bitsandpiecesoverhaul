package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo01RightLegDisplayItem;

public class Endo01RightLegDisplayModel extends AnimatedGeoModel<Endo01RightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/endo01parts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/endo01parts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01rightleg.png");
	}
}
