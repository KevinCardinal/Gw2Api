package gw2api.api.continents.floors.regions;

import gw2api.api.continents.floors.regions.maps.Map;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Region {
    private String name;
    private int[] labelCoord;
    private java.util.Map<Integer, Map> maps;
}
