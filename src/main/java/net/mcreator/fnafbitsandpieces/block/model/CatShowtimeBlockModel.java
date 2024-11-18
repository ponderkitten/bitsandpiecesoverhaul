package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CatShowtimeTileEntity;

public class CatShowtimeBlockModel extends AnimatedGeoModel<CatShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtime.png");
	}
}
