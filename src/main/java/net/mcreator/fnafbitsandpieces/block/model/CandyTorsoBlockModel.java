package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CandyTorsoTileEntity;

public class CandyTorsoBlockModel extends AnimatedGeoModel<CandyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/candyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/candyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/candytorso.png");
	}
}
