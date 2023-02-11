package com.mecaiskitronic.curriculum.fragments.professional;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.mecaiskitronic.curriculum.FotosActivity;
import com.mecaiskitronic.curriculum.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class canela extends Fragment{

    ImageButton botonFoto;
    int IdVisor;
    int NumeroDeImagenes;

    public canela() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_canela, container, false);


        botonFoto=(ImageButton)vista.findViewById(R.id.FotosCanela);


        botonFoto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=2;
                NumeroDeImagenes=1;
                Intent in=new Intent(getContext(),FotosActivity.class);
                in.putExtra("id",IdVisor);
                in.putExtra("cantidad",NumeroDeImagenes);
                startActivity(in);

            }
        });

        return vista;
    }

}
