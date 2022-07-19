package com.example.baseproject.builder;

import com.example.baseproject.R;
import com.example.baseproject.model.TypicalPokemon;
import com.example.baseproject.model.Pokemon;
import com.example.baseproject.model.Type;

public class PokemonBuilder implements Builder {
  private Type type;
  private TypicalPokemon typicalPokemon;

  @Override
  public Pokemon build() {
    TypicalPokemon typicalPokemon = new TypicalPokemon();

    switch (type) {
      case GRASS:
        typicalPokemon.setImage(R.drawable.grass_pkm);
        typicalPokemon.setPokemonName("Chikorita");
        break;
      case FIRE:
        typicalPokemon.setImage(R.drawable.fire_pkm);
        typicalPokemon.setPokemonName("Cyndaquil");
        break;
      case WATER:
        typicalPokemon.setImage(R.drawable.water_pkm);
        typicalPokemon.setPokemonName("Totodile");
        break;
      case ELECTRIC:
        typicalPokemon.setImage(R.drawable.elec_pkm);
        typicalPokemon.setPokemonName("Pikachu");
        break;
      case GHOST:
        typicalPokemon.setImage(R.drawable.ghost_pkm);
        typicalPokemon.setPokemonName("Misdreavus");
        break;
      case PSYCHIC:
        typicalPokemon.setImage(R.drawable.psy_pkm);
        typicalPokemon.setPokemonName("Mewtwo");
        break;
      case FIGHTING:
        typicalPokemon.setImage(R.drawable.fight_pkm);
        typicalPokemon.setPokemonName("Hitmonchan");
        break;
    }

    Pokemon pokemon = new Pokemon(type, typicalPokemon);

    return pokemon;
  }

  public Type getType() {
    return type;
  }

  @Override
  public void setType(Type type) {
    this.type = type;
  }

  public TypicalPokemon getTypicalPokemon() {
    return typicalPokemon;
  }

  @Override
  public void setTypicalPokemon(TypicalPokemon typicalPokemon) {
    this.typicalPokemon = typicalPokemon;
  }


}
