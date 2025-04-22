package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredToyFreddyRightLegTileEntity;

public class WitheredToyFreddyRightLegBlockModel extends AnimatedGeoModel<WitheredToyFreddyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyFreddyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoyfreddyrightleg.png");
	}
}
