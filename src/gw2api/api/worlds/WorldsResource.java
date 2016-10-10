package gw2api.api.worlds;

import gw2api.ApiEndpoint;

/**
 * This resource returns information about the available worlds, or servers. 
 */
public interface WorldsResource extends ApiEndpoint {
    /**
     * A list with all possible ids.
     *
     * @return
     */
    int[] getOverview();

    World get(int id);

    World[] get(int[] ids);
    
    World get(int id, String language);

    World[] get(int[] ids, String language);
}
