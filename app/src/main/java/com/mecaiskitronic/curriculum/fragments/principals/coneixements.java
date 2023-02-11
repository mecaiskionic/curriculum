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
public class coneixements extends Fragment {

    public static View VISTA;

    private ArrayList<Carta> listaCartas;;
    private RecyclerView listado;

    public coneixements() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        VISTA=inflater.inflate(R.layout.fragment_coneixements, container, false);


        listaCartas= new ArrayList<>();
        listado=(RecyclerView)VISTA.findViewById(R.id.llistaConeixements);
        listado.setLayoutManager(new GridLayoutManager(getContext(),2));
        
        LlenarInfo();

        AdaptadorCards adaptador=new AdaptadorCards(listaCartas);
        listado.setAdapter(adaptador);
        return VISTA;
    }

    private void LlenarInfo() {

        listaCartas.add(new Carta(getString(R.string.cad),getString(R.string.Dcad)));
        listaCartas.add(new Carta(getString(R.string.llenguatges),getString(R.string.Dllenguatges)));
        listaCartas.add(new Carta(getString(R.string.cam),getString(R.string.Dcam)));
        listaCartas.add(new Carta(getString(R.string.idiomes),getString(R.string.Didiomes)));
        listaCartas.add(new Carta(getString(R.string.fresa),getString(R.string.Dfresa)));
        listaCartas.add(new Carta(getString(R.string.torn),getString(R.string.Dtorn)));
        listaCartas.add(new Carta(getString(R.string.programes),getString(R.string.Dprogrames)));
        listaCartas.add(new Carta(getString(R.string.complementaries),getString(R.string.Dcomplementaries)));
    }
}
