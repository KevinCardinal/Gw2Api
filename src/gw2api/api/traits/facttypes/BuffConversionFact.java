package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class BuffConversionFact extends FactBase {
    private int percent = -1;
    private String source;
    private String target;
}
