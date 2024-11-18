package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo02RightArmTileEntity;

public class Endo02RightArmBlockModel extends AnimatedGeoModel<Endo02RightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerendoparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerendoparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02RightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo02rightarm.png");
	}
}
