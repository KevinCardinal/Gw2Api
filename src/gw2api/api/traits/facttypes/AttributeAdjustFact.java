package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class AttributeAdjustFact extends FactBase {
    private int value = -1;
    private String target;
}
