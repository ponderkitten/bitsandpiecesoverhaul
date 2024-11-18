package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetCatShowtimeADisplayItem;

public class OffsetCatShowtimeADisplayModel extends AnimatedGeoModel<OffsetCatShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetCatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetCatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetCatShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtimeoffset.png");
	}
}
