package com.pokemon.api.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionGameIndex {

    @JsonProperty("game_index")
    private Integer gameIndex;
    @JsonProperty
    private NamedAPIResource version;
}
