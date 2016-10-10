package gw2api.api.characters;

import gw2api.common.Item;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Bag {
    private int id;
    private int size;
    private Item[] inventory;
}
