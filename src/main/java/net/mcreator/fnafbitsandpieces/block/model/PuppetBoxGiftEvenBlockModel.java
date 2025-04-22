package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxGiftEvenTileEntity;

public class PuppetBoxGiftEvenBlockModel extends AnimatedGeoModel<PuppetBoxGiftEvenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxGiftEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxgifteven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxGiftEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxgifteven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxGiftEvenTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
