package com.mecaiskitronic.curriculum.fragments.principals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mecaiskitronic.curriculum.R;


public class Index extends Fragment {

    public static View VISTA;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        VISTA=inflater.inflate(R.layout.fragment_index, container, false);
        return VISTA;
    }
}
