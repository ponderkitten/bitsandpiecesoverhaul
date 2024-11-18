package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerGoldenBonnieShowtimeADisplayItem;

public class OffsetDinerGoldenBonnieShowtimeADisplayModel extends AnimatedGeoModel<OffsetDinerGoldenBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerGoldenBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerGoldenBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerGoldenBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenbonnieoffset.png");
	}
}
