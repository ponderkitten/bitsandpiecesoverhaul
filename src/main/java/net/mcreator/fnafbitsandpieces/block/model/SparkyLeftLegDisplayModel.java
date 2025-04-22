package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SparkyLeftLegDisplayItem;

public class SparkyLeftLegDisplayModel extends AnimatedGeoModel<SparkyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SparkyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/sparkyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SparkyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/sparkyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SparkyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/sparkyleftleg.png");
	}
}
