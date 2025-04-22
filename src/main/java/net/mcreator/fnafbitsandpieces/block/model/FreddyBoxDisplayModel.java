package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FreddyBoxDisplayItem;

public class FreddyBoxDisplayModel extends AnimatedGeoModel<FreddyBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
