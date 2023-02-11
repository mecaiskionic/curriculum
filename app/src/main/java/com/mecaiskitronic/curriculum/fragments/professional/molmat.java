package com.mecaiskitronic.curriculum.fragments.professional;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.mecaiskitronic.curriculum.DocumentosActivity;
import com.mecaiskitronic.curriculum.FotosActivity;
import com.mecaiskitronic.curriculum.R;
import com.mecaiskitronic.curriculum.VideosActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class molmat extends Fragment {

    ImageButton botonFoto,botonVideo,botonDocumentos;
    int IdVisor;
    int NumeroDeImagenes;

    public molmat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_molmat, container, false);

        botonFoto=(ImageButton)vista.findViewById(R.id.FotosMolmat);
        botonVideo=(ImageButton) vista.findViewById(R.id.VideosMolmat);
        botonDocumentos=(ImageButton) vista.findViewById(R.id.DocumentosMolmat);

        botonFoto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=5;
                NumeroDeImagenes=11;
                Intent in=new Intent(getContext(), FotosActivity.class);
                in.putExtra("id",IdVisor);
                in.putExtra("cantidad",NumeroDeImagenes);
                startActivity(in);

            }
        });
        botonDocumentos.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=6;
                NumeroDeImagenes=2;
                Intent in=new Intent(getContext(), DocumentosActivity.class);
                in.putExtra("id",IdVisor);
                in.putExtra("cantidad",NumeroDeImagenes);
                startActivity(in);

            }
        });
        botonVideo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=8;

                Intent in=new Intent(getContext(), VideosActivity.class);
                in.putExtra("id",IdVisor);
                in.putExtra("cantidad",NumeroDeImagenes);
                startActivity(in);

            }
        });

        return vista;
    }
}
