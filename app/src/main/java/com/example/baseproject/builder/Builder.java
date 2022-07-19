package com.example.baseproject.builder;

import com.example.baseproject.model.TypicalPokemon;
import com.example.baseproject.model.Pokemon;
import com.example.baseproject.model.Type;

public interface Builder {
  void setType(Type type);
  void setTypicalPokemon(TypicalPokemon typicalPokemon);
  Pokemon build();
}
