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
public class proto_tech extends Fragment {

    ImageButton botonFoto;
    int IdVisor;
    int NumeroDeImagenes;

    public proto_tech() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_proto_tech, container, false);

        botonFoto=(ImageButton)vista.findViewById(R.id.FotosProto);


        botonFoto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdVisor=4;
                NumeroDeImagenes=3;
                Intent in=new Intent(getContext(), FotosActivity.class);
                in.putExtra("id",IdVisor);
                in.putExtra("cantidad",NumeroDeImagenes);
                startActivity(in);

            }
        });

        return vista;
    }
}
