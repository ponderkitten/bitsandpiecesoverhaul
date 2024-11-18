package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredChesterTorsoTileEntity;

public class WitheredChesterTorsoBlockModel extends AnimatedGeoModel<WitheredChesterTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChesterTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chesterparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChesterTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chesterparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChesterTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredchestertorso.png");
	}
}