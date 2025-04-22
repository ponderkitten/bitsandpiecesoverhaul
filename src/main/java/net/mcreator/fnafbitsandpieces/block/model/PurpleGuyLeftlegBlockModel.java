package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PurpleGuyLeftlegTileEntity;

public class PurpleGuyLeftlegBlockModel extends AnimatedGeoModel<PurpleGuyLeftlegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PurpleGuyLeftlegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/purpleguyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleGuyLeftlegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/purpleguyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleGuyLeftlegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/purpleguyleftleg.png");
	}
}
