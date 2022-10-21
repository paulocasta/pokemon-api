package com.pokemon.api.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonAbility {

    @JsonProperty("is_hidden")
    private boolean isHidden;
    @JsonProperty
    private Integer slot;
    @JsonProperty
    private NamedAPIResource pokemon;

}
