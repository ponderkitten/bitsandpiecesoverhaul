package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerChicaHeadTileEntity;

public class DinerChicaHeadBlockModel extends AnimatedGeoModel<DinerChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicahead.png");
	}
}
