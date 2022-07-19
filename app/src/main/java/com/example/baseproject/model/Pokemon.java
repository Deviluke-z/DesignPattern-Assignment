package com.example.baseproject.model;

public class Pokemon {

  private Type mType;
  private TypicalPokemon mTypicalPokemon;

  public Pokemon(Type mType, TypicalPokemon mTypicalPokemon) {
    this.mType = mType;
    this.mTypicalPokemon = mTypicalPokemon;
  }

  public Type getType() {
    return mType;
  }

  public void setType(Type mType) {
    this.mType = mType;
  }

  public TypicalPokemon getTypicalPokemon() {
    return mTypicalPokemon;
  }

  public void setTypicalPokemon(TypicalPokemon mTypicalPokemon) {
    this.mTypicalPokemon = mTypicalPokemon;
  }

  @Override
  public String toString() {
    return "Pokemon{" +
        "mType=" + mType +
        ", mTypicalPokemon=" + mTypicalPokemon +
        '}';
  }
}
