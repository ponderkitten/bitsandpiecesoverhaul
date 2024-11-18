package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WitheredChicaRightArmDisplayItem;

public class WitheredChicaRightArmDisplayModel extends AnimatedGeoModel<WitheredChicaRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchicarightarm.png");
	}
}
