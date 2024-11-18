package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledUnwitheredFoxyShowtimeADisplayItem;

public class AngledUnwitheredFoxyShowtimeADisplayModel extends AnimatedGeoModel<AngledUnwitheredFoxyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredFoxyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyshowtimeangled.png");
	}
}
