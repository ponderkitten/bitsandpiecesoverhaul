package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.OffsetUnwitheredGoldenBonnieShowtimeTileEntity;

public class OffsetUnwitheredGoldenBonnieShowtimeBlockModel extends AnimatedGeoModel<OffsetUnwitheredGoldenBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetUnwitheredGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetUnwitheredGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetUnwitheredGoldenBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieshowtimeoffset.png");
	}
}
