package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.display.UnwitheredGoldenBonnieHeadDisplayItem;

public class UnwitheredGoldenBonnieHeadDisplayModel extends AnimatedGeoModel<UnwitheredGoldenBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredGoldenBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredGoldenBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredGoldenBonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredgoldenbonniehead.png");
	}
}
