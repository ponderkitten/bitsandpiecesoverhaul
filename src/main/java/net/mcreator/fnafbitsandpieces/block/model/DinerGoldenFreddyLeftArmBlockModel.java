package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerGoldenFreddyLeftArmTileEntity;

public class DinerGoldenFreddyLeftArmBlockModel extends AnimatedGeoModel<DinerGoldenFreddyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerGoldenFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerGoldenFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerGoldenFreddyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinergoldenfreddyleftarm.png");
	}
}