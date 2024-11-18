package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ChicaChickenShowtimeADisplayItem;

public class ChicaChickenShowtimeADisplayModel extends AnimatedGeoModel<ChicaChickenShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtime.png");
	}
}
