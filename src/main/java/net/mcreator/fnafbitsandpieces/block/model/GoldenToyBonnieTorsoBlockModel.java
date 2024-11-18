package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.GoldenToyBonnieTorsoTileEntity;

public class GoldenToyBonnieTorsoBlockModel extends AnimatedGeoModel<GoldenToyBonnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyBonnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoybonnietorso.png");
	}
}
