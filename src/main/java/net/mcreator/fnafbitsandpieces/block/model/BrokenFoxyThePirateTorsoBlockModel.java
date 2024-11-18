package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BrokenFoxyThePirateTorsoTileEntity;

public class BrokenFoxyThePirateTorsoBlockModel extends AnimatedGeoModel<BrokenFoxyThePirateTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypiratetorso.png");
	}
}
