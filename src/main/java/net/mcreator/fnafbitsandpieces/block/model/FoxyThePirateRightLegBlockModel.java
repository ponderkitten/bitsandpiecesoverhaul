package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FoxyThePirateRightLegTileEntity;

public class FoxyThePirateRightLegBlockModel extends AnimatedGeoModel<FoxyThePirateRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypiraterightleg.png");
	}
}
