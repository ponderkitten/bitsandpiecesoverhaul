package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Generator4TileEntity;

public class Generator4BlockModel extends AnimatedGeoModel<Generator4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator4TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/generator4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator4TileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/generator4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator4TileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/genmedfuel.png");
	}
}
