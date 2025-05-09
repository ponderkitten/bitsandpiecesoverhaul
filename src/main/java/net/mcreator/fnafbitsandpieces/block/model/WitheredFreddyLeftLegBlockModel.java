package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredFreddyLeftLegTileEntity;

public class WitheredFreddyLeftLegBlockModel extends AnimatedGeoModel<WitheredFreddyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredfreddyleftleg.png");
	}
}
