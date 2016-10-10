package gw2api.api.tokeninfo;

import com.sun.jersey.api.client.WebResource;

import gw2api.ApiEndpoint;
import gw2api.util.rest.RequestHelper;

/**
 * This resource returns information about the supplied API key.
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/tokeninfo">GW2Wiki</a>
 */
public class TokenResource implements ApiEndpoint {
    private final WebResource webResource;

    public TokenResource(WebResource webResource) {
        this.webResource = webResource.path("tokeninfo");
    }

    public TokenInfo get(String apikey) {
        return RequestHelper.INSTANCE.getRequest(webResource, apikey, TokenInfo.class);
    }
}
