package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString
public class UnblockableFact extends FactBase {
    private boolean unblockable;
}
