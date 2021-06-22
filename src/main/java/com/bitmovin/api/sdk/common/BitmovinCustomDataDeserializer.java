package com.bitmovin.api.sdk.common;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Ignores deserialization errors for customData properties.
 */
public class BitmovinCustomDataDeserializer extends StdDeserializer<Map<String, Object>> {
    public BitmovinCustomDataDeserializer() {
        super(Map.class);
    }

    @Override
    public Map<String, Object> deserialize(JsonParser jsonParser, DeserializationContext ctxt) {
        try {
            return ctxt.readValue(jsonParser, Map.class);
        } catch (IOException e) {
            return new HashMap<>();
        }
    }

    /**
     * This mixin adorns customData properties and activates the deserializer
     */
    public abstract static class HasCustomDataProperty {
        @JsonDeserialize(using = BitmovinCustomDataDeserializer.class)
        public abstract Map<String, Object> getCustomData();
    }
}
