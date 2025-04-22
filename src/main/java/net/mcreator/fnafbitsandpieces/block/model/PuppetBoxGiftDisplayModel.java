package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxGiftDisplayItem;

public class PuppetBoxGiftDisplayModel extends AnimatedGeoModel<PuppetBoxGiftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxGiftDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxgift.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxGiftDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxgift.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxGiftDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
