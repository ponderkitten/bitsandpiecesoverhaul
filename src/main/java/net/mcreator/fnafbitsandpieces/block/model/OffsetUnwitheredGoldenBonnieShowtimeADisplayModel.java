package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetUnwitheredGoldenBonnieShowtimeADisplayItem;

public class OffsetUnwitheredGoldenBonnieShowtimeADisplayModel extends AnimatedGeoModel<OffsetUnwitheredGoldenBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredGoldenBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredGoldenBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredGoldenBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieshowtimeoffset.png");
	}
}
