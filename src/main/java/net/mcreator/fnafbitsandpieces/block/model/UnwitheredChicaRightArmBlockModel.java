package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredChicaRightArmTileEntity;

public class UnwitheredChicaRightArmBlockModel extends AnimatedGeoModel<UnwitheredChicaRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredChicaRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredchicarightarm.png");
	}
}