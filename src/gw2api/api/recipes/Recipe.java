package gw2api.api.recipes;

import gw2api.api.characters.CraftingDiscipline;
import gw2api.common.BasicItem;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class Recipe {
    private int id = -1;
    private RecipeType type;
    private int outputItemId = -1;
    private int outputItemCount = -1;
    private int timeToCraftMs = -1;
    private CraftingDiscipline[] disciplines;
    private int minRating = -1;
    private String[] flags;
    private BasicItem[] ingredients;
    private GuildIngredient[] guildIngredients;
    private int outputUpgradeId = -1;
    private String chatLink;
}
