package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredChesterRightLegDisplayItem;

public class WitheredChesterRightLegDisplayModel extends AnimatedGeoModel<WitheredChesterRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChesterRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chesterparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChesterRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chesterparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChesterRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchesterrightleg.png");
	}
}
