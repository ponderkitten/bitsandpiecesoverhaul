package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.SparkyTorsoTileEntity;

public class SparkyTorsoBlockModel extends AnimatedGeoModel<SparkyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SparkyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/sparkyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SparkyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/sparkyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SparkyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/sparkytorso.png");
	}
}
