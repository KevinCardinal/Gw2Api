package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class BuffFact extends FactBase {
    private int duration;
    private String status;
    private String description;
    private int applyCount;
}
