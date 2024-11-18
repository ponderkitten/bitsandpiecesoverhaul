package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.Endo01TorsoDisplayItem;

public class Endo01TorsoDisplayModel extends AnimatedGeoModel<Endo01TorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01TorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/endo01parts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01TorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/endo01parts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01TorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01torso.png");
	}
}
