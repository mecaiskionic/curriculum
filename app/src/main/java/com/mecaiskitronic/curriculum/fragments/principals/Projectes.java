package com.mecaiskitronic.curriculum.fragments.principals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mecaiskitronic.curriculum.AdaptadorCards;
import com.mecaiskitronic.curriculum.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Projectes extends Fragment {

    public static View VISTA;

    private ArrayList<Carta> listaCartas;
    private RecyclerView listado;

    public Projectes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        VISTA=inflater.inflate(R.layout.fragment_projectes, container, false);


        listaCartas= new ArrayList<>();
        listado=(RecyclerView)VISTA.findViewById(R.id.llistaProjectes);
        listado.setLayoutManager(new GridLayoutManager(getContext(),1));

        LlenarInfo();

        AdaptadorCards adaptador=new AdaptadorCards(listaCartas);
        listado.setAdapter(adaptador);
        return VISTA;
    }

    private void LlenarInfo() {

        listaCartas.add(new Carta(getString(R.string.IA_gestio),getString(R.string.DIA)));
        listaCartas.add(new Carta(getString(R.string.os),getString(R.string.Dos)));
        listaCartas.add(new Carta(getString(R.string.aplicacio),getString(R.string.Daplicacio)));
        listaCartas.add(new Carta(getString(R.string.composicio),getString(R.string.Dcomposicio)));
        listaCartas.add(new Carta(getString(R.string.Maquina),getString(R.string.Dcnc)));


    }
}
