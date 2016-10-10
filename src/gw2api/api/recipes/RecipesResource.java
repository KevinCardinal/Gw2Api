package gw2api.api.recipes;

import gw2api.ApiEndpoint;
import gw2api.ApiMidpoint;

public interface RecipesResource extends ApiMidpoint, ApiEndpoint {
    int[] getOverview();

    Recipe get(int id);

    Recipe[] get(int[] ids);
    
    /**
     * Searches for all recipes where a specific item is an ingredient.
     * 
     * @param id the item id which is an ingredient
     * @return the ids of the recipes where the item is an ingredient
     */
    int[] searchByInput(int id);
    
    /**
     * Searches for recipes where a specific item is created with it.
     * 
     * @param id the item id which is an output
     * @return the ids of the recipes which creates this item
     */
    int[] searchByOutput(int id);
}
