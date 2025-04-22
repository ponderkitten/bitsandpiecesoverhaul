package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Generator3TileEntity;

public class Generator3BlockModel extends AnimatedGeoModel<Generator3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator3TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator3TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator3TileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genmedfuel.png");
	}
}
