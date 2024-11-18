package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredFoxyShowtimeATileEntity;

public class UnwitheredFoxyShowtimeABlockModel extends AnimatedGeoModel<UnwitheredFoxyShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFoxyShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFoxyShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyshowtime.png");
	}
}
