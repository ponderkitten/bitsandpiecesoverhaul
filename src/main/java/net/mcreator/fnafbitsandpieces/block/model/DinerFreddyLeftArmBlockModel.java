package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerFreddyLeftArmTileEntity;

public class DinerFreddyLeftArmBlockModel extends AnimatedGeoModel<DinerFreddyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerfreddyleftarm.png");
	}
}
