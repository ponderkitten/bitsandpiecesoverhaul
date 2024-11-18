package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledDinerFoxyShowtimeADisplayItem;

public class AngledDinerFoxyShowtimeADisplayModel extends AnimatedGeoModel<AngledDinerFoxyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledDinerFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledDinerFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledDinerFoxyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtimeangled.png");
	}
}
