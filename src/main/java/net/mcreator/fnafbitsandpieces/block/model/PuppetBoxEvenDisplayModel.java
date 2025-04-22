package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxEvenDisplayItem;

public class PuppetBoxEvenDisplayModel extends AnimatedGeoModel<PuppetBoxEvenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetintheboxeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetintheboxeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxEvenDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
