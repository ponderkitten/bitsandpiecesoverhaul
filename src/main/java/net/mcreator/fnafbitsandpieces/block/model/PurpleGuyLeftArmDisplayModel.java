package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PurpleGuyLeftArmDisplayItem;

public class PurpleGuyLeftArmDisplayModel extends AnimatedGeoModel<PurpleGuyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PurpleGuyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/purpleguyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleGuyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/purpleguyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleGuyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/purpleguyleftarm.png");
	}
}
