package gw2api.api.guild.upgrades;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class GuildUpgradesResourceImpl extends IdsResourceBase<GuildUpgrade, int[]> implements GuildUpgradesResource {

    public GuildUpgradesResourceImpl(WebResource webResource) {
        super(webResource.path("upgrades"), GuildUpgrade.class, int[].class);
    }

}
