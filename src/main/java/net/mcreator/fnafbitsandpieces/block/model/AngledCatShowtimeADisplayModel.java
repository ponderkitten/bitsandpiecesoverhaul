package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledCatShowtimeADisplayItem;

public class AngledCatShowtimeADisplayModel extends AnimatedGeoModel<AngledCatShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledCatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCatShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCatShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtimeangled.png");
	}
}
