package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledCandyShowtimeADisplayItem;

public class AngledCandyShowtimeADisplayModel extends AnimatedGeoModel<AngledCandyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledCandyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCandyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCandyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtimeangled.png");
	}
}
