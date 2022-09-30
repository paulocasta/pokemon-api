package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonType {

    @JsonProperty
    private Integer slot;
    @JsonProperty
    private NamedAPIResource type;
}
