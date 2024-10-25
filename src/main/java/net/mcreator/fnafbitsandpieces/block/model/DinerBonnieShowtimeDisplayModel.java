package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerBonnieShowtimeDisplayItem;

public class DinerBonnieShowtimeDisplayModel extends AnimatedGeoModel<DinerBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnie.png");
	}
}
