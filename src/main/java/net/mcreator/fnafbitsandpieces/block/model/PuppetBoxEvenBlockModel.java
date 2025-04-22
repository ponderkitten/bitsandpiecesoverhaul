package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxEvenTileEntity;

public class PuppetBoxEvenBlockModel extends AnimatedGeoModel<PuppetBoxEvenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetintheboxeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetintheboxeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxEvenTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
