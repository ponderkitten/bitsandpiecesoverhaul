package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo02LeftLegTileEntity;

public class Endo02LeftLegBlockModel extends AnimatedGeoModel<Endo02LeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02LeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerendoparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02LeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerendoparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02LeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo02leftleg.png");
	}
}
