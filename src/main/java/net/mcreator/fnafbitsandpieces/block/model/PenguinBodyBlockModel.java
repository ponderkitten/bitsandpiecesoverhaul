package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PenguinBodyTileEntity;

public class PenguinBodyBlockModel extends AnimatedGeoModel<PenguinBodyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PenguinBodyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chestershowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PenguinBodyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chestershowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PenguinBodyTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chestershowtimeangled.png");
	}
}
