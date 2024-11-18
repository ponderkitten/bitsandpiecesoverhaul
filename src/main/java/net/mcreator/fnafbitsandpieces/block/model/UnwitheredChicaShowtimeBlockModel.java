package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredChicaShowtimeTileEntity;

public class UnwitheredChicaShowtimeBlockModel extends AnimatedGeoModel<UnwitheredChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicashowtime.png");
	}
}
