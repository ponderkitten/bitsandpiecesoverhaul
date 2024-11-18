package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FreddyFazbearHeadTileEntity;

public class FreddyFazbearHeadBlockModel extends AnimatedGeoModel<FreddyFazbearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyfazbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyfazbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearHeadTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddyfazbearhead.png");
	}
}