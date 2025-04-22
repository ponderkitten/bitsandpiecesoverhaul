package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxGiftTileEntity;

public class PuppetBoxGiftBlockModel extends AnimatedGeoModel<PuppetBoxGiftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxGiftTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxgift.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxGiftTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxgift.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxGiftTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
