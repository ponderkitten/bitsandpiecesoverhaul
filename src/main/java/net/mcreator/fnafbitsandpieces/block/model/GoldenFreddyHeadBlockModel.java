package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.GoldenFreddyHeadTileEntity;

public class GoldenFreddyHeadBlockModel extends AnimatedGeoModel<GoldenFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldenfreddyhead.png");
	}
}
