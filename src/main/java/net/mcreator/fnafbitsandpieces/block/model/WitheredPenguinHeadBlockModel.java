package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredPenguinHeadTileEntity;

public class WitheredPenguinHeadBlockModel extends AnimatedGeoModel<WitheredPenguinHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredPenguinHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredPenguinHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredPenguinHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredpenguinhead.png");
	}
}
