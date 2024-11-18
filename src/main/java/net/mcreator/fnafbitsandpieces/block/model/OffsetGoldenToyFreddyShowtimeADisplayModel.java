package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetGoldenToyFreddyShowtimeADisplayItem;

public class OffsetGoldenToyFreddyShowtimeADisplayModel extends AnimatedGeoModel<OffsetGoldenToyFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenToyFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenToyFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenToyFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyshowtimeoffset.png");
	}
}
