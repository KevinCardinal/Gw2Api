package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class TimeFact extends FactBase {
    private int duration = -1;
}
