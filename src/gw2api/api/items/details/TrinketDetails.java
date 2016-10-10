package gw2api.api.items.details;

import gw2api.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class TrinketDetails implements Details {
    private TrinketType type;
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;

    public static enum TrinketType {
        ACCESSORY, AMULET, RING;
    }
}
