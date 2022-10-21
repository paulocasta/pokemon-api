package com.pokemon.api.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStat {

    @JsonProperty
    private NamedAPIResource stat;
    @JsonProperty
    private Integer effort;
    @JsonProperty("base_stat")
    private Integer baseStart;
}
