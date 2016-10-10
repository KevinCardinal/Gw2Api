package gw2api.util.gson.facts;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import gw2api.api.traits.FactType;
import gw2api.api.traits.TraitedFact;

public class TraitedFactJsonDeserializer implements JsonDeserializer<TraitedFact> {
    @Override
    public TraitedFact deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject parent = (JsonObject) json;
        FactType type = context.deserialize(parent.get("type"), FactType.class);
        return context.deserialize(json, type.getTypeClass());
    }
}
