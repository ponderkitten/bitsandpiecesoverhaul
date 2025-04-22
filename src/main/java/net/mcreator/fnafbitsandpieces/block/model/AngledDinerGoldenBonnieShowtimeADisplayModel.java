package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledDinerGoldenBonnieShowtimeADisplayItem;

public class AngledDinerGoldenBonnieShowtimeADisplayModel extends AnimatedGeoModel<AngledDinerGoldenBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerGoldenBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerGoldenBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerGoldenBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnieangled.png");
	}
}
