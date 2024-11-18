package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.BrokenFoxyThePirateRightLegTileEntity;

public class BrokenFoxyThePirateRightLegBlockModel extends AnimatedGeoModel<BrokenFoxyThePirateRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyThePirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyThePirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyThePirateRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/brokenfoxypiraterightleg.png");
	}
}
