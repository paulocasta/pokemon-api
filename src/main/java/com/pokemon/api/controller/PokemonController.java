package com.pokemon.api.controller;

import com.pokemon.api.connection.RestConnection;
import com.pokemon.api.model.resource.NamedAPIResource;
import com.pokemon.api.model.resource.Pokemon;
import com.pokemon.api.model.resource.ResultList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    private RestConnection connection;

    @GetMapping("/list")
    public List<NamedAPIResource> listPokemon() {
        List<NamedAPIResource> results = new ArrayList<>();
        ResultList pokemonList = connection.executeGetAll();
        results.addAll(pokemonList.getResults());
        while (pokemonList.getNext() != null) {
            pokemonList = connection.executeNextUrl(pokemonList.getNext());
            results.addAll(pokemonList.getResults());
        }
        return results;
    }

    @GetMapping("/pokemon/{idName}")
    public Pokemon pokemonByIdName(@PathVariable String idName) {
        return connection.getPokemonByIdName(idName);
    }
}
