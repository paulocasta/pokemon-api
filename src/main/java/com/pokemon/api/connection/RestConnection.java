package com.pokemon.api.connection;

import com.pokemon.api.model.resource.Language;
import com.pokemon.api.model.resource.Pokemon;
import com.pokemon.api.model.resource.ResultList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static com.pokemon.api.connection.Endpoint.POKEMON_URL;

@Component
public class RestConnection {

    private final RestTemplate restTemplate;
    private final HttpEntity<String> entity;

    public RestConnection() {
        restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        entity = new HttpEntity<>(headers);
    }

    public ResultList executeGetAll() {
        return restTemplate.exchange(POKEMON_URL, HttpMethod.GET, entity, ResultList.class).getBody();
    }

    public ResultList executeNextUrl(String url) {
        return restTemplate.exchange(url, HttpMethod.GET, entity, ResultList.class).getBody();
    }

    public Pokemon getPokemonByIdName(String idName) {
        return restTemplate.exchange(POKEMON_URL + idName, HttpMethod.GET, entity, Pokemon.class).getBody();
    }

    public ResultList getResultList(String url) {
        return restTemplate.exchange(url, HttpMethod.GET, entity, ResultList.class).getBody();
    }

    public Language getLanguage(String url) {
        return restTemplate.exchange(url, HttpMethod.GET, entity, Language.class).getBody();
    }
}
