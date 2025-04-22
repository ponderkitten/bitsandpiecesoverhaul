package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WallPuppetTileEntity;

public class WallPuppetBlockModel extends AnimatedGeoModel<WallPuppetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WallPuppetTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/wallpuppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallPuppetTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/wallpuppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallPuppetTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/puppet.png");
	}
}
