package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.YellowBearTorsoDisplayItem;

public class YellowBearTorsoDisplayModel extends AnimatedGeoModel<YellowBearTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowbeartorso.png");
	}
}
