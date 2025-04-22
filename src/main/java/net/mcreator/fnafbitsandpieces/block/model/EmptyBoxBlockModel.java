package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.EmptyBoxTileEntity;

public class EmptyBoxBlockModel extends AnimatedGeoModel<EmptyBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EmptyBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/emptybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/emptybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyBoxTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
