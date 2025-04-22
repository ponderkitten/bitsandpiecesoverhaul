package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.PuppetBoxJumpscareEvenTileEntity;

public class PuppetBoxJumpscareEvenBlockModel extends AnimatedGeoModel<PuppetBoxJumpscareEvenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxJumpscareEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxjumpscareeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxJumpscareEvenTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxjumpscareeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxJumpscareEvenTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
