package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledFreddyFazbearShowtimeADisplayItem;

public class AngledFreddyFazbearShowtimeADisplayModel extends AnimatedGeoModel<AngledFreddyFazbearShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledFreddyFazbearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledFreddyFazbearShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledFreddyFazbearShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddyfazbearshowtimeangled.png");
	}
}
