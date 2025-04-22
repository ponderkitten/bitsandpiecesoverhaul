package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SparkyLeftLegTileEntity;

public class SparkyLeftLegBlockModel extends AnimatedGeoModel<SparkyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SparkyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/sparkyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SparkyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/sparkyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SparkyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/sparkyleftleg.png");
	}
}
