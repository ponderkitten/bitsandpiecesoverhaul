package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.PuppetBoxWindingEvenDisplayItem;

public class PuppetBoxWindingEvenDisplayModel extends AnimatedGeoModel<PuppetBoxWindingEvenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxWindingEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/puppetboxslowwindingeven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxWindingEvenDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/puppetboxslowwindingeven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxWindingEvenDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/jackintheboxpurpler.png");
	}
}
