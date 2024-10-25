package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerBonnieLeftArmTileEntity;

public class DinerBonnieLeftArmBlockModel extends AnimatedGeoModel<DinerBonnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnieleftarm.png");
	}
}
