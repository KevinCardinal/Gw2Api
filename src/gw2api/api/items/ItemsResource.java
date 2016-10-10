package gw2api.api.items;

public interface ItemsResource {
    int[] getOverview();
    
    ItemInfo get(int id);
    
    ItemInfo get(int id, String language);
    
    ItemInfo[] get(int[] ids);
    
    ItemInfo[] get(int[] ids, String language);
}
