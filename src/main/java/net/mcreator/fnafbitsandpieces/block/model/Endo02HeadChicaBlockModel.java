package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo02HeadChicaTileEntity;

public class Endo02HeadChicaBlockModel extends AnimatedGeoModel<Endo02HeadChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadChicaTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicaendohead.png");
	}
}
