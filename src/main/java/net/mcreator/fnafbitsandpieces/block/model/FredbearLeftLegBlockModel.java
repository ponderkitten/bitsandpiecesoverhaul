package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FredbearLeftLegTileEntity;

public class FredbearLeftLegBlockModel extends AnimatedGeoModel<FredbearLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/fredbearparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/fredbearparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fredbearleftleg.png");
	}
}
