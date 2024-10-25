package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredFoxyRightLegTileEntity;

public class UnwitheredFoxyRightLegBlockModel extends AnimatedGeoModel<UnwitheredFoxyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredFoxyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredFoxyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredFoxyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredfoxyrightleg.png");
	}
}
