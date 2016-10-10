package gw2api.api.colors;

import gw2api.ApiEndpoint;


public interface ColorsResource extends ApiEndpoint {
    int[] getOverview();
    Color get(int id);
    Color get(int id, String lang);
    Color[] get(int[] ids);
    Color[] get(int[] ids, String lang);
    Color[] getAll();
    Color[] getAll(String lang);
}
