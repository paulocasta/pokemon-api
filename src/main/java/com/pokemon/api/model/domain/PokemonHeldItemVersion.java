package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonHeldItemVersion {
    @JsonProperty
    private NamedAPIResource version;
    @JsonProperty
    private Integer rarity;
}
