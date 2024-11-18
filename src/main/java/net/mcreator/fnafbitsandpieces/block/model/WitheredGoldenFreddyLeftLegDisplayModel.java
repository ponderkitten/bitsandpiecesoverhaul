package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredGoldenFreddyLeftLegDisplayItem;

public class WitheredGoldenFreddyLeftLegDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredgoldenfreddyleftleg.png");
	}
}
