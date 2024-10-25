package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.DinerChicaRightArmTileEntity;

public class DinerChicaRightArmBlockModel extends AnimatedGeoModel<DinerChicaRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/dinerchicaparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/dinerchicaparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/dinerchicarightarm.png");
	}
}
