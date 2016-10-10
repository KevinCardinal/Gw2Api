package gw2api.api.traits.facttypes;

import gw2api.api.traits.FactBase;

@lombok.NoArgsConstructor
@lombok.Getter
@lombok.ToString
public class DistanceFact extends FactBase {
    private int distance;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 29 * hash + this.distance;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DistanceFact)) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final DistanceFact other = (DistanceFact) obj;
        return this.distance == other.distance;
    }
}
