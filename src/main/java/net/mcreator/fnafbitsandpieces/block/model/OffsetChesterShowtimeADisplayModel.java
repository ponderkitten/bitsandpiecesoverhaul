package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetChesterShowtimeADisplayItem;

public class OffsetChesterShowtimeADisplayModel extends AnimatedGeoModel<OffsetChesterShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetChesterShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetChesterShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetChesterShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtimeoffset.png");
	}
}
