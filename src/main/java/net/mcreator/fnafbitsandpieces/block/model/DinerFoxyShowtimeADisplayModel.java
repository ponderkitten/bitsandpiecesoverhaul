package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.DinerFoxyShowtimeADisplayItem;

public class DinerFoxyShowtimeADisplayModel extends AnimatedGeoModel<DinerFoxyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyshowtime.png");
	}
}
