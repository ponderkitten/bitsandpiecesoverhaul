package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledDinerBonnieShowtimeADisplayItem;

public class AngledDinerBonnieShowtimeADisplayModel extends AnimatedGeoModel<AngledDinerBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnieshowtimeangled.png");
	}
}
