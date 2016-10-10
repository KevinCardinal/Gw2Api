package gw2api.api.commerce;

import com.sun.jersey.api.client.WebResource;

import gw2api.ApiMidpoint;
import gw2api.api.commerce.exchange.ExchangeResource;
import gw2api.api.commerce.listings.ListingsResource;
import gw2api.api.commerce.listings.ListingsResourceImpl;
import gw2api.api.commerce.prices.PricesResource;
import gw2api.api.commerce.prices.PricesResourceImpl;
import gw2api.api.commerce.transactions.TransactionsResource;

public class CommerceResource implements ApiMidpoint {
    private final ExchangeResource exchange;
    private final ListingsResource listings;
    private final PricesResource prices;
    private final TransactionsResource transactions;

    public CommerceResource(WebResource webResource) {
        WebResource commerceWebResource = webResource.path("commerce");
        exchange = new ExchangeResource(commerceWebResource);
        listings = new ListingsResourceImpl(commerceWebResource);
        prices = new PricesResourceImpl(commerceWebResource);
        transactions = new TransactionsResource(commerceWebResource);
    }

    /**
     * This resource provides acces to the gem exchange rate.
     *
     * @return
     */
    public ExchangeResource exchange() {
        return exchange;
    }

    /**
     * This resource returns current buy and sell listings from the trading
     * post.
     *
     * @return
     */
    public ListingsResource listings() {
        return listings;
    }
    
    /**
     * This resource returns current aggregated buy and sell listing information
     * from the trading post.
     * 
     * @return 
     */
    public PricesResource prices() {
        return prices;
    }

    /**
     * This resource provides access to the current and historical transactions
     * of a player. This is an authenticated endpoint. Results are cached for
     * five minutes.
     *
     * @return
     */
    public TransactionsResource transactions() {
        return transactions;
    }
}
