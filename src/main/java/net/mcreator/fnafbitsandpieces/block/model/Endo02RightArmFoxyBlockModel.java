package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo02RightArmFoxyTileEntity;

public class Endo02RightArmFoxyBlockModel extends AnimatedGeoModel<Endo02RightArmFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02RightArmFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02RightArmFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02RightArmFoxyTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo02rightarmfoxy.png");
	}
}
