package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledChicaChickenShowtimeTileEntity;

public class AngledChicaChickenShowtimeBlockModel extends AnimatedGeoModel<AngledChicaChickenShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledChicaChickenShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledChicaChickenShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledChicaChickenShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenshowtimeangled.png");
	}
}
