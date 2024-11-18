package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetYellowBearShowtimeADisplayItem;

public class OffsetYellowBearShowtimeADisplayModel extends AnimatedGeoModel<OffsetYellowBearShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetYellowBearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetYellowBearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetYellowBearShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowbearshowtimeoffset.png");
	}
}
