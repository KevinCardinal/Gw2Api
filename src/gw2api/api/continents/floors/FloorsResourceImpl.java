package gw2api.api.continents.floors;

import com.sun.jersey.api.client.WebResource;

import gw2api.api.continents.floors.regions.RegionsResource;
import gw2api.api.continents.floors.regions.RegionsResourceImpl;
import gw2api.util.rest.IdsResourceBase;

public class FloorsResourceImpl extends IdsResourceBase<Floor, int[]> implements FloorsResource {
    public FloorsResourceImpl(WebResource webResource) {
        super(webResource.path("floors"), Floor.class, int[].class);
    }

    @Override
    public RegionsResource regions(int floorId) {
        return new RegionsResourceImpl(webResource.path(String.valueOf(floorId)));
    }
}
