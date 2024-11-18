package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.GoldenToyFreddyRightLegTileEntity;

public class GoldenToyFreddyRightLegBlockModel extends AnimatedGeoModel<GoldenToyFreddyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenToyFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/toyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenToyFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/toyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenToyFreddyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/goldentoyfreddyrightleg.png");
	}
}
