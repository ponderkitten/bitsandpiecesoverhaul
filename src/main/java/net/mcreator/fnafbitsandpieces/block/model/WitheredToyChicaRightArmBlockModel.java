package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredToyChicaRightArmTileEntity;

public class WitheredToyChicaRightArmBlockModel extends AnimatedGeoModel<WitheredToyChicaRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredToyChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/witheredtoychicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredToyChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/witheredtoychicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredToyChicaRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredtoychicarightarm.png");
	}
}
