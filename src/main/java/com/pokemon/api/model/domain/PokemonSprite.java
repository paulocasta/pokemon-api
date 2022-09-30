package com.pokemon.api.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSprite {

    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("front_female")
    private String frontFemale;
    @JsonProperty("front_shiny_female")
    private String frontShinyFemale;
    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("back_female")
    private String backFemale;
    @JsonProperty("back_shiny_female")
    private String backShinyFemale;
}
