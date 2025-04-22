package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxSlumpedDisplayItem;

public class PuppetBoxSlumpedDisplayModel extends AnimatedGeoModel<PuppetBoxSlumpedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxSlumpedDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxslumped.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxSlumpedDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxslumped.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxSlumpedDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
