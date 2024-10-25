package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerChicaRightArmDisplayItem;

public class DinerChicaRightArmDisplayModel extends AnimatedGeoModel<DinerChicaRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicarightarm.png");
	}
}
