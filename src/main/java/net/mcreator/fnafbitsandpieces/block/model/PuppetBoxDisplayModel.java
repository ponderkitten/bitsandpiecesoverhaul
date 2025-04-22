package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxDisplayItem;

public class PuppetBoxDisplayModel extends AnimatedGeoModel<PuppetBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetinthebox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetinthebox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
