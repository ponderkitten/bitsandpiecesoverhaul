package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredToyBonnieHeadTileEntity;

public class WitheredToyBonnieHeadBlockModel extends AnimatedGeoModel<WitheredToyBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoybonniehead.png");
	}
}
