package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxWindingTileEntity;

public class PuppetBoxWindingBlockModel extends AnimatedGeoModel<PuppetBoxWindingTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxWindingTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxslowwinding.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxWindingTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxslowwinding.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxWindingTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
