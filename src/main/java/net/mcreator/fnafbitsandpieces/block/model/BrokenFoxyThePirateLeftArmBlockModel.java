package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BrokenFoxyThePirateLeftArmTileEntity;

public class BrokenFoxyThePirateLeftArmBlockModel extends AnimatedGeoModel<BrokenFoxyThePirateLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypirateleftarm.png");
	}
}
