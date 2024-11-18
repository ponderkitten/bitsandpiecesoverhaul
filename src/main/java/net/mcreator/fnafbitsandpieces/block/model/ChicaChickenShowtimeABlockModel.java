package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ChicaChickenShowtimeATileEntity;

public class ChicaChickenShowtimeABlockModel extends AnimatedGeoModel<ChicaChickenShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtime.png");
	}
}
