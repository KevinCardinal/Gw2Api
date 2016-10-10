package gw2api.api.skins;

import gw2api.common.WeightClass;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class SkinDetails {
    private String type;
    private WeightClass weightClass;
    private String damageType;
}
