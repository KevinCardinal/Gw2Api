package gw2api.api.continents.floors.regions.maps;

import gw2api.ApiEndpoint;

public interface MapsResource extends ApiEndpoint {
    int[] getOverview();
    
    Map get(int id);
    
    Map get(int id, String language);
    
    Map[] get(int[] id);
    
    Map[] get(int[] id, String language);
    
    Map[] getAll();
    
    Map[] getAll(String language);
}
