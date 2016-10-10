package gw2api.api.characters;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class CraftingLevel {
    private CraftingDiscipline discipline;
    private int rating;
    private boolean active;
}
