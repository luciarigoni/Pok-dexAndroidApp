package com.luciarigoni.pokedex;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapterPokemon extends ArrayAdapter<String> {

    private final Activity context;
    private final ArrayList<String> arrayListPokemon;
    private final ArrayList<Integer> arrayListPokemonMiniaturas;

    public CustomListAdapterPokemon(Activity context, ArrayList<String> arrayListPokemon, ArrayList<Integer> arrayListPokemonMiniaturas) {
        super(context, R.layout.list_view_custom_row, arrayListPokemon);

        this.context = context;
        this.arrayListPokemon = arrayListPokemon;
        this.arrayListPokemonMiniaturas = arrayListPokemonMiniaturas;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_view_custom_row, null, true);

        TextView txt_nome_pokemon = rowView.findViewById(R.id.nomePokemon);
        ImageView img_imagem_pokemon = rowView.findViewById(R.id.imageMiniatura);

        txt_nome_pokemon.setText(arrayListPokemon.get(position));
        img_imagem_pokemon.setImageResource(arrayListPokemonMiniaturas.get(position));
        return rowView;
    }
}
