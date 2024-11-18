package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo01HeadFoxyTileEntity;

public class Endo01HeadFoxyBlockModel extends AnimatedGeoModel<Endo01HeadFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadFoxyTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01headfoxy.png");
	}
}
