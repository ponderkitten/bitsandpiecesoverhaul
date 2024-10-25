package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerFoxyTorsoTileEntity;

public class DinerFoxyTorsoBlockModel extends AnimatedGeoModel<DinerFoxyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxytorso.png");
	}
}
