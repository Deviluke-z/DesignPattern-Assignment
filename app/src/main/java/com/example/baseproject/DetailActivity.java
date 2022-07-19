package com.example.baseproject;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.baseproject.model.Pokemon;
import com.example.baseproject.singleton.PokemonSingleton;

public class DetailActivity extends AppCompatActivity {

  ImageView ivPokemon;
  TextView tvPokemonName, tvPokemonType;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.detail_layout);

    ivPokemon = findViewById(R.id.ivPokemon);
    tvPokemonName = findViewById(R.id.tvPokemonName);
    tvPokemonType = findViewById(R.id.tvPokemonType);

    Pokemon pokemon = PokemonSingleton.getInstance().getPokemon();

    tvPokemonName.setText(pokemon.getTypicalPokemon().getPokemonName());
    tvPokemonType.setText(pokemon.getType().toString());
    ivPokemon.setImageDrawable(getResources().getDrawable(pokemon.getTypicalPokemon().getImage()));
  }
}
