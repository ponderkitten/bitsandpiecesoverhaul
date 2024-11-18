package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerGoldenFreddyTorsoTileEntity;

public class DinerGoldenFreddyTorsoBlockModel extends AnimatedGeoModel<DinerGoldenFreddyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerGoldenFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerGoldenFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerGoldenFreddyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddytorso.png");
	}
}
