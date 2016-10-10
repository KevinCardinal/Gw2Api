package gw2api.api.characters;

import com.sun.jersey.api.client.WebResource;

import gw2api.ApiEndpoint;
import gw2api.util.rest.RequestHelper;

/**
 * This resource returns information about characters attached to a specific
 * account.
 */
public class CharactersResource implements ApiEndpoint {
    private final WebResource webResource;

    public CharactersResource(WebResource webResource) {
        this.webResource = webResource.path("characters");
    }

    public String[] get(String apiKey) {
        return RequestHelper.INSTANCE.getRequest(webResource, apiKey, String[].class);
    }

    public Character get(String character, String apiKey) {
        return RequestHelper.INSTANCE.getRequest(webResource.path(character), apiKey, Character.class);
    }
}
