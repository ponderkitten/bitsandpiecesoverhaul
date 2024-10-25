package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerBonnieRightArmTileEntity;

public class DinerBonnieRightArmBlockModel extends AnimatedGeoModel<DinerBonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnierightarm.png");
	}
}
