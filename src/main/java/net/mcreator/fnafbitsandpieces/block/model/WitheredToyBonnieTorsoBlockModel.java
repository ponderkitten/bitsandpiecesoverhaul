package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredToyBonnieTorsoTileEntity;

public class WitheredToyBonnieTorsoBlockModel extends AnimatedGeoModel<WitheredToyBonnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoybonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoybonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyBonnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoybonnietorso.png");
	}
}
