package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredCindyRightLegDisplayItem;

public class WitheredCindyRightLegDisplayModel extends AnimatedGeoModel<WitheredCindyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredCindyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredCindyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredCindyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyrightleg.png");
	}
}
