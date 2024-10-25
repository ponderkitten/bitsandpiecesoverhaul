package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerFoxyLeftArmTileEntity;

public class DinerFoxyLeftArmBlockModel extends AnimatedGeoModel<DinerFoxyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfoxyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfoxyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfoxyleftarm.png");
	}
}
