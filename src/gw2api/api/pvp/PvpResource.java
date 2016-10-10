package gw2api.api.pvp;

import com.sun.jersey.api.client.WebResource;

import gw2api.ApiMidpoint;
import gw2api.api.pvp.games.GamesResource;
import gw2api.api.pvp.stats.StatsResource;

public class PvpResource implements ApiMidpoint {
    private final GamesResource gamesResource;
    private final StatsResource statsResource;

    public PvpResource(WebResource webResource) {
        webResource = webResource.path("pvp");
        gamesResource = new GamesResource(webResource);
        statsResource = new StatsResource(webResource);
    }

    /**
     * https://wiki.guildwars2.com/wiki/API:2/pvp/games
     *
     * @return
     */
    public GamesResource games() {
        return gamesResource;
    }

    /**
     * https://wiki.guildwars2.com/wiki/API:2/pvp/stats
     *
     * @return
     */
    public StatsResource stats() {
        return statsResource;
    }
}
