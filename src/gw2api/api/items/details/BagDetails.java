package gw2api.api.items.details;

import gw2api.api.items.Details;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class BagDetails implements Details {
    private int size = -1;
    private boolean noSellOrSort;
}
