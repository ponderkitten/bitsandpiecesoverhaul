package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredGoldenBonnieShowtimeTileEntity;

public class AngledUnwitheredGoldenBonnieShowtimeBlockModel extends AnimatedGeoModel<AngledUnwitheredGoldenBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredGoldenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredGoldenBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonnieshowtimeangled.png");
	}
}
