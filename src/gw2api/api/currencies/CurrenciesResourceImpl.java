package gw2api.api.currencies;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;


public class CurrenciesResourceImpl extends IdsResourceBase<Currency, int[]> implements CurrenciesResource {
    public CurrenciesResourceImpl(WebResource webResource) {
        super(webResource.path("currencies"), Currency.class, int[].class);
    }
}
