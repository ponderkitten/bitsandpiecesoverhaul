package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.GoldenToyBonnieRightLegTileEntity;

public class GoldenToyBonnieRightLegBlockModel extends AnimatedGeoModel<GoldenToyBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoybonnierightleg.png");
	}
}