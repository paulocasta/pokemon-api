package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonTypePast {

    @JsonProperty
    private NamedAPIResource generation;
    @JsonProperty
    private List<PokemonType> types;
}