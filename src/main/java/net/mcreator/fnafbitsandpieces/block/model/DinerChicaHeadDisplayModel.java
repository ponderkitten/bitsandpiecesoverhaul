package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerChicaHeadDisplayItem;

public class DinerChicaHeadDisplayModel extends AnimatedGeoModel<DinerChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicahead.png");
	}
}
