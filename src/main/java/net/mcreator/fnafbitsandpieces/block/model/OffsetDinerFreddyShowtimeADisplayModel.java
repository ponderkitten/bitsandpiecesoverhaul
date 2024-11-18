package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetDinerFreddyShowtimeADisplayItem;

public class OffsetDinerFreddyShowtimeADisplayModel extends AnimatedGeoModel<OffsetDinerFreddyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetDinerFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetDinerFreddyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetDinerFreddyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyshowtimeoffset.png");
	}
}
