package com.luciarigoni.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Pokedex extends AppCompatActivity {

    ListView listViewPokemon;
    ArrayList<String> arrayListPokemon = new ArrayList<>();
    ArrayList<Integer> arrayListPokeminMiniaturas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);

        getSupportActionBar().hide();

        listViewPokemon = findViewById(R.id.listViewPokemon);

        arrayListPokemon.add("Pikachu");
        arrayListPokemon.add("Bulbassauro");
        arrayListPokemon.add("Charmander");
        arrayListPokemon.add("Squirtle");

        arrayListPokeminMiniaturas.add(R.drawable.pikachu);
        arrayListPokeminMiniaturas.add(R.drawable.bulbassauro);
        arrayListPokeminMiniaturas.add(R.drawable.charmander);
        arrayListPokeminMiniaturas.add(R.drawable.squirtle);

        CustomListAdapterPokemon adapter = new CustomListAdapterPokemon(this, arrayListPokemon, arrayListPokeminMiniaturas);

        listViewPokemon.setAdapter(adapter);

        listViewPokemon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Pokedex.this, arrayListPokemon.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}