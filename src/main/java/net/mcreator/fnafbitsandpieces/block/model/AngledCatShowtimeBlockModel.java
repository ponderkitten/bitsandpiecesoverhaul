package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.AngledCatShowtimeTileEntity;

public class AngledCatShowtimeBlockModel extends AnimatedGeoModel<AngledCatShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledCatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledCatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledCatShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtimeangled.png");
	}
}
