package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.ChicaChickenLeftArmTileEntity;

public class ChicaChickenLeftArmBlockModel extends AnimatedGeoModel<ChicaChickenLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/chicachickenleftarm.png");
	}
}
