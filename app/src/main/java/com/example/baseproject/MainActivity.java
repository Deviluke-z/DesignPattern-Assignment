package com.example.baseproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baseproject.builder.Builder;
import com.example.baseproject.builder.PokemonBuilder;
import com.example.baseproject.singleton.PokemonSingleton;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "Debug";

  Spinner spType;
  Button btnGenerate;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    spType = findViewById(R.id.spType);
    btnGenerate = findViewById(R.id.btnGenerate);

    // spinner 1
    ArrayAdapter<CharSequence> mSpinnerAdapter = ArrayAdapter.createFromResource(
        this,
        R.array.type_spinner,
        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
    );
    mSpinnerAdapter.setDropDownViewResource(
        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
    spType.setAdapter(mSpinnerAdapter);

    btnGenerate.setOnClickListener(v -> {
      generatePokemon();
      Intent intent = new Intent(this, DetailActivity.class);
      startActivity(intent);
    });
  }

  private void generatePokemon() {
    Builder builder = new PokemonBuilder();
    OEMDirector oemDirector = new OEMDirector();

    switch (spType.getSelectedItem().toString()) {
      case "Grass":
        oemDirector.createGrassPokemon(builder);
        break;
      case "Fire":
        oemDirector.createFirePokemon(builder);
        break;
      case "Water":
        oemDirector.createWaterPokemon(builder);
        break;
      case "Electric":
        oemDirector.createElectricPokemon(builder);
        break;
      case "Ghost":
        oemDirector.createGhostPokemon(builder);
        break;
      case "Psychic":
        oemDirector.createPsychicPokemon(builder);
        break;
      case "Fighting":
        oemDirector.createFightingPokemon(builder);
        break;
    }

    PokemonSingleton.getInstance().setPokemon(oemDirector.process(builder));
    Log.d(TAG, "" + oemDirector.process(builder));
  }
}