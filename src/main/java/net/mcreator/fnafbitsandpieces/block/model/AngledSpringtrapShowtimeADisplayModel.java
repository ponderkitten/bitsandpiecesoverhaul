package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledSpringtrapShowtimeADisplayItem;

public class AngledSpringtrapShowtimeADisplayModel extends AnimatedGeoModel<AngledSpringtrapShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledSpringtrapShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledSpringtrapShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledSpringtrapShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtrapshowtimeangled.png");
	}
}
