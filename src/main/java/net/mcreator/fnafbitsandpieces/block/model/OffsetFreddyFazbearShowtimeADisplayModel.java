package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetFreddyFazbearShowtimeADisplayItem;

public class OffsetFreddyFazbearShowtimeADisplayModel extends AnimatedGeoModel<OffsetFreddyFazbearShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyFazbearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyFazbearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyFazbearShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddyfazbearshowtimeoffset.png");
	}
}
