package gw2api.api.minis;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class MinisResourceImpl extends IdsResourceBase<Mini, int[]> implements MinisResource {
    public MinisResourceImpl(WebResource webResource) {
        super(webResource.path("minis"), Mini.class, int[].class);
    }
}
