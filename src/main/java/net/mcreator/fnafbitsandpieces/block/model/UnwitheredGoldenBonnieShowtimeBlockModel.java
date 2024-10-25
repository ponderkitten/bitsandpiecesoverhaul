package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredGoldenBonnieShowtimeTileEntity;

public class UnwitheredGoldenBonnieShowtimeBlockModel extends AnimatedGeoModel<UnwitheredGoldenBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieshowtime.png");
	}
}
