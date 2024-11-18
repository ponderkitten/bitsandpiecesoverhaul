package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetGoldenToyBonnieShowtimeADisplayItem;

public class OffsetGoldenToyBonnieShowtimeADisplayModel extends AnimatedGeoModel<OffsetGoldenToyBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetGoldenToyBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetGoldenToyBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetGoldenToyBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toychicashowtimeoffset.png");
	}
}
