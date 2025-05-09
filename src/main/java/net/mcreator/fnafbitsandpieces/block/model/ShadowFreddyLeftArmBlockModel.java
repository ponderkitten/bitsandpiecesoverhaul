package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ShadowFreddyLeftArmTileEntity;

public class ShadowFreddyLeftArmBlockModel extends AnimatedGeoModel<ShadowFreddyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowFreddyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/shadowfreddyleftarm.png");
	}
}
