package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredChesterHeadDisplayItem;

public class WitheredChesterHeadDisplayModel extends AnimatedGeoModel<WitheredChesterHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChesterHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chesterparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChesterHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chesterparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChesterHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchesterhead.png");
	}
}
