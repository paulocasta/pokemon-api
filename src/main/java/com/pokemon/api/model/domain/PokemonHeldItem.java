package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonHeldItem {

    @JsonProperty
    private NamedAPIResource item;
    @JsonProperty("version_details")
    private List<PokemonHeldItemVersion> versionDetails;
}
