package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredOldCandyLeftLegDisplayItem;

public class WitheredOldCandyLeftLegDisplayModel extends AnimatedGeoModel<WitheredOldCandyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredOldCandyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/oldcandyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredOldCandyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/oldcandyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredOldCandyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredoldcandyleftleg.png");
	}
}
