package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo01LeftLegDisplayItem;

public class Endo01LeftLegDisplayModel extends AnimatedGeoModel<Endo01LeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01LeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/endo01parts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01LeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/endo01parts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01LeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01leftleg.png");
	}
}
