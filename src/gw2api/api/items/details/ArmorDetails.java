package gw2api.api.items.details;

import gw2api.api.items.Details;
import gw2api.common.WeightClass;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class ArmorDetails implements Details {
    private ArmorSlotType type;
    private WeightClass weightClass;
    private int defense;
    private InfusionSlot[] infusionSlots;
    private InfixUpgrade infixUpgrade;
    private int suffixItemId = -1;
    private String secondarySuffixItemId;
    private int[] statChoices;

    public static enum ArmorSlotType {
        BOOTS, COAT, GLOVES, HELM, HELM_AQUATIC, LEGGINGS, SHOULDERS;
    }
}
