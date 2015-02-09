package mods.belgabor.amtweaker.mods.amt;

import minetweaker.MineTweakerAPI;
import mods.belgabor.amtweaker.mods.amt.handlers.*;

public class AMT {
    public AMT() {
        MineTweakerAPI.registerClass(Evaporator.class);
        MineTweakerAPI.registerClass(Plate.class);
        MineTweakerAPI.registerClass(Pan.class);
        MineTweakerAPI.registerClass(Processor.class);
        MineTweakerAPI.registerClass(IceMaker.class);
    }
}
