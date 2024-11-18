package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.CindyShowtimeADisplayItem;

public class CindyShowtimeADisplayModel extends AnimatedGeoModel<CindyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CindyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/cindyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/cindyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/cindyshowtime.png");
	}
}
