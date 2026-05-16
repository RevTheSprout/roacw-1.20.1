package net.rev.roacw.items.curios.elemental_gauntlet;

import net.rev.roacw.items.curios.elemental_gauntlet.ElementalGauntlet;
import net.rev.roacw.items.curios.elemental_gauntlet.ElementalGauntletModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ElementalGauntletRenderer extends GeoItemRenderer<ElementalGauntlet> {
    public ElementalGauntletRenderer() { super(new ElementalGauntletModel()); }
}
