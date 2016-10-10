package gw2api.api.traits;

import gw2api.ApiEndpoint;

/**
 * This resource returns information about specific traits which are contained
 * within specializations.
 */
public interface TraitsResource extends ApiEndpoint {
    int[] getOverview();

    Trait get(int id);

    Trait[] get(int[] ids);

    Trait get(int id, String language);

    Trait[] get(int[] ids, String language);
}
