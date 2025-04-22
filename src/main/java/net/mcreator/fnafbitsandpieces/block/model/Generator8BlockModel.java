package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Generator8TileEntity;

public class Generator8BlockModel extends AnimatedGeoModel<Generator8TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator8TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator8.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator8TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator8.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator8TileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genhighfuel.png");
	}
}
