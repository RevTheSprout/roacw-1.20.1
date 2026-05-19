package net.kamaarion.roacw.items.weapons.murasama_blade;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MurasamaBladeRenderer extends GeoItemRenderer<MurasamaBlade> {
    public MurasamaBladeRenderer(MurasamaBladeModel murasamaBladeModel) {
        super(murasamaBladeModel);
        this.addRenderLayer(new MurasamaBladeLayer(this));
    }
}
