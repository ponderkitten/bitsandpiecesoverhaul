package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredGoldenFreddyRightLegTileEntity;

public class UnwitheredGoldenFreddyRightLegBlockModel extends AnimatedGeoModel<UnwitheredGoldenFreddyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenFreddyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddyrightleg.png");
	}
}
