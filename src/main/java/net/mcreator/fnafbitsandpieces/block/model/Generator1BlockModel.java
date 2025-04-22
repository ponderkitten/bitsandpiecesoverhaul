package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Generator1TileEntity;

public class Generator1BlockModel extends AnimatedGeoModel<Generator1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator1TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator1TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator1TileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genlowfuel.png");
	}
}
