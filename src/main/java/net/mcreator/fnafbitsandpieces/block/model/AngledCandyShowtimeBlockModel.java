package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledCandyShowtimeTileEntity;

public class AngledCandyShowtimeBlockModel extends AnimatedGeoModel<AngledCandyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledCandyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCandyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCandyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candyshowtimeangled.png");
	}
}
