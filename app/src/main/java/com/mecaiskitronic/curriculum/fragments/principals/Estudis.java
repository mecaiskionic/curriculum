package com.mecaiskitronic.curriculum.fragments.principals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mecaiskitronic.curriculum.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Estudis extends Fragment {

    public static View VISTA;

    public Estudis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        VISTA=inflater.inflate(R.layout.fragment_estudis, container, false);
        return VISTA;
    }
}
