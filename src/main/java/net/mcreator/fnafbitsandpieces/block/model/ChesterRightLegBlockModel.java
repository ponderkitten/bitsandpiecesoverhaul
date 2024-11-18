package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ChesterRightLegTileEntity;

public class ChesterRightLegBlockModel extends AnimatedGeoModel<ChesterRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChesterRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chesterparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChesterRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chesterparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChesterRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chesterrightleg.png");
	}
}
