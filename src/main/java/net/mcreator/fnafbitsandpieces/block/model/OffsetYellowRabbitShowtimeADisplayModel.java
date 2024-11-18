package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetYellowRabbitShowtimeADisplayItem;

public class OffsetYellowRabbitShowtimeADisplayModel extends AnimatedGeoModel<OffsetYellowRabbitShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetYellowRabbitShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetYellowRabbitShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetYellowRabbitShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowrabbitshowtimeoffset.png");
	}
}
