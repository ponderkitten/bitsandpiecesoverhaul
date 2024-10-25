package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredBonnieHeadTileEntity;

public class UnwitheredBonnieHeadBlockModel extends AnimatedGeoModel<UnwitheredBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonniehead.png");
	}
}
