package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledDinerBonnieShowtimeDisplayItem;

public class AngledDinerBonnieShowtimeDisplayModel extends AnimatedGeoModel<AngledDinerBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnieshowtimeangled.png");
	}
}
