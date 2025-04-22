package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.FoxyThePirateHeadDisplayItem;

public class FoxyThePirateHeadDisplayModel extends AnimatedGeoModel<FoxyThePirateHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyThePirateHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/foxypirateparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyThePirateHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/foxypirateparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyThePirateHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/foxypiratehead.png");
	}
}
