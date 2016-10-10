package gw2api.api.items.details;

import gw2api.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class SalvageKitDetails implements Details {
    private SalvageKitType type;
    private int charges = -1;

    public static enum SalvageKitType {
        SALVAGE;
    }
}
