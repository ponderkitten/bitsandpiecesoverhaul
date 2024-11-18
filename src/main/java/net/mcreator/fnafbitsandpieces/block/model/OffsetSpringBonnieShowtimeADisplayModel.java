package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetSpringBonnieShowtimeADisplayItem;

public class OffsetSpringBonnieShowtimeADisplayModel extends AnimatedGeoModel<OffsetSpringBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springbonnieshowtimeoffset.png");
	}
}