package gw2api;

import java.util.EnumMap;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import gw2api.api.account.AccountResource;
import gw2api.api.achievements.AchievementResource;
import gw2api.api.achievements.AchievementResourceImpl;
import gw2api.api.achievements.DailyAchievement;
import gw2api.api.build.BuildResource;
import gw2api.api.characters.CharactersResource;
import gw2api.api.colors.ColorsResource;
import gw2api.api.colors.ColorsResourceImpl;
import gw2api.api.commerce.CommerceResource;
import gw2api.api.continents.ContinentsResource;
import gw2api.api.continents.ContinentsResourceImpl;
import gw2api.api.currencies.CurrenciesResource;
import gw2api.api.currencies.CurrenciesResourceImpl;
import gw2api.api.files.FilesResource;
import gw2api.api.files.FilesResourceImpl;
import gw2api.api.guild.GuildResource;
import gw2api.api.guild.GuildResourceImpl;
import gw2api.api.items.ItemInfo;
import gw2api.api.items.ItemsResource;
import gw2api.api.items.ItemsResourceImpl;
import gw2api.api.maps.MapsResource;
import gw2api.api.maps.MapsResourceImpl;
import gw2api.api.pvp.PvpResource;
import gw2api.api.recipes.RecipesResource;
import gw2api.api.recipes.RecipesResourceImpl;
import gw2api.api.skins.SkinsResource;
import gw2api.api.skins.SkinsResourceImpl;
import gw2api.api.specializations.SpecializationsResource;
import gw2api.api.specializations.SpecializationsResourceImpl;
import gw2api.api.tokeninfo.TokenResource;
import gw2api.api.traits.Fact;
import gw2api.api.traits.TraitedFact;
import gw2api.api.traits.TraitsResource;
import gw2api.api.traits.TraitsResourceImpl;
import gw2api.api.worlds.WorldsResource;
import gw2api.api.worlds.WorldsResourceImpl;
import gw2api.configs.GuildWars2ApiConfig;
import gw2api.configs.GuildWars2ApiDefaultConfig;
import gw2api.util.gson.EnumMapInstanceCreator;
import gw2api.util.gson.EnumTypeAdapterFactory;
import gw2api.util.gson.achievements.DailyAchievementsJsonDeserializer;
import gw2api.util.gson.facts.FactJsonDeserializer;
import gw2api.util.gson.facts.TraitedFactJsonDeserializer;
import gw2api.util.gson.items.ItemInfoJsonDeserializer;
import gw2api.util.time.DateTimeAdapter;

public class GuildWars2Api {
    public static final Gson GSON = new GsonBuilder()
        .registerTypeAdapter(DateTimeAdapter.TYPE, new DateTimeAdapter())
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .registerTypeAdapterFactory(new EnumTypeAdapterFactory())
        .registerTypeAdapter(
            new TypeToken<EnumMap>() {
        }.getType(),
            new EnumMapInstanceCreator<>()
        )
        .registerTypeAdapter(Fact.class, new FactJsonDeserializer())
        .registerTypeAdapter(TraitedFact.class, new TraitedFactJsonDeserializer())
        .registerTypeAdapter(ItemInfo.class, new ItemInfoJsonDeserializer())
        .registerTypeAdapter(DailyAchievement.class, new DailyAchievementsJsonDeserializer())
        .create();

    private final Client client;
    private final AccountResource accountResource;
    private final AchievementResource achievements;
    private final BuildResource buildResource;
    private final CommerceResource commerceResource;
    private final CharactersResource charactersResource;
    private final ColorsResource colorResource;
    private final ContinentsResource continentsResource;
    private final CurrenciesResource currenciesResource;
    private final FilesResource filesResource;
    private final GuildResource guildResource;
    private final ItemsResource itemsResource;
    private final MapsResource mapsResource;
    private final PvpResource pvpResource;
    private final RecipesResource recipesResource;
    private final SkinsResource skinsResource;
    private final SpecializationsResource specializationsResource;
    private final TokenResource tokenResource;
    private final TraitsResource traitsResource;
    private final WorldsResource worldsResource;

    public GuildWars2Api() {
        this(new GuildWars2ApiDefaultConfig());
    }

    public GuildWars2Api(GuildWars2ApiConfig config) {
        client = Client.create(config.getClientConfig());
        WebResource baseWebResource = client.resource(config.getBaseUrl());

        accountResource = new AccountResource(baseWebResource);
        achievements = new AchievementResourceImpl(baseWebResource);
        buildResource = new BuildResource(baseWebResource);
        commerceResource = new CommerceResource(baseWebResource);
        charactersResource = new CharactersResource(baseWebResource);
        colorResource = new ColorsResourceImpl(baseWebResource);
        continentsResource = new ContinentsResourceImpl(baseWebResource);
        currenciesResource = new CurrenciesResourceImpl(baseWebResource);
        filesResource = new FilesResourceImpl(baseWebResource);
        guildResource = new GuildResourceImpl(baseWebResource);
        itemsResource = new ItemsResourceImpl(baseWebResource);
        mapsResource = new MapsResourceImpl(baseWebResource);
        pvpResource = new PvpResource(baseWebResource);
        recipesResource = new RecipesResourceImpl(baseWebResource);
        skinsResource = new SkinsResourceImpl(baseWebResource);
        specializationsResource = new SpecializationsResourceImpl(baseWebResource);
        tokenResource = new TokenResource(baseWebResource);
        traitsResource = new TraitsResourceImpl(baseWebResource);
        worldsResource = new WorldsResourceImpl(baseWebResource);
    }

    /**
     * This resource returns information about player accounts. This endpoint is
     * only accessible with a valid API key.
     *
     * @return a resource that enables fetching account details
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/account">Guild Wars
     * 2 Wiki</a>
     */
    public AccountResource account() {
        return accountResource;
    }

    /**
     * This resource returns information about achievements. This endpoint is
     * only accessible with a valid API key.
     *
     * @return a resource that enables fetching achievement details
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/achievements">Guild
     * Wars 2 Wiki</a>
     */
    public AchievementResource achievements() {
        return achievements;
    }

    /**
     * This resource returns the current build id of the game. This can be used,
     * for example, to register when event timers reset due to server restarts.
     *
     * @return a resource that enables fetching game-build details
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/build">Guild Wars 2
     * Wiki</a>
     */
    public BuildResource build() {
        return buildResource;
    }

    /**
     * This resource returns information about characters attached to a specific
     * account.
     *
     * @return a resource that enables fetching character details
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/characters">Guild
     * Wars 2 Wiki</a>
     */
    public CharactersResource characters() {
        return charactersResource;
    }

    /**
     * This resource returns information about prices, listings, exchange rates
     * and transactions.
     *
     * @return a resource that enables fetching trading post details
     */
    public CommerceResource commerce() {
        return commerceResource;
    }

    /**
     * This resource returns all dye colors in the game, including localized
     * names and their color component information.
     *
     * @return a resource that enables fetching color details
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/colors">Guild Wars 2
     * Wiki</a>
     */
    public ColorsResource colors() {
        return colorResource;
    }

    /**
     * This resource returns static information about the continents, floors,
     * regions, maps, sectors, points of interest and tasks.
     *
     * @return a resource that enables fetching continent details
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/continents">Guild
     * Wars 2 Wiki</a>
     */
    public ContinentsResource continents() {
        return continentsResource;
    }

    /**
     * This resource returns a list of the currencies contained in the account
     * wallet.
     *
     * @return a resource that enables fetching currency details
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/currencies">Guild
     * Wars 2 Wiki</a>
     */
    public CurrenciesResource currencies() {
        return currenciesResource;
    }

    /**
     * This resource returns commonly requested in-game assets that may be used
     * to enhance API-derived applications.
     *
     * @return a resource that enables fetching file details
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
     */
    public FilesResource files() {
        return filesResource;
    }

    /**
     * This resource returns information about all available <a
     * href="https://wiki.guildwars2.com/wiki/Guild_Hall">Guild Hall</a>
     * upgrades, including scribe decorations.
     *
     * @return a resource that enables fetching guild details
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2">GW2Wiki</a>
     */
    public GuildResource guild() {
        return guildResource;
    }

    /**
     * This resource returns information about items that were discovered by
     * players in the game.
     *
     * @return a resource that enables fetching item details
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2/items">GW2Wiki</a>
     */
    public ItemsResource items() {
        return itemsResource;
    }

    /**
     * This resource returns details about maps in the game, including details
     * about floor and translation data on how to translate between world
     * coordinates and map coordinates.
     *
     * @return a resource that enables fetching map details
     *
     * @see
     * <a href="https://wiki.guildwars2.com/wiki/API:2/maps">GW2Wiki</a>
     */
    public MapsResource maps() {
        return mapsResource;
    }

    public PvpResource pvp() {
        return pvpResource;
    }

    /**
     * This resource returns information about recipes that were discovered by
     * players in the game.
     *
     * @return a resource that enables fetching recipe details
     */
    public RecipesResource recipes() {
        return recipesResource;
    }

    /**
     * This resource returns information about skins that were discovered by
     * players in the game.
     *
     * @return a resource that enables fetching skin details
     */
    public SkinsResource skins() {
        return skinsResource;
    }

    /**
     * This resource returns information about the specializations.
     *
     * @return a resource that enables fetching specialization details
     *
     * @see <a href="http://wiki.guildwars2.com/wiki/API:2/specializations">
     * Guild Wars 2 Wiki</a>
     */
    public SpecializationsResource specializations() {
        return specializationsResource;
    }

    /**
     * This resource returns information about the supplied API key.
     *
     * @return a resource that enables fetching details about an access token
     *
     * @see <a href="https://wiki.guildwars2.com/wiki/API:2/tokeninfo">Guild
     * Wars 2 Wiki</a>
     */
    public TokenResource tokeninfo() {
        return tokenResource;
    }

    /**
     * This resource returns information about specific traits which are
     * contained within specializations.
     *
     * @return a resource that enables fetching trait details
     */
    public TraitsResource traits() {
        return traitsResource;
    }

    /**
     * This resource returns information about the available worlds, or servers.
     *
     * @return a resource that enables fetching world details
     */
    public WorldsResource worlds() {
        return worldsResource;
    }

    /**
     * {@link Client#destroy()}
     *
     * @see Client#destroy()
     */
    public void destroy() {
        client.destroy();
    }
}
