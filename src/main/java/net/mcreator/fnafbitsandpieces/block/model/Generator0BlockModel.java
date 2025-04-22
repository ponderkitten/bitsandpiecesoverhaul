package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Generator0TileEntity;

public class Generator0BlockModel extends AnimatedGeoModel<Generator0TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator0TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator0TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator0TileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/generator.png");
	}
}
