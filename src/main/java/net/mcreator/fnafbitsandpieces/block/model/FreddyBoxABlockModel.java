package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.FreddyBoxATileEntity;

public class FreddyBoxABlockModel extends AnimatedGeoModel<FreddyBoxATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/freddyboxactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/freddyboxactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/freddybox.png");
	}
}
