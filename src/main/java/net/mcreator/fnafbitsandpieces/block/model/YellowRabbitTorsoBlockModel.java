package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.YellowRabbitTorsoTileEntity;

public class YellowRabbitTorsoBlockModel extends AnimatedGeoModel<YellowRabbitTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowRabbitTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/bonniebunnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowRabbitTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/bonniebunnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowRabbitTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/yellowrabbittorso.png");
	}
}
