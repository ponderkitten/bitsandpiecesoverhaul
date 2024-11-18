package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.OffsetChicaChickenShowtimeADisplayItem;

public class OffsetChicaChickenShowtimeADisplayModel extends AnimatedGeoModel<OffsetChicaChickenShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetChicaChickenShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetChicaChickenShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetChicaChickenShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtimeoffset.png");
	}
}
