package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FreddyBoxSpinDisplayItem;

public class FreddyBoxSpinDisplayModel extends AnimatedGeoModel<FreddyBoxSpinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxSpinDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyboxspin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxSpinDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyboxspin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxSpinDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
