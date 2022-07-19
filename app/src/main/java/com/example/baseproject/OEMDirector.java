package com.example.baseproject;

import com.example.baseproject.builder.Builder;
import com.example.baseproject.builder.PokemonBuilder;
import com.example.baseproject.model.Pokemon;
import com.example.baseproject.model.Type;
import com.example.baseproject.model.TypicalPokemon;

public class OEMDirector {
  public void createGrassPokemon(Builder builder) {
    builder.setType(Type.GRASS);
  }

  public void createFirePokemon(Builder builder) {
    builder.setType(Type.FIRE);
  }

  public void createWaterPokemon(Builder builder) {
    builder.setType(Type.WATER);
  }

  public void createElectricPokemon(Builder builder) {
    builder.setType(Type.ELECTRIC);
  }

  public void createGhostPokemon(Builder builder) {
    builder.setType(Type.GHOST);
  }

  public void createPsychicPokemon(Builder builder) {
    builder.setType(Type.PSYCHIC);
  }

  public void createFightingPokemon(Builder builder) {
    builder.setType(Type.FIGHTING);
  }

  public Pokemon process(Builder builder) {


    return builder.build();
  }
}
