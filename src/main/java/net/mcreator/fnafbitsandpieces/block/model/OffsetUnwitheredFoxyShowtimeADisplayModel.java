package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredFoxyShowtimeADisplayItem;

public class OffsetUnwitheredFoxyShowtimeADisplayModel extends AnimatedGeoModel<OffsetUnwitheredFoxyShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredFoxyShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredFoxyShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyshowtimeoffset.png");
	}
}
