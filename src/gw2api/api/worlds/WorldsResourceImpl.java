package gw2api.api.worlds;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class WorldsResourceImpl extends IdsResourceBase<World, int[]> implements WorldsResource {
    public WorldsResourceImpl(WebResource webResource) {
        super(webResource.path("worlds"), World.class, int[].class);
    }
}
