package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ToyBonnieRightLegTileEntity;

public class ToyBonnieRightLegBlockModel extends AnimatedGeoModel<ToyBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/toybonnierightleg.png");
	}
}
