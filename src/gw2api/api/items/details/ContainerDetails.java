package gw2api.api.items.details;

import gw2api.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class ContainerDetails implements Details {
    private ContainerType type;

    public static enum ContainerType {
        DEFAULT, GIFT_BOX, OPEN_UI;
    }
}
