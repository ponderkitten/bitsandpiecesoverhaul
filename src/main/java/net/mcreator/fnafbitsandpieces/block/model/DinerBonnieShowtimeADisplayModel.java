package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerBonnieShowtimeADisplayItem;

public class DinerBonnieShowtimeADisplayModel extends AnimatedGeoModel<DinerBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnie.png");
	}
}
