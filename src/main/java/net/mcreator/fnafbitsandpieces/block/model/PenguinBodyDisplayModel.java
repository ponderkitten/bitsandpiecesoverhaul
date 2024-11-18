package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PenguinBodyDisplayItem;

public class PenguinBodyDisplayModel extends AnimatedGeoModel<PenguinBodyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PenguinBodyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinBodyDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinBodyDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtimeangled.png");
	}
}
