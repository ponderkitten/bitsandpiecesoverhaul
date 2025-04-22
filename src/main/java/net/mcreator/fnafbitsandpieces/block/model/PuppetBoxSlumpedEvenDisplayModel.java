package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxSlumpedEvenDisplayItem;

public class PuppetBoxSlumpedEvenDisplayModel extends AnimatedGeoModel<PuppetBoxSlumpedEvenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxSlumpedEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxslumpedeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxSlumpedEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxslumpedeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxSlumpedEvenDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
