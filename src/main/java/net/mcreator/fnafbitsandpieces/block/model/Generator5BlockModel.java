package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Generator5TileEntity;

public class Generator5BlockModel extends AnimatedGeoModel<Generator5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator5TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator5TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator5TileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genmedfuel.png");
	}
}
