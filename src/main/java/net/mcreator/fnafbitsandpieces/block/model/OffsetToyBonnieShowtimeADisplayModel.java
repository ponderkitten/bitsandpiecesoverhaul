package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetToyBonnieShowtimeADisplayItem;

public class OffsetToyBonnieShowtimeADisplayModel extends AnimatedGeoModel<OffsetToyBonnieShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyBonnieShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyBonnieShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toybonnieshowtimeoffset.png");
	}
}
