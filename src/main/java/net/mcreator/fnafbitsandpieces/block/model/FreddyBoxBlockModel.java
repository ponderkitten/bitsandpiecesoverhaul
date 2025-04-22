package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FreddyBoxTileEntity;

public class FreddyBoxBlockModel extends AnimatedGeoModel<FreddyBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
