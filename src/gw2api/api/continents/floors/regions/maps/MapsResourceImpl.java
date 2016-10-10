package gw2api.api.continents.floors.regions.maps;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class MapsResourceImpl extends IdsResourceBase<Map, int[]> implements MapsResource {
    public MapsResourceImpl(WebResource webResource) {
        super(webResource.path("maps"), Map.class, int[].class);
    }
}
