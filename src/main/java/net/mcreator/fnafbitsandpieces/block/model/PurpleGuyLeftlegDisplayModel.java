package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PurpleGuyLeftlegDisplayItem;

public class PurpleGuyLeftlegDisplayModel extends AnimatedGeoModel<PurpleGuyLeftlegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PurpleGuyLeftlegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/purpleguyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleGuyLeftlegDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/purpleguyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleGuyLeftlegDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/purpleguyleftleg.png");
	}
}
