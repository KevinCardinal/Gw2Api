package gw2api.api.traits;

import gw2api.api.traits.facttypes.AttributeAdjustFact;
import gw2api.api.traits.facttypes.BuffConversionFact;
import gw2api.api.traits.facttypes.BuffFact;
import gw2api.api.traits.facttypes.ComboFieldFact;
import gw2api.api.traits.facttypes.ComboFinisherFact;
import gw2api.api.traits.facttypes.DamageFact;
import gw2api.api.traits.facttypes.DistanceFact;
import gw2api.api.traits.facttypes.NoDataFact;
import gw2api.api.traits.facttypes.NumberFact;
import gw2api.api.traits.facttypes.PercentFact;
import gw2api.api.traits.facttypes.PrefixedBuffFact;
import gw2api.api.traits.facttypes.RadiusFact;
import gw2api.api.traits.facttypes.RangeFact;
import gw2api.api.traits.facttypes.RechargeFact;
import gw2api.api.traits.facttypes.TimeFact;
import gw2api.api.traits.facttypes.UnblockableFact;


public enum FactType {
    ATTRIBUTE_ADJUST(AttributeAdjustFact.class), BUFF(BuffFact.class),
    BUFF_CONVERSION(BuffConversionFact.class),
    COMBO_FIELD(ComboFieldFact.class), COMBO_FINISHER(ComboFinisherFact.class),
    DAMAGE(DamageFact.class), DISTANCE(DistanceFact.class),
    NO_DATA(NoDataFact.class), NUMBER(NumberFact.class),
    PERCENT(PercentFact.class), PREFIXED_BUFF(PrefixedBuffFact.class),
    RADIUS(RadiusFact.class), RANGE(RangeFact.class),
    RECHARGE(RechargeFact.class), TIME(TimeFact.class),
    UNBLOCKABLE(UnblockableFact.class);
    
    private final Class<? extends FactBase> clazz;

    private FactType(Class<? extends FactBase> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends FactBase> getTypeClass() {
        return clazz;
    }
    
}
