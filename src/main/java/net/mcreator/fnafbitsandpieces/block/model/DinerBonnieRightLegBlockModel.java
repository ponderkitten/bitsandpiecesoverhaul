package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerBonnieRightLegTileEntity;

public class DinerBonnieRightLegBlockModel extends AnimatedGeoModel<DinerBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerbonnierightleg.png");
	}
}
