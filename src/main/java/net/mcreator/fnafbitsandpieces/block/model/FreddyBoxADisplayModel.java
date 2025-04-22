package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FreddyBoxADisplayItem;

public class FreddyBoxADisplayModel extends AnimatedGeoModel<FreddyBoxADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyboxactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyboxactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
