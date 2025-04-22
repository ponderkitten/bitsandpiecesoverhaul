package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.SpringtrapShowtimeADisplayItem;

public class SpringtrapShowtimeADisplayModel extends AnimatedGeoModel<SpringtrapShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtime.png");
	}
}
