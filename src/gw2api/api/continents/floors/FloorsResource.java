package gw2api.api.continents.floors;

import gw2api.ApiEndpoint;
import gw2api.ApiMidpoint;
import gw2api.api.continents.floors.regions.RegionsResource;

public interface FloorsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();
    
    Floor get(int id);
    
    Floor get(int id, String language);
    
    Floor[] get(int[] id);
    
    Floor[] get(int[] id, String language);
    
    Floor[] getAll();
    
    Floor[] getAll(String language);
    
    RegionsResource regions(int floorId);
}
