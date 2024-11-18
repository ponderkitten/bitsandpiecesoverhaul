package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ChicaChickenShowtimeTileEntity;

public class ChicaChickenShowtimeBlockModel extends AnimatedGeoModel<ChicaChickenShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtime.png");
	}
}
