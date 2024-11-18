package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetFredbearShowtimeADisplayItem;

public class OffsetFredbearShowtimeADisplayModel extends AnimatedGeoModel<OffsetFredbearShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFredbearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFredbearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFredbearShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearshowtimeoffset.png");
	}
}
