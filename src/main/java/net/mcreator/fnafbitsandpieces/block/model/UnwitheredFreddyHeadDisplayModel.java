package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredFreddyHeadDisplayItem;

public class UnwitheredFreddyHeadDisplayModel extends AnimatedGeoModel<UnwitheredFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFreddyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfreddyhead.png");
	}
}
