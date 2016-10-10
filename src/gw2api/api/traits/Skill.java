package gw2api.api.traits;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Skill {
    private int id;
    private String name;
    private String description;
    private String icon;
    private Fact[] facts;
    private TraitedFact[] traitedFacts;
}
