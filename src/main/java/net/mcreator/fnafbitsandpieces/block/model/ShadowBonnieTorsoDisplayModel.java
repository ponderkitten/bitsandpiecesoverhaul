package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ShadowBonnieTorsoDisplayItem;

public class ShadowBonnieTorsoDisplayModel extends AnimatedGeoModel<ShadowBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShadowBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/shadowbonnietorso.png");
	}
}
