package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledUnwitheredBonnieShowtimeTileEntity;

public class AngledUnwitheredBonnieShowtimeBlockModel extends AnimatedGeoModel<AngledUnwitheredBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledUnwitheredBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledUnwitheredBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledUnwitheredBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonnieshowtimeangled.png");
	}
}
