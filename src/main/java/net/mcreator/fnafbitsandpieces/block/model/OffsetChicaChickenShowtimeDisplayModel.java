package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetChicaChickenShowtimeDisplayItem;

public class OffsetChicaChickenShowtimeDisplayModel extends AnimatedGeoModel<OffsetChicaChickenShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetChicaChickenShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtimeoffset.png");
	}
}
