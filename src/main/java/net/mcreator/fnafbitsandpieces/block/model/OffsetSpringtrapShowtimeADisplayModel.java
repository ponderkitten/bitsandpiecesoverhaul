package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetSpringtrapShowtimeADisplayItem;

public class OffsetSpringtrapShowtimeADisplayModel extends AnimatedGeoModel<OffsetSpringtrapShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringtrapShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringtrapShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringtrapShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeoffset.png");
	}
}
