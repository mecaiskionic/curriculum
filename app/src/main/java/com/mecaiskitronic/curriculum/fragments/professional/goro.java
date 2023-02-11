package com.mecaiskitronic.curriculum.fragments.professional;

import android.annotation.SuppressLint;
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
import com.mecaiskitronic.curriculum.VideosActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class goro extends Fragment{

    ImageButton botonFoto,botonVideo;
    int IdVisor;
    int NumeroDeImagenes;
    public static View VISTA;

    public goro() {
        // Required empty public constructor
    }


    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        VISTA=inflater.inflate(R.layout.fragment_goro, container, false);


        botonFoto=(ImageButton)VISTA.findViewById(R.id.FotosGoro);
        botonVideo=(ImageButton) VISTA.findViewById(R.id.VideGoro);

        botonFoto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=0;
                NumeroDeImagenes=5;
                Intent in=new Intent(getContext(),FotosActivity.class);
                in.putExtra("id",IdVisor);
                in.putExtra("cantidad",NumeroDeImagenes);
                startActivity(in);

            }
        });
        botonVideo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=7;

                Intent in=new Intent(getContext(), VideosActivity.class);
                in.putExtra("id",IdVisor);
                in.putExtra("cantidad",NumeroDeImagenes);
                startActivity(in);

            }
        });

        return VISTA;
    }

}
