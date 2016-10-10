package gw2api.api.achievements;

import java.util.Map;

import gw2api.ApiEndpoint;

public interface AchievementResource extends ApiEndpoint {
    int[] getOverview();

    Achievement get(int id);

    Achievement get(int id, String language);

    Achievement[] get(int[] ids);

    Achievement[] get(int id[], String language);

    Map<DailyAchievement.Type, DailyAchievement[]> getDailyAchievements();
}
