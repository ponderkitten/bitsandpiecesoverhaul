package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PurpleGuyHeadTileEntity;

public class PurpleGuyHeadBlockModel extends AnimatedGeoModel<PurpleGuyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PurpleGuyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/purpleguyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleGuyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/purpleguyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleGuyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/purpleguyhead.png");
	}
}
