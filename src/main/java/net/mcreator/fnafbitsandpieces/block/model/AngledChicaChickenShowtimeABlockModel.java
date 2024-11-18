package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledChicaChickenShowtimeATileEntity;

public class AngledChicaChickenShowtimeABlockModel extends AnimatedGeoModel<AngledChicaChickenShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledChicaChickenShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledChicaChickenShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledChicaChickenShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtimeangled.png");
	}
}
