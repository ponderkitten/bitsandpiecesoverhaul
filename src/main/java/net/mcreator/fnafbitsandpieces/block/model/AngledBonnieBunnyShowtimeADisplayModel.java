package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledBonnieBunnyShowtimeADisplayItem;

public class AngledBonnieBunnyShowtimeADisplayModel extends AnimatedGeoModel<AngledBonnieBunnyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledBonnieBunnyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledBonnieBunnyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledBonnieBunnyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonniebunnyshowtimeangled.png");
	}
}
