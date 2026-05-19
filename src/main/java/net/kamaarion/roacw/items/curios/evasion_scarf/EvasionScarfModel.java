package net.kamaarion.roacw.items.curios.evasion_scarf;

import net.minecraft.resources.ResourceLocation;
import net.kamaarion.roacw.ROACW;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class EvasionScarfModel extends DefaultedItemGeoModel<EvasionScarf> {
    public EvasionScarfModel() {
        super(ResourceLocation.fromNamespaceAndPath(ROACW.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(EvasionScarf object) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "geo/item/curio/evasion_scarf.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EvasionScarf object) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "textures/item/curio/evasion_scarf.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EvasionScarf animatable) {
        return ResourceLocation.fromNamespaceAndPath(ROACW.MODID, "animations/mars_armor.animation.json");
    }
}
