package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FredBearHeadDisplayItem;

public class FredBearHeadDisplayModel extends AnimatedGeoModel<FredBearHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearhead.png");
	}
}
