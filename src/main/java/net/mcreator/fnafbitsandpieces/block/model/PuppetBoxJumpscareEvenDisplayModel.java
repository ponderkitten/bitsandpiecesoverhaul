package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxJumpscareEvenDisplayItem;

public class PuppetBoxJumpscareEvenDisplayModel extends AnimatedGeoModel<PuppetBoxJumpscareEvenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxJumpscareEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxjumpscareeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxJumpscareEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxjumpscareeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxJumpscareEvenDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
