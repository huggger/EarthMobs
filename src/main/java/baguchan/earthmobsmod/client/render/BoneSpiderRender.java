package baguchan.earthmobsmod.client.render;

import baguchan.earthmobsmod.EarthMobsMod;
import baguchan.earthmobsmod.client.ModModelLayers;
import baguchan.earthmobsmod.client.model.BoneSpiderModel;
import baguchan.earthmobsmod.client.render.layer.BoneSpiderEyesLayer;
import baguchan.earthmobsmod.entity.BoneSpider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BoneSpiderRender<T extends BoneSpider> extends MobRenderer<T, BoneSpiderModel<T>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(EarthMobsMod.MODID, "textures/entity/bone_spider/bone_spider.png");

	public BoneSpiderRender(EntityRendererProvider.Context p_173952_) {
		super(p_173952_, new BoneSpiderModel<>(p_173952_.bakeLayer(ModModelLayers.BONE_SPIDER)), 0.65F);
		this.addLayer(new BoneSpiderEyesLayer<>(this));
	}


	@Override
	public ResourceLocation getTextureLocation(T p_110775_1_) {
		return TEXTURE;
	}
}