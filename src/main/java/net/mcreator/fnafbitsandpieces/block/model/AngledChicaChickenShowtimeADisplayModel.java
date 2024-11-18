package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.AngledChicaChickenShowtimeADisplayItem;

public class AngledChicaChickenShowtimeADisplayModel extends AnimatedGeoModel<AngledChicaChickenShowtimeADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledChicaChickenShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledChicaChickenShowtimeADisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledChicaChickenShowtimeADisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtimeangled.png");
	}
}
