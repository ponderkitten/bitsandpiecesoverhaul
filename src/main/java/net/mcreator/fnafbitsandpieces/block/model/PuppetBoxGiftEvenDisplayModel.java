package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxGiftEvenDisplayItem;

public class PuppetBoxGiftEvenDisplayModel extends AnimatedGeoModel<PuppetBoxGiftEvenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxGiftEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxgifteven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxGiftEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxgifteven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxGiftEvenDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
