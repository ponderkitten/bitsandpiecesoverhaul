package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxSlumpedTileEntity;

public class PuppetBoxSlumpedBlockModel extends AnimatedGeoModel<PuppetBoxSlumpedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxSlumpedTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxslumped.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxSlumpedTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxslumped.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxSlumpedTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
