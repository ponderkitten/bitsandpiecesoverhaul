package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SpringtrapRightArmTileEntity;

public class SpringtrapRightArmBlockModel extends AnimatedGeoModel<SpringtrapRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/springtrapparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/springtrapparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/springtraprightarm.png");
	}
}
