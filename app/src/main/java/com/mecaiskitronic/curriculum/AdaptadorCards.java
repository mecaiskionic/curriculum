package com.mecaiskitronic.curriculum;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mecaiskitronic.curriculum.fragments.principals.Carta;

import java.util.ArrayList;

public class AdaptadorCards extends RecyclerView.Adapter<AdaptadorCards.ViewHolderCards> {

    ArrayList<Carta> listaCartas;

    public AdaptadorCards(ArrayList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    @Override
    public ViewHolderCards onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderCards(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCards holder, int position) {

        holder.capsalera.setText(listaCartas.get(position).getTitul());
        holder.dada.setText(listaCartas.get(position).getDescripcio());

    }

    @Override
    public int getItemCount() {
        return listaCartas.size();
    }

    public class ViewHolderCards extends RecyclerView.ViewHolder {

        TextView capsalera, dada;
        public ViewHolderCards(@NonNull View itemView) {

            super(itemView);
            capsalera=itemView.findViewById(R.id.titulConeixement);
            dada=itemView.findViewById(R.id.coneixementsList);
        }


    }
}
