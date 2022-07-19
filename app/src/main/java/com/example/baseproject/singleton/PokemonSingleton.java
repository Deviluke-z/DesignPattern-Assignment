package com.example.baseproject.singleton;

import com.example.baseproject.model.Pokemon;

public class PokemonSingleton {
  private static PokemonSingleton instance;
  private Pokemon pokemon;

  public void setPokemon(Pokemon pokemon) {
    this.pokemon = pokemon;
  }

  public Pokemon getPokemon() {
    return pokemon;
  }

  public PokemonSingleton() {

  }

  public static synchronized PokemonSingleton getInstance() {
    if (instance == null) {
      instance = new PokemonSingleton();
    }
    return instance;
  }
}
