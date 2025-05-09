package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo02HeadBonnieTileEntity;

public class Endo02HeadBonnieBlockModel extends AnimatedGeoModel<Endo02HeadBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadBonnieTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadBonnieTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadBonnieTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/bonnieendohead.png");
	}
}
