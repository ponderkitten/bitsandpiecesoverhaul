package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo02HeadDisplayItem;

public class Endo02HeadDisplayModel extends AnimatedGeoModel<Endo02HeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerendoparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerendoparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo02head.png");
	}
}