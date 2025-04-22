package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxWindingEvenTileEntity;

public class PuppetBoxWindingEvenBlockModel extends AnimatedGeoModel<PuppetBoxWindingEvenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxWindingEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxslowwindingeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxWindingEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxslowwindingeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxWindingEvenTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
