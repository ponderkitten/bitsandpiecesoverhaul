package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PenguinHeadDisplayItem;

public class PenguinHeadDisplayModel extends AnimatedGeoModel<PenguinHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PenguinHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/penguinhead.png");
	}
}
