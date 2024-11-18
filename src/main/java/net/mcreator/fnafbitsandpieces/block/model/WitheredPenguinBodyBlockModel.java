package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.WitheredPenguinBodyTileEntity;

public class WitheredPenguinBodyBlockModel extends AnimatedGeoModel<WitheredPenguinBodyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredPenguinBodyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/penguinparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredPenguinBodyTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/penguinparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredPenguinBodyTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/witheredpenguinbody.png");
	}
}
