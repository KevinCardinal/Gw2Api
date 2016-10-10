package gw2api.api.continents;

import com.sun.jersey.api.client.WebResource;

import gw2api.api.continents.floors.FloorsResource;
import gw2api.api.continents.floors.FloorsResourceImpl;
import gw2api.util.rest.IdsResourceBase;

public class ContinentsResourceImpl extends IdsResourceBase<Continent, int[]> implements ContinentsResource {
    public ContinentsResourceImpl(WebResource webResource) {
        super(webResource.path("continents"), Continent.class, int[].class);
    }

    @Override
    public FloorsResource floors(int continentId) {
        return new FloorsResourceImpl(webResource.path(String.valueOf(continentId)));
    }
}
