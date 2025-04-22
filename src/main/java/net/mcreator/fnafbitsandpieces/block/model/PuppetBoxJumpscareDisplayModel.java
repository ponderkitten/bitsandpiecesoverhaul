package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxJumpscareDisplayItem;

public class PuppetBoxJumpscareDisplayModel extends AnimatedGeoModel<PuppetBoxJumpscareDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxjumpscare.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxjumpscare.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxJumpscareDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
