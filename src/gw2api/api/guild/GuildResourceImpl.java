package gw2api.api.guild;

import com.sun.jersey.api.client.WebResource;

import gw2api.ApiMidpoint;
import gw2api.api.guild.upgrades.GuildUpgradesResource;
import gw2api.api.guild.upgrades.GuildUpgradesResourceImpl;

public class GuildResourceImpl implements GuildResource, ApiMidpoint {
    private final GuildUpgradesResource upgradesResource;

    public GuildResourceImpl(WebResource webResource) {
        WebResource guildWebResource = webResource.path("guild");
        upgradesResource = new GuildUpgradesResourceImpl(guildWebResource);
    }

    @Override
    public GuildUpgradesResource upgrades() {
        return upgradesResource;
    }
}
