package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PurpleGuyHeadDisplayItem;

public class PurpleGuyHeadDisplayModel extends AnimatedGeoModel<PurpleGuyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PurpleGuyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/purpleguyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleGuyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/purpleguyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleGuyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/purpleguyhead.png");
	}
}
