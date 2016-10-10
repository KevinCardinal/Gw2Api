package gw2api.api.items;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class ItemsResourceImpl extends IdsResourceBase<ItemInfo, int[]> implements ItemsResource {

    public ItemsResourceImpl(WebResource webResource) {
        super(webResource.path("items"), ItemInfo.class, int[].class);
    }

}
