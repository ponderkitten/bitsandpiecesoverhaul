package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredToyFreddyLeftLegTileEntity;

public class WitheredToyFreddyLeftLegBlockModel extends AnimatedGeoModel<WitheredToyFreddyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyFreddyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoyfreddyleftleg.png");
	}
}
