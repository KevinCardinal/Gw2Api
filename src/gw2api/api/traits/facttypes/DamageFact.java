package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.ToString
public class DamageFact extends FactBase {
    private int hitCount;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.hitCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DamageFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final DamageFact other = (DamageFact) obj;
        return this.hitCount == other.hitCount;
    }
}
