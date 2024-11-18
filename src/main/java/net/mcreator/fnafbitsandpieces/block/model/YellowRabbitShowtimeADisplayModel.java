package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.YellowRabbitShowtimeADisplayItem;

public class YellowRabbitShowtimeADisplayModel extends AnimatedGeoModel<YellowRabbitShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(YellowRabbitShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowRabbitShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowRabbitShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowrabbitshowtime.png");
	}
}
