package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredBonnieShowtimeTileEntity;

public class UnwitheredBonnieShowtimeBlockModel extends AnimatedGeoModel<UnwitheredBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwithered_bonnie.png");
	}
}
