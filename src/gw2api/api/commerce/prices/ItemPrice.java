package gw2api.api.commerce.prices;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class ItemPrice {
    private int id;
    private Price buys;
    private Price sells;
}
