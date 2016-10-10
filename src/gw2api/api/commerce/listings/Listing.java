package gw2api.api.commerce.listings;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Listing {
    private int id;
    private ListingPart[] buys;
    private ListingPart[] sells;
}
