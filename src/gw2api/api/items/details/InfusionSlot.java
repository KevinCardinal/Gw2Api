package gw2api.api.items.details;

import gw2api.common.InfusionType;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class InfusionSlot {
    private InfusionType[] flags;
    private int itemId = -1;
}
