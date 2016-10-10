package gw2api.api.continents;

import com.google.gson.annotations.SerializedName;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Continent {
    private int id = -1;
    private String name;
    @SerializedName("continent_dims")
    private int[] dimensions;
    private int minZoom = -1;
    private int maxZoom = -1;
    private int[] floors;
}
