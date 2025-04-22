package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredToyFreddyTorsoTileEntity;

public class WitheredToyFreddyTorsoBlockModel extends AnimatedGeoModel<WitheredToyFreddyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoyfreddyparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoyfreddyparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyFreddyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoyfreddytorso.png");
	}
}
