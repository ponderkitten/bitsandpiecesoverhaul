package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.Endo01HeadChicaTileEntity;

public class Endo01HeadChicaBlockModel extends AnimatedGeoModel<Endo01HeadChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/chicachickenparts.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/chicachickenparts.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadChicaTileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/endo01headchica.png");
	}
}
