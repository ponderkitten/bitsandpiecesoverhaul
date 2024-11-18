package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerGoldenFreddyShowtimeADisplayItem;

public class OffsetDinerGoldenFreddyShowtimeADisplayModel extends AnimatedGeoModel<OffsetDinerGoldenFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerGoldenFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerGoldenFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerGoldenFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyshowtimeoffset.png");
	}
}
