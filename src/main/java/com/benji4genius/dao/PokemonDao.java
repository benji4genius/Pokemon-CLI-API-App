package com.benji4genius.dao;

import com.benji4genius.models.PokemonDetail;

import java.util.List;

public interface PokemonDao {
    // abstract method -- no bodies!
    // CRUD

    // create
    PokemonDetail saveFavorites(PokemonDetail detail, int userId);
    // read
    List<PokemonDetail> getAllFavorites(int userId);
}
