package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledRatShowtimeADisplayItem;

public class AngledRatShowtimeADisplayModel extends AnimatedGeoModel<AngledRatShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledRatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/ratshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledRatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/ratshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledRatShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/ratshowtimeangled.png");
	}
}
