package gw2api.api.continents.floors.regions.maps;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Sector {
    private int id = -1;
    private String name;
    private int level = -1;
    private float[] coord;
}
