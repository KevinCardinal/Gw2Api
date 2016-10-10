package gw2api.api.items.details;

import gw2api.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class GatheringToolsDetails implements Details {
    private GatheringToolsType type;

    public static enum GatheringToolsType {
        FORAGING, LOGGING, MINING;
    }
}
