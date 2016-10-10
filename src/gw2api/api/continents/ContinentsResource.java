package gw2api.api.continents;

import gw2api.ApiEndpoint;
import gw2api.ApiMidpoint;
import gw2api.api.continents.floors.FloorsResource;

public interface ContinentsResource extends ApiEndpoint, ApiMidpoint {
    int[] getOverview();

    Continent get(int id);

    Continent get(int id, String language);

    Continent[] get(int[] ids);

    Continent[] get(int[] ids, String language);

    Continent[] getAll();

    Continent[] getAll(String language);
    
    FloorsResource floors(int continentId);
}
