package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledUnwitheredFoxyShowtimeDisplayItem;

public class AngledUnwitheredFoxyShowtimeDisplayModel extends AnimatedGeoModel<AngledUnwitheredFoxyShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredFoxyShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredFoxyShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyshowtimeangled.png");
	}
}
