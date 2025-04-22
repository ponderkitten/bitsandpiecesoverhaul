package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ShadowBonnieLeftArmDisplayItem;

public class ShadowBonnieLeftArmDisplayModel extends AnimatedGeoModel<ShadowBonnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShadowBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowBonnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/shadowbonnieleftarm.png");
	}
}
