package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetRatShowtimeADisplayItem;

public class OffsetRatShowtimeADisplayModel extends AnimatedGeoModel<OffsetRatShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetRatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetRatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetRatShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtimeoffset.png");
	}
}
