package gw2api.api.continents.floors.regions;

import gw2api.ApiEndpoint;
import gw2api.ApiMidpoint;
import gw2api.api.continents.floors.regions.maps.MapsResource;

public interface RegionsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();
    
    Region get(int id);
    
    Region get(int id, String language);
    
    Region[] get(int[] id);
    
    Region[] get(int[] id, String language);
    
    Region[] getAll();
    
    Region[] getAll(String language);
    
    MapsResource maps();
}
