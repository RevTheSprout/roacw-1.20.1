package net.rev.roacw.items.curios.evasion_scarf;

import net.rev.roacw.items.curios.stasis_curse.StatisCurse;
import net.rev.roacw.items.curios.stasis_curse.StatisCurseModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class EvasionScarfRenderer extends GeoItemRenderer<EvasionScarf> {
    public EvasionScarfRenderer() {
        super(new EvasionScarfModel());
    }
}
