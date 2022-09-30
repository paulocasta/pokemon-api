package com.pokemon.api.connection;

import com.pokemon.api.model.domain.Pokemon;
import com.pokemon.api.model.domain.PokemonList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestConnection {

    private final RestTemplate restTemplate;
    private final HttpEntity<String> entity;

    private static final String POKEMON_URL = "https://pokeapi.co/api/v2/pokemon/";

    public RestConnection() {
        restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        entity = new HttpEntity<>(headers);
    }

    public PokemonList executeGetAll() {
        return restTemplate.exchange(POKEMON_URL, HttpMethod.GET, entity, PokemonList.class)
                .getBody();
    }

    public PokemonList executeNextUrl(String url) {
        return restTemplate.exchange(url, HttpMethod.GET, entity, PokemonList.class)
                       .getBody();
    }

    public Pokemon getPokemonByIdName(String idName) {
        return restTemplate.exchange(POKEMON_URL + idName, HttpMethod.GET, entity, Pokemon.class).getBody();
    }
}
