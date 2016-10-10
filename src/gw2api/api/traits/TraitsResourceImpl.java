package gw2api.api.traits;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class TraitsResourceImpl extends IdsResourceBase<Trait, int[]> implements TraitsResource {
    public TraitsResourceImpl(WebResource webResource) {
        super(webResource.path("traits"), Trait.class, int[].class);
    }
}
