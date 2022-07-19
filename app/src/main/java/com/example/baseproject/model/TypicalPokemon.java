package com.example.baseproject.model;

public class TypicalPokemon {
  private String pokemonName;
  private int mImage;

  public int getImage() {
    return mImage;
  }

  public void setImage(int mImage) {
    this.mImage = mImage;
  }

  public String getPokemonName() {
    return pokemonName;
  }

  public void setPokemonName(String pokemonName) {
    this.pokemonName = pokemonName;
  }

  @Override
  public String toString() {
    return "TypicalPokemon{" +
        "pokemonName='" + pokemonName + '\'' +
        '}';
  }
}
