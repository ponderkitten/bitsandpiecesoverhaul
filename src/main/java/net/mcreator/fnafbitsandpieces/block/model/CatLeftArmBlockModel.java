package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CatLeftArmTileEntity;

public class CatLeftArmBlockModel extends AnimatedGeoModel<CatLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CatLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatleftarm.png");
	}
}
