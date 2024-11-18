package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredChicaShowtimeADisplayItem;

public class OffsetUnwitheredChicaShowtimeADisplayModel extends AnimatedGeoModel<OffsetUnwitheredChicaShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredChicaShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredChicaShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicashowtimeoffset.png");
	}
}
