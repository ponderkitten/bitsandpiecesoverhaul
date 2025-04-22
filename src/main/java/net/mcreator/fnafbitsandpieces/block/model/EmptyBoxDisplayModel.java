package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.EmptyBoxDisplayItem;

public class EmptyBoxDisplayModel extends AnimatedGeoModel<EmptyBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/emptybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/emptybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyBoxDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
