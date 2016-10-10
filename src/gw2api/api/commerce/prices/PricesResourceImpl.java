package gw2api.api.commerce.prices;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class PricesResourceImpl extends IdsResourceBase<ItemPrice, int[]> implements PricesResource {
    public PricesResourceImpl(WebResource commerceResource) {
        super(commerceResource.path("prices"), ItemPrice.class, int[].class);
    }
}
