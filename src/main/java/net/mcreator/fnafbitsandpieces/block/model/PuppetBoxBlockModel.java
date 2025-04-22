package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxTileEntity;

public class PuppetBoxBlockModel extends AnimatedGeoModel<PuppetBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetinthebox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetinthebox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
