package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredCatHeadDisplayItem;

public class WitheredCatHeadDisplayModel extends AnimatedGeoModel<WitheredCatHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredCatHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredCatHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredCatHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredcathead.png");
	}
}
