package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.ToString
public class ComboFieldFact extends FactBase {
    private FieldType fieldType;

    public static enum FieldType {
        AIR, DARK, FIRE, ICE, LIGHT, LIGHTNING, POISON, SMOKE, ETHEREAL, WATER;
    }
}
