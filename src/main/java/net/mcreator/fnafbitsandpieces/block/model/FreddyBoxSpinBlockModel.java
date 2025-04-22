package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FreddyBoxSpinTileEntity;

public class FreddyBoxSpinBlockModel extends AnimatedGeoModel<FreddyBoxSpinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxSpinTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyboxspin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxSpinTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyboxspin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxSpinTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
