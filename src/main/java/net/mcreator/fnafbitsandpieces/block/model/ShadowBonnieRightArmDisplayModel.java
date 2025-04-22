package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ShadowBonnieRightArmDisplayItem;

public class ShadowBonnieRightArmDisplayModel extends AnimatedGeoModel<ShadowBonnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShadowBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowBonnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/shadowbonnierightarm.png");
	}
}
