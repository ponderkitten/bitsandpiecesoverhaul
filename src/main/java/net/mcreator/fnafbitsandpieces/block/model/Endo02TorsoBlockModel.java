package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo02TorsoTileEntity;

public class Endo02TorsoBlockModel extends AnimatedGeoModel<Endo02TorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02TorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerendoparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02TorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerendoparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02TorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo02torso.png");
	}
}
