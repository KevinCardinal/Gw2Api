package gw2api.api.pvp.games;

import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;

import gw2api.api.characters.Character.Profession;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Game {
    private String id;
    private int mapId = -1;
    private DateTime started;
    private DateTime ended;
    private String result;
    private Profession profession;
    @SerializedName("score")
    private Score score;
}
