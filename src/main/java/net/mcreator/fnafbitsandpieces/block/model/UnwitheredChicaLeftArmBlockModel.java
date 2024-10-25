package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredChicaLeftArmTileEntity;

public class UnwitheredChicaLeftArmBlockModel extends AnimatedGeoModel<UnwitheredChicaLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicaleftarm.png");
	}
}
