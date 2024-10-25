package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.UnwitheredBonnieLeftArmTileEntity;

public class UnwitheredBonnieLeftArmBlockModel extends AnimatedGeoModel<UnwitheredBonnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnwitheredBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/unwitheredbonnieparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnwitheredBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/unwitheredbonnieparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnwitheredBonnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/unwitheredbonnieleftarm.png");
	}
}
