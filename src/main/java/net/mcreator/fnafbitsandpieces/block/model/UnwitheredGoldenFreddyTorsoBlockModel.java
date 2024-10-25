package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredGoldenFreddyTorsoTileEntity;

public class UnwitheredGoldenFreddyTorsoBlockModel extends AnimatedGeoModel<UnwitheredGoldenFreddyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenFreddyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenfreddytorso.png");
	}
}
