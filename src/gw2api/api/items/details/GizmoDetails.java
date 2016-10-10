package gw2api.api.items.details;

import gw2api.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class GizmoDetails implements Details {
    private GizmoType type;

    public static enum GizmoType {
        DEFAULT, CONTAINER_KEY, RENTABLE_CONTRACT_NPC, UNLIMITED_CONSUMEABLE;
    }
}
