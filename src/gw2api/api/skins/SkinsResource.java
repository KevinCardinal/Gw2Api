package gw2api.api.skins;

import gw2api.ApiEndpoint;

/**
 * This resource returns information about skins that were discovered by players in the game. 
 */
public interface SkinsResource extends ApiEndpoint {
    int[] getOverview();
    
    Skin get(int id);
    
    Skin get(int id, String language);
    
    Skin[] get(int[] ids);
    
    Skin[] get(int[] ids, String language);
}
