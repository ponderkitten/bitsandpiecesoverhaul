package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ShadowFreddyTorsoDisplayItem;

public class ShadowFreddyTorsoDisplayModel extends AnimatedGeoModel<ShadowFreddyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShadowFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowFreddyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/shadowfreddytorso.png");
	}
}
