package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ShadowBonnieRightArmTileEntity;

public class ShadowBonnieRightArmBlockModel extends AnimatedGeoModel<ShadowBonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowBonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/shadowbonnierightarm.png");
	}
}
