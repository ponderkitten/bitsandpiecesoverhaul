package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerBonnieLeftLegTileEntity;

public class DinerBonnieLeftLegBlockModel extends AnimatedGeoModel<DinerBonnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnieleftleg.png");
	}
}
