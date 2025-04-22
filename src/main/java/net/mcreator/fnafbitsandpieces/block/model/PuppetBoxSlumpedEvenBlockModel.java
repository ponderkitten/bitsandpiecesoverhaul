package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxSlumpedEvenTileEntity;

public class PuppetBoxSlumpedEvenBlockModel extends AnimatedGeoModel<PuppetBoxSlumpedEvenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxSlumpedEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxslumpedeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxSlumpedEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxslumpedeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxSlumpedEvenTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
