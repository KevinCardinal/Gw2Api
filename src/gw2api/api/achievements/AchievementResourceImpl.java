package gw2api.api.achievements;

import java.lang.reflect.Type;
import java.util.EnumMap;

import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;
import gw2api.util.rest.RequestHelper;

public class AchievementResourceImpl extends IdsResourceBase<Achievement, int[]> implements AchievementResource {
    private final Type dailyType;

    public AchievementResourceImpl(WebResource webResource) {
        super(webResource.path("achievements"), Achievement.class, int[].class);
        dailyType = new TypeToken<EnumMap<DailyAchievement.Type, DailyAchievement[]>>() {
        }.getType();
    }

    @Override
    public EnumMap<DailyAchievement.Type, DailyAchievement[]> getDailyAchievements() {
        return RequestHelper.INSTANCE.getRequest(webResource.path("daily"), dailyType);
    }
}
