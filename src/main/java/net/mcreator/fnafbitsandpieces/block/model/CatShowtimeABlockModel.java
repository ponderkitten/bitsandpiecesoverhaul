package net.mcreator.fnafbitsandpieces.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafbitsandpieces.block.entity.CatShowtimeATileEntity;

public class CatShowtimeABlockModel extends AnimatedGeoModel<CatShowtimeATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "animations/catshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatShowtimeATileEntity animatable) {
		return new ResourceLocation("fnaf_bits_and_pieces", "geo/catshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatShowtimeATileEntity entity) {
		return new ResourceLocation("fnaf_bits_and_pieces", "textures/blocks/fixedcatshowtime.png");
	}
}
