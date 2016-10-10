package gw2api.api.characters;

import gw2api.util.gson.characters.TraitDeserializer;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Specialization {
    private int id;
    @com.google.gson.annotations.JsonAdapter(TraitDeserializer.class)
    private int[] traits;
}
