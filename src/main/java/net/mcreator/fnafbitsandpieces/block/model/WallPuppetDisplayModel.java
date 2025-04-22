package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.WallPuppetDisplayItem;

public class WallPuppetDisplayModel extends AnimatedGeoModel<WallPuppetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WallPuppetDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/wallpuppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallPuppetDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/wallpuppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallPuppetDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/puppet.png");
	}
}
