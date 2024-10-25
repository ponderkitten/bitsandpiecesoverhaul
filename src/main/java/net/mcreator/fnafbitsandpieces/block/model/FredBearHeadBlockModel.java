package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FredBearHeadTileEntity;

public class FredBearHeadBlockModel extends AnimatedGeoModel<FredBearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearhead.png");
	}
}
