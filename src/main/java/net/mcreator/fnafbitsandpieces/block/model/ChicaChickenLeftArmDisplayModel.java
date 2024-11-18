package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.ChicaChickenLeftArmDisplayItem;

public class ChicaChickenLeftArmDisplayModel extends AnimatedGeoModel<ChicaChickenLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenleftarm.png");
	}
}
