package com.mecaiskitronic.curriculum.fragments.principals;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mecaiskitronic.curriculum.R;
import com.mecaiskitronic.curriculum.fragments.professional.altres;
import com.mecaiskitronic.curriculum.fragments.professional.canela;
import com.mecaiskitronic.curriculum.fragments.professional.goro;
import com.mecaiskitronic.curriculum.fragments.professional.molmat;
import com.mecaiskitronic.curriculum.fragments.professional.multivac;
import com.mecaiskitronic.curriculum.fragments.professional.proto_tech;


/**
 * A simple {@link Fragment} subclass.
 */
public class Professional extends Fragment {

    public static View VISTA;
    private final int BOTO[]={R.id.botogoro,R.id.botoaltres,R.id.botocanela,R.id.botomultivac,R.id.botoproto,R.id.botomolmat};
    Fragment fragmentos[];
    private TextView textoAviso;
    private View marco;



    public Professional() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        VISTA=inflater.inflate(R.layout.fragment_professional, container, false);

        textoAviso=VISTA.findViewById(R.id.texto_aviso);
        marco=VISTA.findViewById(R.id.marco_aviso);

        fragmentos=new Fragment[6];
        fragmentos[0]=new goro();
        fragmentos[1]=new altres();
        fragmentos[2]=new canela();
        fragmentos[3]=new multivac();
        fragmentos[4]=new proto_tech();
        fragmentos[5]=new molmat();

        Button losBotones;
        for (int i=0; i<BOTO.length;i++){
            losBotones=(Button) VISTA.findViewById(BOTO[i]);
            final int queBoton=i;

            losBotones.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {


                    FragmentManager mimanejador=getFragmentManager();
                    FragmentTransaction mitransaccion=mimanejador.beginTransaction();
                    mitransaccion.replace(R.id.explicacio,fragmentos[queBoton]);
                    mitransaccion.commit();
                    marco.setAlpha(0);
                    textoAviso.setAlpha(0);

                }
            });
        }

        return VISTA;
    }


}
