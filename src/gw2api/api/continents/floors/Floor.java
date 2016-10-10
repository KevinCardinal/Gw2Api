package gw2api.api.continents.floors;

import java.util.Map;

import gw2api.api.continents.floors.regions.Region;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Floor {
    private int id = -1;
    private int[] textureDims;
    private Map<Integer, Region> regions;
}
